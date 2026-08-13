# 494 — Định nghĩa main method

## Chữ ký quen thuộc

~~~java
public static void main(String[] args) {
    // statements
}
~~~

Giải thích từng phần:

- public: launcher có thể truy cập method.
- static: gọi mà không cần tạo object của class.
- void: method không trả về giá trị.
- main: tên entry point mà launcher tìm.
- String[] args: mảng đối số command-line.

## Thử với command-line arguments

~~~java
public class ArgumentsDemo {
    public static void main(String[] args) {
        System.out.println("Number of arguments: " + args.length);
        if (args.length > 0) {
            System.out.println("First: " + args[0]);
        }
    }
}
~~~

Chạy:

~~~text
javac ArgumentsDemo.java
java ArgumentsDemo one two
~~~

Output có số lượng argument là 2 và phần tử đầu là one.

## Một nuance quan trọng

Java hiện đại cho phép một số dạng main hợp lệ khác trong bối cảnh ngôn ngữ mới, nhưng dạng public static void main(String[] args) vẫn là dạng portable và phù hợp nhất để học course, IDE và tooling truyền thống.

## Bài tập

Viết class in toàn bộ args theo index. Chạy với 0, 1 và 3 arguments; quan sát vì sao cần kiểm tra args.length trước khi truy cập args[0].

## Nguồn

- Transcript course: lesson 494.
- Java launcher documentation và Java Language Specification.

