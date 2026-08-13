# 503 — Floating-point precision

## Vì sao có sai số?

Máy tính lưu floating-point theo binary significand và exponent. Nhiều phân số thập phân, như 0.1, không có biểu diễn binary hữu hạn. Khi đó kết quả là giá trị gần đúng.

~~~java
double value = 0.1 + 0.2;
System.out.println(value); // thường là 0.30000000000000004
System.out.println(value == 0.3); // false
~~~

Đừng so sánh trực tiếp hai double nếu bài toán yêu cầu tolerance:

~~~java
double expected = 0.3;
double actual = 0.1 + 0.2;
double epsilon = 1e-9;
boolean close = Math.abs(actual - expected) < epsilon;
~~~

## Tiền tệ

~~~java
import java.math.BigDecimal;

BigDecimal price = new BigDecimal("0.10");
BigDecimal tax = new BigDecimal("0.20");
System.out.println(price.add(tax)); // 0.30
~~~

Tránh new BigDecimal(0.1) nếu cần giữ đúng decimal người dùng nhập; dùng String hoặc valueOf với quy ước rõ ràng.

## Bài tập

1. In 0.1 + 0.2 với 17 chữ số.
2. Viết helper so sánh double bằng epsilon.
3. So sánh với BigDecimal tạo từ String.

## Nguồn

- Transcript course: lesson 503.
- Oracle Java API: Math và BigDecimal.

