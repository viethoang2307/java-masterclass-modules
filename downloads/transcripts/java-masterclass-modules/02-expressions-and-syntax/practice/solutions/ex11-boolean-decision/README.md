# Lời giải EX11 — Boolean expressions và truth table

Difficulty: Hard
Coverage: boolean, logical operators, negation, short-circuit intent

## Hướng giải

Dùng && để kết hợp điều kiện; !locked thể hiện trạng thái không bị khóa. Tên biến tích cực giúp tránh double negative.

## Lưu ý

Không cần viết if dài nếu bài chỉ yêu cầu giá trị boolean; có thể kiểm tra truth table bằng cách đổi từng input.

## Độ phức tạp

O(1).

## Kiểm tra

~~~powershell
javac --release 17 Main.java SelfCheck.java
java SelfCheck
~~~

Kết quả: PASS - EX11.

