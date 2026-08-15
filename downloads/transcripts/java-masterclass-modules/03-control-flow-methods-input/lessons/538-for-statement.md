# 538 — for Statement

## Mục tiêu

Viết for loop với initialization, condition, update; kiểm soát counter và accumulation.

## Mental model

For loop phù hợp khi biết hoặc biểu diễn rõ state tiến triển. Invariant thường là accumulator đã chứa kết quả của prefix đã duyệt.

## Ví dụ Java 17

~~~java
int sum = 0;
for (int i = 1; i <= 10; i++) {
    sum += i;
}
System.out.println(sum);
~~~

## Lỗi thường gặp

- Update sai khiến infinite loop.
- Dùng `<` thay `<=` bỏ mất endpoint.
- Mutation counter ở cả body và header.

## Bài tập ngắn

Viết loop tính tổng, đếm, và lọc số chia hết cho 3; ghi invariant cho mỗi loop.

## Interview prompt

Invariant của accumulator là gì trong loop tính tổng?

## Nguồn

Transcript course lesson 538; ví dụ được chuẩn hóa theo Java 17 và giữ nguyên ý đồ của course.

