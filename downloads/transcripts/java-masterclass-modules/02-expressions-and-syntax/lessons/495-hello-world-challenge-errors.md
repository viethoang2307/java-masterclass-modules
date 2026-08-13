# 495 — Hello World challenge và lỗi thường gặp

## Bài tập

Đổi chương trình để in một lời chào cá nhân hóa:

~~~java
public class HelloChallenge {
    public static void main(String[] args) {
        String name = "Viet";
        System.out.println("Hello, " + name + "!");
    }
}
~~~

## Phân loại lỗi

### Compile-time error

Ví dụ thiếu dấu chấm phẩy:

~~~java
String name = "Viet"
System.out.println(name);
~~~

Compiler chặn chương trình trước khi chạy.

### Runtime exception

~~~java
String[] names = {};
System.out.println(names[0]);
~~~

Code có thể compile nhưng ném ArrayIndexOutOfBoundsException khi chạy.

### Wrong output

~~~java
System.out.println("Hello " + 2 + 3); // Hello 23
~~~

Đây không phải syntax error; toán tử + chuyển sang nối chuỗi sau khi đã gặp String. Muốn ra Hello 5, dùng "Hello " + (2 + 3).

## Checklist sửa lỗi

- Đọc lỗi đầu tiên.
- Kiểm tra dòng trước vị trí compiler chỉ.
- Xác nhận dấu nháy, dấu chấm phẩy, ngoặc.
- Sau khi compile được, kiểm tra output bằng test case nhỏ.

## Bài tập mở rộng

In tên, tuổi và năm sinh. Tạo một test với chuỗi rỗng và một test với tên có khoảng trắng. Ghi lại expected output trước khi chạy.

## Nguồn

- Transcript course: lesson 495.
- Oracle Expressions, Statements, and Blocks.

