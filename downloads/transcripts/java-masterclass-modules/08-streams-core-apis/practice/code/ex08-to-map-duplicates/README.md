# Bài 08 — toMap Duplicate Policy

Độ khó: Hard

## Đề bài

toMap, merge function. Kiến thức cần phủ: duplicate key, LinkedHashMap, index.

toMap bắt buộc merge policy khi duplicate. LinkedHashMap giữ thứ tự key gặp lần đầu trong report.

## Hợp đồng

- Dùng Java 17 và Stream API phù hợp; không thêm dependency.
- Ghi rõ null, empty, ordering, duplicate và numeric/date policy.
- Không dùng side effect mutable trong filter/map; nếu dùng collector phải giải thích accumulator.
- Chạy javac --release 17 Main.java SelfCheck.java.

## Input/output mẫu

~~~text
Input: dữ liệu được tạo trực tiếp trong SelfCheck
Output: PASS khi lời giải đáp ứng contract
~~~

## Tiêu chí hoàn thành

- Có pipeline thật, không còn TODO trong implementation.
- Có test happy path và edge case.
- Giải thích vì sao dùng stream operation đã chọn và complexity.

