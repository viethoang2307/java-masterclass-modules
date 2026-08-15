# 521 — Methods trong Java

## Mục tiêu

Khai báo method với modifier, return type, name và parameters; gọi method từ `main`.

## Mental model

Method là named operation. Parameters là local variables nhận input; `return` chuyển một value ra caller. `static` method thuộc class và gọi được từ static context như `main`.

## Ví dụ Java 17

~~~java
public static void main(String[] args) {
    int score = calculateScore(true, 800);
    System.out.println(score);
}
static int calculateScore(boolean gameOver, int score) {
    return gameOver ? score + 1000 : score;
}
~~~

## Lỗi thường gặp

- Khai báo return type không khớp `return`.
- Gọi instance method từ static context.
- Đặt side effect và calculation trong một method quá lớn.

## Bài tập ngắn

Tách chương trình tính score thành `calculateScore`, `displayHighScorePosition` và test từng method.

## Interview prompt

Java truyền parameter theo value nghĩa là gì khi parameter là object reference?

## Nguồn

Transcript course lesson 521; ví dụ được chuẩn hóa theo Java 17 và giữ nguyên ý đồ của course.

