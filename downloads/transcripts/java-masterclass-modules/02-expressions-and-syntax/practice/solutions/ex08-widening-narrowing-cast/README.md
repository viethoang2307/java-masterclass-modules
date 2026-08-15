# Lời giải EX08 — Widening và narrowing cast

Difficulty: Hard
Coverage: widening, explicit cast, data loss

## Hướng giải

Widening int-to-long giữ giá trị. Narrowing int-to-byte cần cast và có thể wrap theo biểu diễn 8-bit signed.

## Lưu ý

Cast không validate range. Trong code nghiệp vụ, kiểm tra range trước narrowing.

## Độ phức tạp

O(1).

## Kiểm tra

~~~powershell
javac --release 17 Main.java SelfCheck.java
java SelfCheck
~~~

Kết quả: PASS - EX08.

