# 535 — Introduction: Program Flow

## Mục tiêu

Phân biệt sequence, selection và iteration; chọn cấu trúc control flow đúng với bài.

## Mental model

Sequence chạy theo thứ tự, selection chọn branch, iteration lặp khi condition còn đúng. Chọn cấu trúc theo shape của bài giúp code tự giải thích.

## Ví dụ Java 17

~~~java
int total = 0;
for (int n = 1; n <= 5; n++) {
    total += n;
}
System.out.println(total);
~~~

## Lỗi thường gặp

- Dùng loop cho logic chỉ chạy một lần.
- Không xác định termination condition.
- Trộn nhiều flow khiến output path khó trace.

## Bài tập ngắn

Vẽ flowchart cho tổng 1..N và chỉ ra sequence/selection/iteration.

## Interview prompt

Bạn chọn for, while hay do-while dựa trên thông tin nào?

## Nguồn

Transcript course lesson 535; ví dụ được chuẩn hóa theo Java 17 và giữ nguyên ý đồ của course.

