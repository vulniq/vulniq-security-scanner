param([String] $scriptPath, [String] $targetName)
$scriptOriginal = Get-Content $scriptPath -Raw 

$bytes = [System.Text.Encoding]::Unicode.GetBytes($scriptOriginal)

$encodedCommand = [Convert]::ToBase64String($bytes)

docker exec $targetName  powershell -encodedcommand $encodedCommand 