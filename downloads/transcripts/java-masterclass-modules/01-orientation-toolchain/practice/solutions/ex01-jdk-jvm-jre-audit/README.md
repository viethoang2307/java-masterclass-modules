# Lời giải EX01 — Audit JDK, JVM và JRE

Difficulty: Medium
Coverage: JDK/JVM/JRE, java, javac

## Hướng tư duy

Chạy lệnh kiểm tra runtime và compiler; giải thích JDK cung cấp compiler/tool, JVM thực thi bytecode và runtime cung cấp thư viện cùng môi trường chạy.

Kết luận chuẩn:

~~~text
JDK=compile+tools; JVM=execute-bytecode; runtime=run+libraries
~~~

Reference answer mô tả invariant của bài. Version, path và output thật phải lấy từ máy đang kiểm tra.

## Kiểm tra

~~~powershell
javac --release 17 Main.java SelfCheck.java
java SelfCheck
~~~

Kết quả: PASS - EX01.

