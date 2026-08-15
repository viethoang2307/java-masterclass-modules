# Lời giải EX08 — Sửa Project SDK và Run Configuration

Difficulty: Hard
Coverage: IntelliJ Project SDK, module SDK, run configuration

## Hướng tư duy

Kiểm tra Project SDK, language level, module SDK và main class; lập bảng giá trị trước/sau khi sửa.

Kết luận chuẩn:

~~~text
Project SDK, language level, module SDK and run target must agree
~~~

Version, path và output thật phải lấy từ máy đang kiểm tra; không sao chép output mẫu.

## Kiểm tra

~~~powershell
javac --release 17 Main.java SelfCheck.java
java SelfCheck
~~~

Kết quả: PASS - EX08.

