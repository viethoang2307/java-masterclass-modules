# Bài 05 — Wildcard Inventory

Độ khó: Medium

## Đề bài

Implement joinUnknown, addRestock and total. Explain what can be read or written for each wildcard shape.

Chủ đề: wildcards, capture, collections.

Kiến thức cần phủ: List<?>, extends producer, super consumer.

## Hợp đồng

- Dùng Java 17, không thêm dependency.
- Giữ API đủ rõ để SelfCheck có thể kiểm tra behavior.
- Xử lý input rỗng, null hoặc invalid theo policy bạn chọn và ghi lại trong README.
- Không dùng raw type hoặc unchecked cast để né compiler.
- Chạy compile bằng javac --release 17 Main.java SelfCheck.java.

## Input/output mẫu

~~~text
Input: dữ liệu được tạo trực tiếp trong SelfCheck
Output: PASS khi lời giải đáp ứng toàn bộ contract
~~~

## Tiêu chí hoàn thành

- Có implementation thật, không còn TODO trong code đã hoàn thiện.
- Có test cho happy path và ít nhất một edge case.
- Giải thích lựa chọn generic variance hoặc functional API trong lời giải.

