# 515 — End of Remaster

## Mục tiêu

Ôn lại các khái niệm operator, condition và style trước khi chuyển sang methods.

## Mental model

Từ đây, mục tiêu không chỉ là code chạy mà còn là code đọc được: braces, names, parentheses và tests phải làm rõ ý định.

## Ví dụ Java 17

~~~java
static boolean isValidScore(int score) {
    return score >= 0 && score <= 100;
}
~~~

## Lỗi thường gặp

- Tưởng style không ảnh hưởng correctness.
- Không test invalid input.
- Copy challenge solution mà không giải thích invariant.

## Bài tập ngắn

Tạo checklist review 10 mục cho một đoạn code control flow.

## Interview prompt

Một checklist tốt phải bắt được bug nào mà compiler không bắt được?

## Nguồn

Transcript course lesson 515; ví dụ được chuẩn hóa theo Java 17 và giữ nguyên ý đồ của course.

