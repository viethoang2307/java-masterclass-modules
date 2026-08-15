# Lời giải EX04 — Integer division và remainder

Difficulty: Medium
Coverage: int arithmetic, division, remainder, double division

## Hướng giải

Hai toán hạng int tạo integer division. Toán tử % trả remainder. Khi một toán hạng là double, expression được promote sang double.

## Lưu ý

Đừng sửa 5 / 2 bằng cách ép kết quả sau phép chia; phải promote trước phép chia nếu muốn phần thập phân.

## Độ phức tạp

O(1).

## Kiểm tra

~~~powershell
javac --release 17 Main.java SelfCheck.java
java SelfCheck
~~~

Kết quả mong đợi: PASS - EX04.

