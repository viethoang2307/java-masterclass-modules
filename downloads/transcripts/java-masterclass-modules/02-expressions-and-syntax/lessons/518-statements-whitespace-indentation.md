# 518 — Statements, whitespace và indentation

## Statement

~~~java
int myVariable = 50;
myVariable++;
System.out.println(myVariable);
~~~

Mỗi dòng trên là một statement; newline không tự kết thúc statement, dấu chấm phẩy mới thường làm nhiệm vụ đó.

## Whitespace và indentation

Java bỏ qua phần lớn whitespace giữa token, nên đoạn sau thường compile như nhau:

~~~java
int x = 1 + 2;
int y = 1
        + 2;
~~~

Nhưng indentation là communication giữa người với người. Dùng một style nhất quán, thường 4 spaces, và giữ ngoặc đóng thẳng hàng với cấu trúc mở.

## Lỗi nguy hiểm do formatting

~~~java
if (true)
    System.out.println("A");
    System.out.println("B"); // không thuộc if dù nhìn dễ nhầm
~~~

Khi có nhiều statement, luôn dùng braces:

~~~java
if (true) {
    System.out.println("A");
    System.out.println("B");
}
~~~

## Comments

~~~java
// comment một dòng
/*
 * comment nhiều dòng
 */
~~~

Comment giải thích why, không nên lặp lại đúng điều code đã nói.

## Bài tập

Format lại một đoạn code cố tình viết trên một dòng; thêm braces cho if; xóa comment thừa; chạy formatter của IDE và kiểm tra output không đổi.

## Nguồn

- Transcript course: lesson 518.
- Oracle: Expressions, Statements, and Blocks.

