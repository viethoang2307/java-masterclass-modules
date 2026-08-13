# 500 — Casting

## Widening conversion

Chuyển từ type hẹp hơn sang type rộng hơn thường không cần cast:

~~~java
int count = 100;
long bigger = count;
double real = bigger;
~~~

## Narrowing conversion

Chuyển ngược lại có thể mất dữ liệu:

~~~java
int value = 130;
byte narrowed = (byte) value;
System.out.println(narrowed); // -126
~~~

Cast là cú pháp yêu cầu compiler đổi type, không phải phép kiểm tra range. Nếu giá trị không nằm trong range, kết quả có thể không còn như mong muốn.

## Arithmetic của byte và short

~~~java
short myShort = 10;
byte myByte = 20;
int total = myShort + myByte;
byte smallTotal = (byte) (myShort + myByte);
~~~

Biểu thức trong ngoặc được tính trước, sau đó toàn bộ kết quả được cast.

## Bẫy khi cast quá sớm

~~~java
int a = 1_000_000;
int b = 2_000;
int correct = a * b;
int overflowed = (short) a * b;
~~~

Cast sớm làm mất dữ liệu trước khi phép nhân hoàn thành. Hãy giữ type đủ rộng trong phép tính, cast ở ranh giới cuối cùng và kiểm tra range.

## Bài tập

Viết hai method: một nhận int trả về long bằng widening, một nhận int trả về byte sau khi validation. Test các giá trị -129, -128, 0, 127, 128.

## Nguồn

- Transcript course: lesson 500.
- Oracle: Primitive Data Types và Java Language Specification về conversion.

