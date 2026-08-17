# Bài 08 — Generic Varargs Flatten

Độ khó: Hard

## Đề bài

Implement flatten with a safe result collection and copyWithFactory without new T[]. Explain why the varargs boundary needs care.

Chủ đề: generic arrays, varargs.

Kiến thức cần phủ: reifiable boundary, SafeVarargs, collection result.

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

