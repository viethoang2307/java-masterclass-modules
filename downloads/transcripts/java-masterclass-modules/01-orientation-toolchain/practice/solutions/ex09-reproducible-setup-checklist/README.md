# Lời giải EX09 — Checklist setup tái lập

Difficulty: Hard
Coverage: installation workflow, verification, evidence

## Hướng tư duy

Viết checklist từ cài JDK đến compile/run smoke test; mỗi bước phải có lệnh kiểm chứng và điều kiện pass/fail.

Kết luận chuẩn:

~~~text
install -> configure -> verify versions -> compile -> run -> record evidence
~~~

Version, path và output thật phải lấy từ máy đang kiểm tra; không sao chép output mẫu.

## Kiểm tra

~~~powershell
javac --release 17 Main.java SelfCheck.java
java SelfCheck
~~~

Kết quả: PASS - EX09.

