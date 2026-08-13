# 018 — byte, short, long và width

## Mục tiêu

Hiểu width, range, literal suffix và numeric promotion của các kiểu số nguyên.

## Width và range

| Type | Width | Range |
|---|---:|---:|
| byte | 8 bit | -128 đến 127 |
| short | 16 bit | -32,768 đến 32,767 |
| int | 32 bit | -2^31 đến 2^31 - 1 |
| long | 64 bit | -2^63 đến 2^63 - 1 |

Các kiểu signed dùng một bit cho dấu. Khi vượt giới hạn, primitive integer có thể overflow theo arithmetic của kiểu:

~~~java
byte max = 127;
max++; // kết quả là -128
System.out.println(max);
~~~

Đừng dùng overflow như cơ chế kiểm tra an toàn. Với tính toán quan trọng, kiểm tra range hoặc dùng API phù hợp.

## Literal long

Một integer literal không có suffix thường được suy luận là int nếu vừa range. Dùng L khi literal cần là long:

~~~java
long population = 8_000_000_000L;
long distance = 3_000_000_000L;
~~~

Dấu gạch dưới trong numeric literal giúp đọc dễ hơn và không thay đổi giá trị:

~~~java
long budget = 1_000_000L;
~~~

## Numeric promotion

Arithmetic trên byte và short thường được promote lên int:

~~~java
byte a = 10;
byte b = 20;
// byte sum = a + b; // lỗi: a + b có type int
int sum = a + b;
byte safe = (byte) (a + b);
~~~

Cast chỉ hợp lý nếu bạn chứng minh kết quả nằm trong range. Nếu không, cast có thể làm mất dữ liệu.

## Bài tập

1. In range của Byte, Short, Integer, Long.
2. Tạo overflow cho byte và giải thích output.
3. Tính tổng hai byte bằng int, sau đó thử cast về byte.
4. Viết một literal long lớn hơn Integer.MAX_VALUE.

## Nguồn

- Transcript course: lesson 018 và 499.
- Oracle: Primitive Data Types.

