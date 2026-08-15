# Lời giải EX03 — Precedence và parentheses

Difficulty: Medium
Coverage: expression, operands, precedence, grouping

## Hướng giải

Multiplication có precedence cao hơn addition. Parentheses ép addition chạy trước ở expression thứ hai.

## Lưu ý

Thêm parentheses khi muốn truyền đạt ý định, kể cả khi compiler đã biết precedence.

## Độ phức tạp

O(1).

## Kiểm tra

~~~powershell
javac --release 17 Main.java SelfCheck.java
java SelfCheck
~~~

Kết quả mong đợi: PASS - EX03.

