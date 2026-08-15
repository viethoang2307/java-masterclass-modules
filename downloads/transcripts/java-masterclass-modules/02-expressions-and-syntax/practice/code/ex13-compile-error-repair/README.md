# EX13 — Compile-error repair pack

Difficulty: Very Hard
Coverage: semicolon, declaration, type compatibility, compiler-first debugging

## Bối cảnh

Starter có nhiều lỗi syntax/type nhỏ và người học phải sửa theo từng compiler diagnostic.

## Yêu cầu

Sửa thiếu semicolon, bảo đảm long literal đúng và giữ String cùng numeric expression hợp lệ; không sửa nhiều nguyên nhân cùng lúc.

Đây là compile-error repair lab: starter cố ý không compile. Đọc lỗi đầu tiên, sửa một nguyên nhân mỗi lượt rồi chạy SelfCheck.

## Chạy bài

~~~powershell
javac --release 17 Main.java SelfCheck.java
java SelfCheck
~~~

Sau khi sửa compile error, kết quả phải là PASS - EX13.

