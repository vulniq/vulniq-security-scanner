$infos = Get-ChildItem -ErrorAction SilentlyContinue HKLM:\Software\Microsoft\Windows\CurrentVersion\Uninstall\ | 
ForEach-Object {Get-ItemProperty -ErrorAction SilentlyContinue $_.PsPath | 
Select-Object DisplayName,Publisher, DisplayVersion, InstallDate | ConvertTo-Json}

$infos += Get-ChildItem -ErrorAction SilentlyContinue HKLM:\Software\Wow6432Node\Microsoft\Windows\CurrentVersion\Uninstall\ | 
ForEach-Object {Get-ItemProperty -ErrorAction SilentlyContinue $_.PsPath | 
Select-Object DisplayName,Publisher, DisplayVersion, InstallDate | ConvertTo-Json}

$infos += Get-ChildItem -ErrorAction SilentlyContinue HKCU:\Software\Microsoft\Windows\CurrentVersion\Uninstall\ | 
ForEach-Object {Get-ItemProperty -ErrorAction SilentlyContinue $_.PsPath | 
Select-Object DisplayName,Publisher, DisplayVersion, InstallDate | ConvertTo-Json}

$users = (Get-ChildItem Registry::HKEY_USERS\).PsPath | ForEach-Object{$_.ToString()+"\Software\Microsoft\Windows\CurrentVersion\Uninstall\"}

$infos += ForEach-Object {$users | Get-ItemProperty -ErrorAction SilentlyContinue | Select-Object DisplayName,Publisher, DisplayVersion, InstallDate | ConvertTo-Json}

$infos