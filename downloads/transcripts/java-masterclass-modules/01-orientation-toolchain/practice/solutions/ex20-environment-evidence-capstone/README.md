# Lời giải EX20 — Capstone Environment Evidence Pack

Difficulty: Extreme
Coverage: JDK, JShell, CLI, IDE, study workflow, support

## Hướng tư duy

Tổng hợp version/path, JShell transcript, CLI compile/run, IDE parity, glossary, study loop, MRE mẫu và escalation checklist.

Kết luận chuẩn:

~~~text
evidence must prove toolchain, workflow, reproducibility and support readiness
~~~

Version, path và output thật phải lấy từ máy đang kiểm tra; không sao chép output mẫu.

## Kiểm tra

~~~powershell
javac --release 17 Main.java SelfCheck.java
java SelfCheck
~~~

Kết quả: PASS - EX20.

