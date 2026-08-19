# Bài 12 — Seeded Random Stream

Độ khó: Hard

## Đề bài

Random.ints, reproducibility. Kiến thức cần phủ: finite random stream, bounds, injected randomness.

Random được inject để test deterministic; ints(count, origin, bound) dùng bound exclusive.

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

