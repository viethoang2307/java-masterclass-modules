# 522 — Methods: Return Value và Challenge

## Mục tiêu

Thiết kế method có return value thay vì chỉ print; dùng return để biểu diễn kết quả tính toán.

## Mental model

Caller nên nhận kết quả rồi quyết định format/output. Method có một responsibility và contract: input hợp lệ, output, behavior khi invalid.

## Ví dụ Java 17

~~~java
static int calculateHighScorePosition(int score) {
    if (score >= 1000) return 1;
    if (score >= 500) return 2;
    if (score >= 100) return 3;
    return 4;
}
~~~

## Lỗi thường gặp

- Mọi path không return value.
- Ngưỡng đặt sai thứ tự.
- Method vừa print vừa return khiến caller khó tái sử dụng.

## Bài tập ngắn

Viết score-position method với boundary tests 99/100/499/500/999/1000.

## Interview prompt

Làm sao chứng minh method đã cover tất cả execution paths?

## Nguồn

Transcript course lesson 522; ví dụ được chuẩn hóa theo Java 17 và giữ nguyên ý đồ của course.

