param([String] $scriptPath,[String] $filePath, [String] $targetName)
$scriptOriginal = Get-Content $scriptPath -Raw

$scriptreplaced = $scriptOriginal.Replace("pathToBeReplaced", $filePath) 

$bytes = [System.Text.Encoding]::Unicode.GetBytes($scriptreplaced)

$encodedCommand = [Convert]::ToBase64String($bytes)

docker exec $targetName  powershell -encodedcommand $encodedCommand 