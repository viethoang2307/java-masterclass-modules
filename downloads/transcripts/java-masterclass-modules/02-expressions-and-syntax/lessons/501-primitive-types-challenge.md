# 501 — Primitive types challenge

## Đề bài

Khai báo byte 10, short 20, int 50. Tạo long bắt đầu từ 50,000 và cộng 10 lần tổng ba biến.

## Lời giải

~~~java
byte byteValue = 10;
short shortValue = 20;
int intValue = 50;

long total = 50_000L
        + 10L * (byteValue + shortValue + intValue);

System.out.println(total); // 50,800
~~~

Phân rã:

1. Tổng ba biến là 80.
2. 10L nhân 80 thành 800L.
3. 50,000L cộng 800L thành 50,800L.

## Phiên bản dễ debug

~~~java
int sum = byteValue + shortValue + intValue;
long base = 50_000L;
long total = base + 10L * sum;
~~~

Đây là trade-off thực tế: một expression ngắn không luôn dễ đọc hoặc dễ debug hơn.

## Tự chấm

- Khai báo đúng type.
- Dùng L có chủ ý.
- Dự đoán đúng 50,800.
- Giải thích numeric promotion.
- Thử thêm số âm và giá trị lớn.

## Nguồn

- Transcript course: lesson 501.
- Oracle: Primitive Data Types.

