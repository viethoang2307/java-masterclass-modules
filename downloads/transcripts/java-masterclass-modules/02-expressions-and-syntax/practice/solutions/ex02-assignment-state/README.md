# Lời giải EX02 — Declaration, initialization và assignment

Difficulty: Medium
Coverage: variables, int, assignment, increment

## Hướng giải

Khai báo counter với giá trị đầu, sau đó assignment counter = counter + 5. Không nhầm dấu = với phép so sánh.

## Lưu ý

Local variable phải được khởi tạo trước khi đọc; += là viết tắt hợp lệ nhưng bài này yêu cầu nhìn thấy assignment.

## Độ phức tạp

O(1).

## Kiểm tra

~~~powershell
javac --release 17 Main.java SelfCheck.java
java SelfCheck
~~~

Kết quả mong đợi: PASS - EX02.

