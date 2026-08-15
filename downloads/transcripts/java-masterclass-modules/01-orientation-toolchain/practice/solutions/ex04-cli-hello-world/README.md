# Lời giải EX04 — Compile và chạy Hello World bằng CLI

Difficulty: Medium
Coverage: source, javac, bytecode, java launcher

## Hướng tư duy

Tạo HelloWorld.java, compile bằng javac, xác nhận file .class và chạy bằng java từ đúng working directory.

Kết luận chuẩn:

~~~text
source -> javac -> bytecode -> java launcher -> JVM
~~~

Reference answer mô tả invariant của bài. Version, path và output thật phải lấy từ máy đang kiểm tra.

## Kiểm tra

~~~powershell
javac --release 17 Main.java SelfCheck.java
java SelfCheck
~~~

Kết quả: PASS - EX04.

