# Bài 18 — Instant và Zone Report

Độ khó: Very Hard

## Đề bài

java.time, Instant, ZoneId. Kiến thức cần phủ: timeline/presentation conversion, formatter, deterministic clock.

Lưu Instant cho event timeline, convert ZoneId ở presentation. SelfCheck dùng instant cố định nên không flaky.

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

