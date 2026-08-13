# 493 — Tạo project Hello World

## Mục tiêu

Biết tạo một project Java trong IDE và kiểm tra đúng JDK trước khi debug code.

## Quy trình trong IntelliJ IDEA

1. New Project.
2. Chọn Java.
3. Chọn JDK đã cài, ưu tiên JDK 17 cho module này.
4. Đặt tên project và thư mục.
5. Tạo class HelloWorld trong source root.
6. Chạy method main bằng nút Run.

Tên menu có thể thay đổi theo phiên bản IntelliJ, nhưng nguyên tắc không đổi: project phải dùng JDK, không chỉ runtime tối thiểu.

## Code tối thiểu

~~~java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World");
    }
}
~~~

## Kiểm tra ngoài IDE

~~~text
javac HelloWorld.java
java HelloWorld
~~~

Nếu lệnh terminal chạy được nhưng IDE không chạy, kiểm tra project SDK, module SDK và run configuration. Nếu IDE chạy được nhưng terminal không chạy, kiểm tra PATH/JAVA_HOME và thư mục hiện tại.

## Lỗi cấu hình hay gặp

- Compiler dùng JDK khác với JDK mà bạn tưởng.
- File nằm ngoài source root.
- Class public và filename không trùng.
- Chạy class cũ do run configuration trỏ sai.

## Bài tập

Tạo project, chạy Hello World, đổi output thành tên của bạn, rồi chạy lại bằng javac/java ở terminal.

## Nguồn

- Transcript course: lesson 493.
- Module 01: toolchain và IntelliJ setup.

