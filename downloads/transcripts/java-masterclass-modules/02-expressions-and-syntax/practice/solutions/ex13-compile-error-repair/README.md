# Lời giải EX13 — Compile-error repair pack

Difficulty: Very Hard
Coverage: semicolon, declaration, type compatibility, compiler-first debugging

## Hướng giải

Đọc lỗi đầu tiên, sửa semicolon, compile lại rồi kiểm tra literal/type. Lời giải dùng 50_000L để ý định long rõ ràng.

## Lưu ý

Compiler error dây chuyền có thể biến mất sau khi sửa một dòng trước đó; không chạy theo mọi dòng báo lỗi cùng lúc.

## Độ phức tạp

O(1).

## Kiểm tra

~~~powershell
javac --release 17 Main.java SelfCheck.java
java SelfCheck
~~~

Kết quả: PASS - EX13.

