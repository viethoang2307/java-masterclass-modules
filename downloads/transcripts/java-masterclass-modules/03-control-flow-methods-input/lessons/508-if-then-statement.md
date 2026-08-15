# 508 — if-then Statement

## Mục tiêu

Viết nhánh điều kiện rõ ràng bằng `if`, dùng boolean expression làm điều kiện và tránh assignment trong điều kiện.

## Mental model

Điều kiện của `if` phải có type `boolean`. Nhánh chỉ chạy khi điều kiện true; dùng braces ngay cả khi thân chỉ có một statement để tránh lỗi khi thêm dòng.

## Ví dụ Java 17

~~~java
int temperature = 31;
if (temperature > 30) {
    System.out.println("hot");
} else {
    System.out.println("mild");
}
~~~

## Lỗi thường gặp

- Viết `if (x = 3)` như C/C++; Java không cho assignment làm boolean.
- Không đặt braces rồi vô tình tách statement ra ngoài nhánh.
- So sánh String bằng `==` thay vì `.equals`.

## Bài tập ngắn

Xây bộ phân loại điểm: invalid, fail, pass, distinction; kiểm tra boundary value như 0, 49, 50, 79, 80, 100.

## Interview prompt

Tại sao thứ tự các nhánh `if/else if` có thể làm thay đổi kết quả?

## Nguồn

Transcript course lesson 508; ví dụ được chuẩn hóa theo Java 17 và giữ nguyên ý đồ của course.

