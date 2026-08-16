# Bài 20 — Expression & Type Audit Capstone

Độ khó: Extreme

## Đề bài

Build an audit report combining command-line args, generic/lambda concepts where useful, primitive ranges, widening before overflow, floating-point epsilon, BigDecimal, char/UTF-16 and boolean/String formatting. Keep each policy explicit.

Chủ đề: primitive, casting, overflow, floating point, char, boolean, String.

Kiến thức cần phủ: toàn bộ Module 7 và syntax nền.

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

