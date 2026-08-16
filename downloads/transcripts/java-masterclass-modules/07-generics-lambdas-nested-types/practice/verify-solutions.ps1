$ErrorActionPreference = "Stop"
$root = Join-Path $PSScriptRoot "solutions"
$tempRoot = Join-Path ([System.IO.Path]::GetTempPath()) ("module07-" + [guid]::NewGuid())
$passed = 0
$failed = 0

New-Item -ItemType Directory -Path $tempRoot | Out-Null
try {
    Get-ChildItem $root -Directory | Sort-Object Name | ForEach-Object {
        $work = Join-Path $tempRoot $_.Name
        New-Item -ItemType Directory -Path $work | Out-Null
        Copy-Item (Join-Path $_.FullName "Main.java") $work
        Copy-Item (Join-Path $_.FullName "SelfCheck.java") $work
        Push-Location $work
        try {
            $compile = & javac --release 17 Main.java SelfCheck.java 2>&1
            if ($LASTEXITCODE -ne 0) { throw "compile failed: $compile" }
            $result = & java SelfCheck 2>&1
            if ($LASTEXITCODE -ne 0 -or $result -notcontains "PASS") { throw "self-check failed: $result" }
            Write-Host "PASS $($_.Name)"
            $passed++
        } catch {
            Write-Host "FAIL $($_.Name): $($_.Exception.Message)" -ForegroundColor Red
            $failed++
        } finally {
            Pop-Location
        }
    }
} finally {
    Remove-Item -LiteralPath $tempRoot -Recurse -Force
}

Write-Host "Summary: PASS=$passed FAIL=$failed"
if ($failed -gt 0) { exit 1 }
