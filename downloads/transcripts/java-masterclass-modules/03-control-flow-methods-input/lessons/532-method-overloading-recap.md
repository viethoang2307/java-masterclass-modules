# 532 — Method Overloading Recap

## Mục tiêu

Dùng overload để cung cấp API tiện dụng nhưng delegate về một implementation chuẩn.

## Mental model

Overload public nên mỏng; gom logic vào overload đầy đủ nhất để tránh behavior drift giữa các nhánh.

## Ví dụ Java 17

~~~java
static String formatScore(int score) {
    return formatScore(score, 0);
}
static String formatScore(int score, int bonus) {
    return "score=" + (score + bonus);
}
~~~

## Lỗi thường gặp

- Duplicate logic giữa các overload.
- Không định nghĩa default parameter behavior.
- Ambiguous call do `null` với nhiều reference overload.

## Bài tập ngắn

Thiết kế 3 overload cho formatter và chỉ để một overload chứa logic chính.

## Interview prompt

Khi nào overload làm API tốt hơn default value hoặc tên method khác?

## Nguồn

Transcript course lesson 532; ví dụ được chuẩn hóa theo Java 17 và giữ nguyên ý đồ của course.

