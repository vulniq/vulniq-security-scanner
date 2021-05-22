Add-Type -TypeDefinition @"
 using System;
 using System.Diagnostics;
 using System.Runtime.InteropServices;
 public static class Kernel32
 {
  public enum FileType : uint
    {
    FileTypeChar = 0x0002,
    FileTypeDisk = 0x0001,
    FileTypePipe = 0x0003,
    FileTypeRemote = 0x8000,
    FileTypeUnknown = 0x0000,
    }
    [DllImport("kernel32.dll")]
   public static extern FileType GetFileType(IntPtr hFile);
 }
"@

$Domain = [AppDomain]::CurrentDomain
$DynAssembly = New-Object System.Reflection.AssemblyName("DynamicAssembly")
$AssemblyBuilder = $Domain.DefineDynamicAssembly($DynAssembly, [System.Reflection.Emit.AssemblyBuilderAccess]::Run)
$ModuleBuilder = $AssemblyBuilder.DefineDynamicModule("DynamicModule", $False)
$TypeBuilder = $ModuleBuilder.DefineType("kernel32", "Public, Class")

# Define the CreateFile Method
$CreateFileMethod = $TypeBuilder.DefineMethod(
     "CreateFile", # Method Name
     [System.Reflection.MethodAttributes] "Public, Static", # Method Attributes
     [IntPtr], # Method Return Type
     [Type[]] @(
          [String], # lpFileName
          [UInt32], # dwDesiredAccess
          [UInt32], # dwShareMode
          [IntPtr], # SecurityAttributes
          [UInt32], # dwCreationDisposition
          [UInt32], # dwFlagsAndAttributes
          [IntPtr] # hTemplateFile
     )
) # Method Parameters

# Import DLL
$CreateFileDllImport = [System.Runtime.InteropServices.DllImportAttribute].GetConstructor(@([String]))

# Define Fields
$CreateFileFieldArray = [System.Reflection.FieldInfo[]] @(
     [System.Runtime.InteropServices.DllImportAttribute].GetField("EntryPoint"),
     [System.Runtime.InteropServices.DllImportAttribute].GetField("PreserveSig"),
     [System.Runtime.InteropServices.DllImportAttribute].GetField("SetLastError"),
     [System.Runtime.InteropServices.DllImportAttribute].GetField("CallingConvention"),
     [System.Runtime.InteropServices.DllImportAttribute].GetField("CharSet")
)

# Define Values for the fields
$CreateFileFieldValueArray = [Object[]] @(
     "CreateFile",
     $True,
     $True,
     [System.Runtime.InteropServices.CallingConvention]::Winapi,
     [System.Runtime.InteropServices.CharSet]::Auto
)

# Create a Custom Attribute and add to our Method
$CreateFileCustomAttribute = New-Object System.Reflection.Emit.CustomAttributeBuilder(
     $CreateFileDllImport,
     @("kernel32.dll"),
     $CreateFileFieldArray,
     $CreateFileFieldValueArray
)
$CreateFileMethod.SetCustomAttribute($CreateFileCustomAttribute)

# Create the Type within our Module
$Kernel32 = $TypeBuilder.CreateType()

# Use the Method
$fileType = [Kernel32]::GetFileType($Kernel32::CreateFile("pathToBeReplaced", [System.IO.FileAccess]::Read, [System.IO.FileShare]::Read, [System.IntPtr]::Zero, [System.IO.FileMode]::Open, [System.UInt32]0x02000000, [System.IntPtr]::Zero ))

$fileType