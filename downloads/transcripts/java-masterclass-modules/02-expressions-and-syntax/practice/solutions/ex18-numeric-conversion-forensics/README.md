# Lời giải EX18 — Numeric-conversion forensic lab

Difficulty: Extreme
Coverage: promotion, widening, narrowing, overflow, long arithmetic

## Hướng giải

byte/short được promote lên int trong arithmetic. int-to-long là widening. int-to-byte là narrowing và 130 wrap thành -126.

## Lưu ý

Giữ intermediate đủ rộng; chỉ cast ở boundary và chỉ khi range đã được chứng minh.

## Độ phức tạp

O(1).

## Kiểm tra

~~~powershell
javac --release 17 Main.java SelfCheck.java
java SelfCheck
~~~

Kết quả: PASS - EX18.

