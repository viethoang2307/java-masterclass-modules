# Lời giải EX02 — Đối chiếu java và javac

Difficulty: Medium
Coverage: version alignment, PATH

## Hướng tư duy

Thu thập version và executable path của cả hai lệnh; kết luận chúng có cùng major version và cùng JDK hay không.

Kết luận chuẩn:

~~~text
java-major == javac-major; paths belong to intended JDK
~~~

Reference answer mô tả invariant của bài. Version, path và output thật phải lấy từ máy đang kiểm tra.

## Kiểm tra

~~~powershell
javac --release 17 Main.java SelfCheck.java
java SelfCheck
~~~

Kết quả: PASS - EX02.

