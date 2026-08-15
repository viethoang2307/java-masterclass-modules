# 524 — DiffMerge Tool Introduction

## Mục tiêu

Biết mục đích của diff tool khi so sánh code mẫu, code của mình và patch thay đổi.

## Mental model

Diff là conversation giữa hai phiên bản text: additions, deletions và changed lines. Dùng diff để review behavior, không chỉ để xem formatting.

## Ví dụ Java 17

~~~java
// Version A
static int add(int a, int b) { return a + b; }
// Version B
static int add(int a, int b) { return a - b; }
~~~

## Lỗi thường gặp

- Chỉ xem số dòng thay đổi mà không đọc semantics.
- Copy cả file làm mất thay đổi cục bộ.
- Không kiểm tra compile sau khi merge.

## Bài tập ngắn

Tạo hai phiên bản của một method, ghi diff và giải thích mỗi hunk thay đổi behavior gì.

## Interview prompt

Khi review diff, bạn kiểm tra contract nào trước: output, edge case hay style?

## Nguồn

Transcript course lesson 524; ví dụ được chuẩn hóa theo Java 17 và giữ nguyên ý đồ của course.

