# 014 — Chương trình Java đầu tiên với JShell

## Mục tiêu

Chạy được lệnh Java nhỏ nhất, phân biệt command với statement và biết khi nào nên dùng JShell hay class hoàn chỉnh.

## JShell là gì?

JShell là REPL: bạn nhập một đoạn Java, công cụ biên dịch và thực thi ngay. Nó phù hợp để thử expression, kiểu dữ liệu và API nhỏ mà chưa cần tạo project.

Ví dụ:

~~~text
jshell> 2 + 3
$1 ==> 5

jshell> System.out.println("Hello, Java!");
Hello, Java!

jshell> int age = 20;
age ==> 20
~~~

Trong file Java, câu lệnh thường kết thúc bằng dấu chấm phẩy. Trong JShell, bạn có thể nhập nhiều loại snippet và JShell tự quản lý phần kết thúc phù hợp.

## Chương trình class hoàn chỉnh

~~~java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, Java!");
    }
}
~~~

Giải thích:

- public class HelloWorld: định nghĩa class tên HelloWorld.
- main: entry point quen thuộc để launcher gọi.
- System.out: output stream chuẩn.
- println: in nội dung và xuống dòng.
- dấu chấm phẩy: kết thúc expression statement.
- ngoặc nhọn: block chứa thân method/class.

## Sự cố thường gặp

- Tên file không khớp class public: HelloWorld.java phải chứa public class HelloWorld.
- Dùng dấu nháy cong thay cho dấu nháy kép ASCII.
- Quên dấu chấm phẩy.
- Viết sai System.out.println.
- Chạy nhầm thư mục hoặc dùng JDK/JRE không đúng.

## Thực hành có chủ đích

~~~text
jshell> String name = "Viet";
jshell> System.out.println("Hello, " + name);
jshell> int year = 2026;
jshell> System.out.println(year + 1);
~~~

Sau đó chuyển đúng logic sang HelloName.java. Hiểu một snippet không đồng nghĩa với việc biết đặt nó vào cấu trúc chương trình.

## Bài tập

Viết chương trình in tên, tuổi năm sau và phép tính 2 + 3. Làm một lần bằng JShell, một lần bằng class có main.

## Nguồn

- Transcript course: lesson 014 và 493–495.
- Oracle Language Basics: Variables, Data Types, and Operators.

