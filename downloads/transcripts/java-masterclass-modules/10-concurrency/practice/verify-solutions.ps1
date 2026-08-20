$ErrorActionPreference = 'Stop'
$root = Split-Path -Parent $MyInvocation.MyCommand.Path
$solutionRoot = Join-Path $root 'solutions'
$pass = 0
$fail = 0

Get-ChildItem -LiteralPath $solutionRoot -Directory | Sort-Object Name | ForEach-Object {
    $dir = $_.FullName
    $name = $_.Name
    Push-Location $dir
    try {
        Get-ChildItem -Path $dir -Recurse -File -Filter '*.class' | Remove-Item -Force -ErrorAction SilentlyContinue
        & javac --release 17 Main.java SelfCheck.java
        if ($LASTEXITCODE -ne 0) { throw "compile failed" }
        $output = & java SelfCheck 2>&1
        if ($LASTEXITCODE -ne 0 -or ($output -notmatch 'PASS')) { throw ($output -join [Environment]::NewLine) }
        Write-Output "PASS $name"
        $pass++
    } catch {
        Write-Output "FAIL $name : $($_.Exception.Message)"
        $fail++
    } finally {
        Get-ChildItem -Path $dir -Recurse -File -Filter '*.class' | Remove-Item -Force -ErrorAction SilentlyContinue
        Pop-Location
    }
}
Write-Output "Summary: PASS=$pass FAIL=$fail"
if ($fail -ne 0) { exit 1 }
