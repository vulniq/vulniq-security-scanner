$Item = Get-Item 'pathToBeReplaced';
Write-Host Creation Time:  $Item.CreationTimeUtc.ToFileTimeUtc();
Write-Host Last Access Time:  $Item.LastAccessTimeUtc.ToFileTimeUtc();
Write-Host Last Write Time:  $Item.LastWriteTimeUtc.ToFileTimeUtc();
$ItemVersion = [System.Diagnostics.FileVersionInfo]::GetVersionInfo('pathToBeReplaced'); 
Write-Host Company Name: $ItemVersion.CompanyName;
Write-Host Language: $ItemVersion.Language;
Write-Host Original Filename: $ItemVersion.OriginalFilename;
Write-Host Internal Name: $ItemVersion.InternalName;
Write-Host Product Name: $ItemVersion.ProductName;
Write-Host File Version: $ItemVersion.FileVersion;
Write-Host Product Version: $ItemVersion.ProductVersion;

$Acl = (Get-Acl 'pathToBeReplaced').Owner;
Write-Host Owner: $Acl;
Write-Host Size: $Item.Length;
$Attributes = (Get-ChildItem 'pathToBeReplaced').Attributes;
Write-Host Attributes: $Attributes;