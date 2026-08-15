# 519 — Code Blocks và if-then-else

## Mục tiêu

Dùng code block để kiểm soát scope và viết chuỗi `if/else if/else` bao phủ các trường hợp.

## Mental model

Biến khai báo trong block chỉ sống trong block. `else` gắn với `if` gần nhất chưa có else; braces loại bỏ ambiguity và bảo vệ refactor.

## Ví dụ Java 17

~~~java
int number = 7;
if (number > 0) {
    String sign = "positive";
    System.out.println(sign);
} else {
    System.out.println("non-positive");
}
~~~

## Lỗi thường gặp

- Dùng biến ngoài scope của block.
- Dangling else khi thiếu braces.
- Condition overlap khiến nhánh sau không bao giờ chạy.

## Bài tập ngắn

Viết classifier cho số âm, zero, dương; thêm test coverage cho từng block.

## Interview prompt

Làm thế nào phát hiện một branch không thể reach?

## Nguồn

Transcript course lesson 519; ví dụ được chuẩn hóa theo Java 17 và giữ nguyên ý đồ của course.

