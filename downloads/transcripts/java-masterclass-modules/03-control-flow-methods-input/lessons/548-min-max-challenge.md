# 548 — Min và Max Challenge

## Mục tiêu

Tìm min/max từ input mà không để giá trị khởi tạo sai làm méo kết quả.

## Mental model

Khởi tạo min/max bằng phần tử hợp lệ đầu tiên là robust với cả số âm và số dương. Sau đó mỗi value cập nhật hai invariant: min nhỏ nhất, max lớn nhất đã thấy.

## Ví dụ Java 17

~~~java
static int[] minMax(int[] values) {
    if (values == null || values.length == 0) {
        throw new IllegalArgumentException("values required");
    }
    int min = values[0];
    int max = values[0];
    for (int i = 1; i < values.length; i++) {
        min = Math.min(min, values[i]);
        max = Math.max(max, values[i]);
    }
    return new int[] {min, max};
}
~~~

## Lỗi thường gặp

- Khởi tạo min/max = 0 khiến toàn bộ input dương/âm sai.
- Không reject mảng rỗng.
- Chỉ cập nhật min hoặc max.

## Bài tập ngắn

Mở rộng challenge: đọc tới EOF, bỏ qua invalid token, trả min/max và count; test một giá trị, mixed signs và all invalid.

## Interview prompt

Invariant của min/max sau mỗi iteration là gì?

## Nguồn

Transcript course lesson 548; ví dụ được chuẩn hóa theo Java 17 và giữ nguyên ý đồ của course.

