# 523 — Method Challenge — Final Code Changes

## Mục tiêu

Hoàn thiện challenge bằng cách phối hợp nhiều method, tên có nghĩa và output contract ổn định.

## Mental model

Một method có thể gọi method khác để compose behavior; không cần nhồi toàn bộ logic vào `main`. Tách calculation giúp self-check không phụ thuộc console.

## Ví dụ Java 17

~~~java
static void displayHighScorePosition(String player, int position) {
    System.out.println(player + " managed to get into position " + position);
}
static void process(String player, int score) {
    displayHighScorePosition(player, calculateHighScorePosition(score));
}
~~~

## Lỗi thường gặp

- Tên method không nói rõ side effect.
- Hard-code kết quả thay vì tính từ input.
- Không test method với nhiều player/score.

## Bài tập ngắn

Refactor một `main` dài thành 3 method: parse input, calculate position, format result.

## Interview prompt

Dấu hiệu nào cho thấy `main` đang làm quá nhiều việc?

## Nguồn

Transcript course lesson 523; ví dụ được chuẩn hóa theo Java 17 và giữ nguyên ý đồ của course.

