# Lời giải EX01 — main và Output Contract

Difficulty: Medium
Coverage: class, main, statement, String literal, println

## Hướng giải

Tạo class Main, đặt lời gọi println trong main và dùng String literal đúng dấu nháy kép. Không thêm text debug vì output contract yêu cầu khớp tuyệt đối.

## Lưu ý

Dấu chấm phẩy kết thúc expression statement; tên file phải là Main.java vì class public là Main.

## Độ phức tạp

O(1) về dữ liệu đầu vào.

## Kiểm tra

~~~powershell
javac --release 17 Main.java SelfCheck.java
java SelfCheck
~~~

Kết quả mong đợi: PASS - EX01.

