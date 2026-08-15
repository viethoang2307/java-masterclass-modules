# 531 — Method Overloading

## Mục tiêu

Khai báo nhiều method cùng tên nhưng khác parameter list; hiểu compiler chọn overload theo compile-time types.

## Mental model

Overload không dựa vào return type. Compiler resolve theo số lượng, thứ tự và type parameters; widening có thể được ưu tiên hơn boxing trong một số trường hợp.

## Ví dụ Java 17

~~~java
static int add(int a, int b) { return a + b; }
static double add(double a, double b) { return a + b; }
static String add(String a, String b) { return a + b; }
~~~

## Lỗi thường gặp

- Chỉ đổi return type rồi mong overload.
- Gọi nhầm overload vì literal `1` là int còn `1.0` là double.
- Overload quá nhiều làm API mơ hồ.

## Bài tập ngắn

Tạo overload `convert` cho seconds dạng int, long và String; test compiler resolution.

## Interview prompt

Overload resolution xảy ra compile time hay runtime?

## Nguồn

Transcript course lesson 531; ví dụ được chuẩn hóa theo Java 17 và giữ nguyên ý đồ của course.

