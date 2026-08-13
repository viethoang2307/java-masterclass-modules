# 015 — Keywords, biến và int

## Mục tiêu

Đọc được khai báo biến và hiểu vì sao Java cần kiểu dữ liệu trước tên biến.

## Keyword và case-sensitive

Keyword là từ Java dành riêng cho ngôn ngữ, ví dụ class, public, static, void, int, return. Không thể dùng chúng làm tên biến. Java phân biệt hoa thường:

~~~java
int score = 10;
int Score = 20; // biến khác hoàn toàn
// int class = 1; // lỗi: class là keyword
~~~

Không cần học thuộc toàn bộ danh sách keyword ngay. Hãy nhận diện các keyword xuất hiện trong code và dùng IDE hoặc Java Language Specification khi cần.

## Biến là gì?

Khai báo:

~~~java
int age;
~~~

Khai báo kèm khởi tạo:

~~~java
int age = 20;
~~~

Có thể hình dung:

~~~mermaid
flowchart LR
    A["int"] --> B["kiểu dữ liệu"]
    C["age"] --> D["tên biến"]
    E["20"] --> F["giá trị khởi tạo"]
    B --> G["int age = 20;"]
    D --> G
    F --> G
~~~

int là primitive type dùng cho số nguyên có dấu 32-bit. age là tên biến. Dấu bằng là assignment operator; nó gán giá trị bên phải vào biến bên trái.

## Local variable và field

Local variable phải được gán giá trị trước khi đọc:

~~~java
public class VariableDemo {
    public static void main(String[] args) {
        int count;
        // System.out.println(count); // compile error: chưa được khởi tạo
        count = 3;
        System.out.println(count);
    }
}
~~~

Đừng nhầm với field của object/class: field có default value theo type, nhưng local variable thì không.

## Quy tắc đặt tên

- Dùng camelCase cho biến: totalPrice, numberOfStudents.
- Tên phải mô tả ý nghĩa, không chỉ mô tả kiểu.
- Tránh viết tắt khó hiểu.
- Hằng số thường dùng UPPER_SNAKE_CASE.

## Lỗi cần nhận diện

- int 1age = 20: identifier không được bắt đầu bằng số.
- int age = "20": String không phải int.
- int age; System.out.println(age): local variable chưa được definite assignment.
- Khai báo trùng tên trong cùng scope.

## Bài tập

Khai báo và in firstName, birthYear, currentYear, age. Sau đó đổi tên các biến mơ hồ trong một đoạn code có sẵn thành tên có nghĩa.

## Nguồn

- Transcript course: lesson 015 và 496.
- Oracle: Primitive Data Types.

