# 502 — float và double

## Khác biệt cơ bản

- float dùng 32-bit floating point.
- double dùng 64-bit floating point.
- Decimal literal mặc định là double.
- Muốn tạo float literal phải thêm hậu tố f hoặc F.

~~~java
float rate = 0.5f;
double preciseEnough = 0.5;
~~~

Nếu viết float rate = 0.5, compiler báo không thể chuyển double xuống float ngầm định.

## Phép chia

~~~java
System.out.println(5 / 2);       // 2
System.out.println(5f / 2f);     // 2.5
System.out.println(5d / 2d);     // 2.5
System.out.println(5.0 / 2);     // 2.5
~~~

## Chọn type

double thường là lựa chọn mặc định cho phép đo cần độ chính xác tốt hơn float. Nhưng cả hai đều biểu diễn số gần đúng, không phải mọi decimal đều lưu chính xác trong binary floating point.

Tiền tệ nên dùng BigDecimal hoặc integer minor unit như cents, tùy yêu cầu hệ thống.

## Bài tập

Tính average của ba số bằng int division, double division và float division. Ghi rõ type của từng expression.

## Nguồn

- Transcript course: lesson 502.
- Oracle: Primitive Data Types.

