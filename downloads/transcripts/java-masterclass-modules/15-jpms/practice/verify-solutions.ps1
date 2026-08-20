$ErrorActionPreference = 'Stop'
$root = Split-Path -Parent $MyInvocation.MyCommand.Path
$solutionRoot = Join-Path $root 'solutions'
$passed = 0
$failed = 0

foreach ($dir in Get-ChildItem -LiteralPath $solutionRoot -Directory | Sort-Object Name) {
    Push-Location $dir.FullName
    try {
        Get-ChildItem -File -Filter '*.class' | Remove-Item -Force -ErrorAction SilentlyContinue
        & javac --release 17 Main.java SelfCheck.java
        if ($LASTEXITCODE -ne 0) { throw "javac failed" }
        $output = & java SelfCheck
        if ($LASTEXITCODE -ne 0 -or ($output -notcontains 'PASS')) { throw "SelfCheck failed: $output" }
        Write-Output "PASS $($dir.Name)"
        $passed++
    } catch {
        Write-Output "FAIL $($dir.Name): $($_.Exception.Message)"
        $failed++
    } finally {
        Get-ChildItem -Path $dir.FullName -Recurse -File -Filter '*.class' | Remove-Item -Force -ErrorAction SilentlyContinue
        Pop-Location
    }
}

Write-Output "Summary: PASS=$passed FAIL=$failed"
if ($failed -gt 0) { exit 1 }
