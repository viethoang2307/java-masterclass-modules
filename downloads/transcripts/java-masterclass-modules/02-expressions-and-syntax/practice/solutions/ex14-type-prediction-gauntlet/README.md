# Lời giải EX14 — Type-prediction gauntlet

Difficulty: Very Hard
Coverage: expression type, promotion, cast, concatenation order

## Hướng giải

Phép nhân chạy trước phép cộng; cast trước phép chia tạo double; khi đã gặp String, dấu cộng nối chuỗi từ trái sang phải.

## Lưu ý

Type label là kiến thức compile-time; Java không tự expose expression type của primitive, nên bài ghi label theo phân tích.

## Độ phức tạp

O(1).

## Kiểm tra

~~~powershell
javac --release 17 Main.java SelfCheck.java
java SelfCheck
~~~

Kết quả: PASS - EX14.

