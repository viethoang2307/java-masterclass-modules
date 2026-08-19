# Bài 16 — Order Revenue bằng flatMap

Độ khó: Very Hard

## Đề bài

flatMap, BigDecimal, reduce. Kiến thức cần phủ: one-to-many money, immutable reduction, validation.

Filter paid trước flatMap giúp không tính line của order unpaid; BigDecimal reduce giữ exact decimal.

## Hợp đồng

- Dùng Java 17, không thêm dependency.
- Ghi rõ empty/null/ordering/duplicate/precision/time-zone policy.
- Pipeline phải có operation phù hợp; không dùng side effect mutable để né collector.
- Chạy javac --release 17 Main.java SelfCheck.java.

## Input/output mẫu

~~~text
Input: dữ liệu được tạo trực tiếp trong SelfCheck
Output: PASS khi solution đáp ứng contract
~~~

## Tiêu chí hoàn thành

- Starter được thay bằng implementation thật.
- Có happy path và edge case.
- Có giải thích complexity và lý do chọn stream/core API.

