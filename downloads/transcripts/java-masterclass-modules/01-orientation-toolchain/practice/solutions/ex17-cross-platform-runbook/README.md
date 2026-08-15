# Lời giải EX17 — Runbook setup đa nền tảng

Difficulty: Very Hard
Coverage: Windows/macOS/Linux setup concepts

## Hướng tư duy

Viết phần chung và nhánh OS-specific cho install, environment variables, verification, JShell và IntelliJ; không giả định shell giống nhau.

Kết luận chuẩn:

~~~text
share verification goals; isolate OS-specific installation and shell commands
~~~

Version, path và output thật phải lấy từ máy đang kiểm tra; không sao chép output mẫu.

## Kiểm tra

~~~powershell
javac --release 17 Main.java SelfCheck.java
java SelfCheck
~~~

Kết quả: PASS - EX17.

