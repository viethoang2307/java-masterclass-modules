# 526 — Sử dụng DiffMerge để Review

## Mục tiêu

So sánh source/reference, phát hiện accidental change và ghi lại quyết định review.

## Mental model

Review tốt đi từ behavior-critical lines tới style. Với branch/loop, đọc condition, boundary và mutation trước khi đọc whitespace.

## Ví dụ Java 17

~~~java
static String band(int value) {
    if (value >= 50) return "pass";
    return "fail";
}
~~~

## Lỗi thường gặp

- Bỏ qua whitespace thay đổi làm hỏng braces.
- Không xem line context quanh diff.
- Không chạy lại test sau merge.

## Bài tập ngắn

Review một diff có thay đổi điều kiện từ `>=` thành `>`; viết impact và test regression.

## Interview prompt

Một thay đổi một ký tự nào có thể làm hỏng boundary?

## Nguồn

Transcript course lesson 526; ví dụ được chuẩn hóa theo Java 17 và giữ nguyên ý đồ của course.

