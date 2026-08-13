# 016 — Dùng biến trong expression

## Mục tiêu

Phân biệt expression với statement và biết cách Java tính expression có nhiều toán hạng.

## Expression là gì?

Expression là tổ hợp literal, biến, toán tử và lời gọi có thể được đánh giá thành một giá trị. Ví dụ:

~~~java
10 + 5
width * height
total = price * quantity
~~~

Một expression statement là expression được viết thành một statement hoàn chỉnh:

~~~java
int total = width * height;
total++;
System.out.println(total);
~~~

Trong khai báo int total = width * height, phần bên phải được tính trước, sau đó kết quả được gán cho total.

## Ví dụ từng bước

~~~java
public class ExpressionDemo {
    public static void main(String[] args) {
        int myFirstNumber = 10;
        int mySecondNumber = 5;
        int myThirdNumber = 2;

        int result = (myFirstNumber + mySecondNumber)
                + (myThirdNumber * 10);

        System.out.println(result); // 35
    }
}
~~~

Không có ngoặc, phép nhân có precedence cao hơn phép cộng:

~~~java
int a = 10 + 5 * 2;    // 20
int b = (10 + 5) * 2;  // 30
~~~

Hãy dùng ngoặc khi mục tiêu là truyền đạt ý định, ngay cả khi precedence đã đủ rõ.

~~~mermaid
flowchart TD
    A["myFirstNumber + mySecondNumber"] --> C["15"]
    B["myThirdNumber * 10"] --> D["20"]
    C --> E["15 + 20"]
    D --> E
    E --> F["result = 35"]
~~~

## Assignment không phải equality

- Dấu bằng đơn: gán giá trị.
- Hai dấu bằng: so sánh bằng trong nhiều expression boolean.

~~~java
int value = 5;
value = value + 1; // đọc value cũ, tính 6, ghi lại
System.out.println(value == 6); // true
~~~

## JShell hỗ trợ quan sát

~~~text
jshell> int x = 10;
jshell> int y = 3;
jshell> x + y * 2
$3 ==> 16
jshell> /vars
|    int x = 10
|    int y = 3
~~~

## Bài tập

Tạo mySecondNumber = 12, myThirdNumber = 6, tính mySecondNumber từ myFirstNumber, myThirdNumber từ mySecondNumber và total từ cả ba. Tự dự đoán kết quả trước khi chạy.

## Nguồn

- Transcript course: lesson 016 và 497.
- Oracle: Expressions, Statements, and Blocks.

