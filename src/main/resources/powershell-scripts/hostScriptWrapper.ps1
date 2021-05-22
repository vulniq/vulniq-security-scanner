param([String] $scriptPath,[String] $filePath)
$scriptOriginal = Get-Content $scriptPath -Raw

$scriptreplaced = $scriptOriginal.Replace("pathToBeReplaced", $filePath) 

$bytes = [System.Text.Encoding]::Unicode.GetBytes($scriptreplaced)

$encodedCommand = [Convert]::ToBase64String($bytes)

powershell -encodedcommand $encodedCommand