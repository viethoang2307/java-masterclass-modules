$ErrorActionPreference = "Stop"

$solutionRoot = Join-Path $PSScriptRoot "solutions"
$failed = New-Object System.Collections.Generic.List[string]
$passed = 0
$directories = Get-ChildItem -LiteralPath $solutionRoot -Directory | Sort-Object Name

if ($directories.Count -ne 20) {
    throw "Expected 20 solution directories, found $($directories.Count)"
}

foreach ($directory in $directories) {
    $outputDirectory = Join-Path ([System.IO.Path]::GetTempPath()) ("java-module03-" + [guid]::NewGuid().ToString("N"))
    New-Item -ItemType Directory -Path $outputDirectory | Out-Null
    $mainFile = Join-Path $directory.FullName "Main.java"
    $checkFile = Join-Path $directory.FullName "SelfCheck.java"

    & javac --release 17 -d $outputDirectory $mainFile $checkFile
    if ($LASTEXITCODE -ne 0) {
        $failed.Add("$($directory.Name): compile failed")
        Remove-Item -LiteralPath $outputDirectory -Recurse -Force
        continue
    }

    $runOutput = & java -cp $outputDirectory SelfCheck 2>&1
    if ($LASTEXITCODE -ne 0 -or ($runOutput -notmatch "PASS")) {
        $failed.Add("$($directory.Name): self-check failed: $runOutput")
    } else {
        $passed++
    }

    Remove-Item -LiteralPath $outputDirectory -Recurse -Force
}

Write-Output "PASS=$passed TOTAL=$($directories.Count)"
if ($failed.Count -gt 0) {
    $failed | ForEach-Object { Write-Error $_ }
    exit 1
}

