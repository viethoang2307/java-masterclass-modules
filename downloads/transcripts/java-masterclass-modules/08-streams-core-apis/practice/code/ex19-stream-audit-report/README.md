# Bài 19 — Stream Audit Report

Độ khó: Very Hard

## Đề bài

filter/mapToInt/Optional/grouping. Kiến thức cần phủ: multi-output analytics, deterministic report.

Mỗi metric có pipeline riêng để semantics rõ; report immutable và OptionalInt biểu diễn thiếu numeric result.

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

