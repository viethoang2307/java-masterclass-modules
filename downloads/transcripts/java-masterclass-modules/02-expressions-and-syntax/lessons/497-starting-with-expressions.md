# 497 — Bắt đầu với expressions

## Expression có giá trị và kiểu

Mỗi expression không chỉ cho ra một value; nó còn có type mà compiler suy luận:

~~~java
int a = 10 + 5;       // expression type int
double b = 10 / 4.0;  // expression type double
String c = "A" + 1;   // expression type String
~~~

## Precedence và associativity

~~~java
int result = 10 + 2 * 3;     // 16
int grouped = (10 + 2) * 3;  // 36
~~~

Phép nhân được xử lý trước phép cộng. Khi có nghi ngờ, thêm ngoặc; ngoặc làm ý định dễ đọc hơn và giảm lỗi khi code thay đổi.

## Unary, binary và increment

~~~java
int n = 5;
int positive = +n;
int negative = -n;
n++; // n thành 6
~~~

Hãy cẩn thận với khác biệt giữa prefix và postfix:

~~~java
int x = 5;
int before = x++; // before = 5, x = 6
int after = ++x;  // x = 7, after = 7
~~~

## Bài tập

Viết expression tính diện tích hình chữ nhật, chu vi và trung bình của ba số. Với mỗi expression, ghi type dự kiến trước khi compile.

## Nguồn

- Transcript course: lesson 497.
- Oracle: Expressions, Statements, and Blocks.

