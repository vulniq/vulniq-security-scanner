$Source =  @"
using System;
using System.Diagnostics;
using System.Runtime.InteropServices;

public static class Imagehlp
{
    [DllImport("imagehlp.dll", CharSet = CharSet.Auto)]
    public static extern int MapFileAndCheckSum(string Filename, out int HeaderSum, out int CheckSum);
}
"@
Add-Type -TypeDefinition $Source

[int] $headerSum = 0;
[int] $checkSum = 0;
$result = [Imagehlp]::MapFileAndCheckSum(
    "pathToBeReplaced",
    [ref] $headerSum,
    [ref] $checkSum
    )

 if ($result -ne 0) {
    Write-Output error
    }
    else{
        $checkSum
    }