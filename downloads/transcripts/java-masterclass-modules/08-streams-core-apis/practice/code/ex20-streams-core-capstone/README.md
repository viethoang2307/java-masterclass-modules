# Bài 20 — Streams & Core APIs Capstone

Độ khó: Extreme

## Đề bài

flatMap, grouping, BigDecimal, Optional, java.time. Kiến thức cần phủ: tích hợp toàn bộ Module 8.

Capstone tách paid orders, flatten lines, exact revenue, grouping quantity, deterministic top SKU và max timestamp thành những stage có thể test.

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

