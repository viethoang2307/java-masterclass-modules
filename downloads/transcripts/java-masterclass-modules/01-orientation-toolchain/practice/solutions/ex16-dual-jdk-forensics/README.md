# Lời giải EX16 — Điều tra xung đột hai JDK

Difficulty: Very Hard
Coverage: multiple JDKs, PATH order, IDE/CLI drift

## Hướng tư duy

Lập inventory mọi executable, PATH, JAVA_HOME và IDE SDK; xác định nguồn mỗi version và đề xuất cấu hình ổn định có thể rollback.

Kết luận chuẩn:

~~~text
inventory every resolution path before changing PATH or IDE settings
~~~

Version, path và output thật phải lấy từ máy đang kiểm tra; không sao chép output mẫu.

## Kiểm tra

~~~powershell
javac --release 17 Main.java SelfCheck.java
java SelfCheck
~~~

Kết quả: PASS - EX16.

