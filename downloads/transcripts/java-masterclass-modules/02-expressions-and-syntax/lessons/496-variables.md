# 496 — Variables

## Mô hình ba bước

Một biến có:

1. declaration: chọn type và tên;
2. initialization: gán giá trị đầu;
3. reassignment: gán giá trị mới cùng type tương thích.

~~~java
int score;       // declaration
score = 10;      // initialization
score = score + 5; // reassignment
~~~

Hoặc viết gọn:

~~~java
int score = 10;
~~~

## Type safety

Java kiểm tra type tại compile time:

~~~java
int count = 3;
// count = "three"; // không compile
~~~

Điều này giúp phát hiện nhiều lỗi trước khi chương trình chạy, nhưng không bảo đảm logic đúng. count vẫn có thể chứa giá trị sai nghiệp vụ như -1 nếu bạn không đặt validation.

## Scope và lifetime

Biến local chỉ dùng được trong block nơi nó được khai báo:

~~~java
if (true) {
    int temporary = 10;
    System.out.println(temporary);
}
// temporary không còn tồn tại ở đây
~~~

## Bài tập

Tạo chương trình có biến baseSalary, bonus, totalSalary. In từng giá trị; sau đó thay đổi bonus và giải thích statement nào đã thay đổi state.

## Nguồn

- Transcript course: lesson 496.
- Oracle: Variables.

