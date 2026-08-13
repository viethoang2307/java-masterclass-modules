# 019 — Arithmetic và casting

## Mục tiêu

Dự đoán kiểu kết quả của phép tính số và dùng widening/narrowing conversion có chủ đích.

## Arithmetic integer

~~~java
int a = 10;
int b = 3;

System.out.println(a + b); // 13
System.out.println(a - b); // 7
System.out.println(a * b); // 30
System.out.println(a / b); // 3, integer division
System.out.println(a % b); // 1, remainder
~~~

Chia hai số nguyên bỏ phần thập phân. Muốn có kết quả thực, ít nhất một toán hạng phải là float hoặc double:

~~~java
System.out.println(10 / 3);       // 3
System.out.println(10.0 / 3);     // 3.3333333333333335
System.out.println((double) 10 / 3); // 3.3333333333333335
~~~

## Widening và narrowing

Widening thường an toàn vì type đích rộng hơn:

~~~java
int count = 100;
long larger = count;
double real = larger;
~~~

Narrowing có thể mất dữ liệu nên phải cast tường minh:

~~~java
int value = 130;
byte narrowed = (byte) value;
System.out.println(narrowed); // -126
~~~

Cast không làm giá trị “đúng hơn”; nó yêu cầu compiler chuyển sang type khác. Với số nguyên, phần vượt range bị cắt theo biểu diễn nhị phân của type đích.

## Bẫy nhiều biến

~~~java
short myShort = 10;
byte myByte = 20;
int total = myShort + myByte; // đúng: expression được promote lên int
~~~

Nếu cần giữ byte/short:

~~~java
byte result = (byte) (myShort + myByte);
~~~

Chỉ làm vậy khi đã kiểm tra range.

## Số âm và remainder

Toán tử % là remainder, không phải modulo toán học luôn dương:

~~~java
System.out.println(-7 % 3); // -1
~~~

Nếu cần modulo không âm, thiết kế công thức riêng hoặc dùng Math.floorMod.

## Bài tập

Giải challenge của course:

~~~java
byte byteValue = 10;
short shortValue = 20;
int intValue = 50;
long longValue = 50_000L + 10L * (byteValue + shortValue + intValue);
System.out.println(longValue); // 50_800
~~~

Viết thêm một phiên bản có biến intermediate sum và kiểm tra hai kết quả bằng nhau.

## Nguồn

- Transcript course: lesson 019 và 500.
- Oracle: Expressions, Statements, and Blocks; Java Math API.

