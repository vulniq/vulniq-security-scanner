#region Create Win32 API Object
Try {
    [void][advapi32]
} Catch {
    #region Module Builder
    $Domain = [AppDomain]::CurrentDomain
    $DynAssembly = New-Object System.Reflection.AssemblyName('RegAssembly')
    $AssemblyBuilder = $Domain.DefineDynamicAssembly($DynAssembly, [System.Reflection.Emit.AssemblyBuilderAccess]::Run) # Only run in memory
    $ModuleBuilder = $AssemblyBuilder.DefineDynamicModule('RegistryTimeStampModule', $False)
    #endregion Module Builder
  
    #region DllImport
    $TypeBuilder = $ModuleBuilder.DefineType('advapi32', 'Public, Class')
  
    #region RegQueryInfoKey Method
    $PInvokeMethod = $TypeBuilder.DefineMethod(
        'RegQueryInfoKey', #Method Name
        [Reflection.MethodAttributes] 'PrivateScope, Public, Static, HideBySig, PinvokeImpl', #Method Attributes
        [IntPtr], #Method Return Type
        [Type[]] @(
            [Microsoft.Win32.SafeHandles.SafeRegistryHandle], #Registry Handle
            [System.Text.StringBuilder], #Class Name
            [UInt32 ].MakeByRefType(),  #Class Length
            [UInt32], #Reserved
            [UInt32 ].MakeByRefType(), #Subkey Count
            [UInt32 ].MakeByRefType(), #Max Subkey Name Length
            [UInt32 ].MakeByRefType(), #Max Class Length
            [UInt32 ].MakeByRefType(), #Value Count
            [UInt32 ].MakeByRefType(), #Max Value Name Length
            [UInt32 ].MakeByRefType(), #Max Value Name Length
            [UInt32 ].MakeByRefType(), #Security Descriptor Size           
            [long].MakeByRefType() #LastWriteTime
        ) #Method Parameters
    )
  
    $DllImportConstructor = [Runtime.InteropServices.DllImportAttribute].GetConstructor(@([String]))
    $FieldArray = [Reflection.FieldInfo[]] @(       
        [Runtime.InteropServices.DllImportAttribute].GetField('EntryPoint'),
        [Runtime.InteropServices.DllImportAttribute].GetField('SetLastError')
    )
  
    $FieldValueArray = [Object[]] @(
        'RegQueryInfoKey', #CASE SENSITIVE!!
        $True
    )
  
    $SetLastErrorCustomAttribute = New-Object Reflection.Emit.CustomAttributeBuilder(
        $DllImportConstructor,
        @('advapi32.dll'),
        $FieldArray,
        $FieldValueArray
    )
  
    $PInvokeMethod.SetCustomAttribute($SetLastErrorCustomAttribute)
    #endregion RegQueryInfoKey Method
  
    [void]$TypeBuilder.CreateType()
    #endregion DllImport
}
#endregion Create Win32 API object

$RegistryKey = Get-Item "pathToBeReplaced"

#region Constant Variables
$ClassLength = 255
[long]$TimeStamp = $null
#endregion Constant Variables

$ClassName = New-Object System.Text.StringBuilder $RegistryKey.Name
$RegistryHandle = $RegistryKey.Handle


[advapi32]::RegQueryInfoKey(
    $RegistryHandle,
    $ClassName,
    [ref]$ClassLength,
    $Null,
    [ref]$Null,
    [ref]$Null,
    [ref]$Null,
    [ref]$Null,
    [ref]$Null,
    [ref]$Null,
    [ref]$Null,
    [ref]$TimeStamp
)

$TimeStamp
