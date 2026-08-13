# 516 — Expressions, statements, code blocks và methods

## Bốn khái niệm

- Expression: tạo ra một giá trị.
- Statement: đơn vị thực hiện hoàn chỉnh, thường kết thúc bằng dấu chấm phẩy.
- Block: nhóm statement trong ngoặc nhọn.
- Method: block có tên, tham số và có thể trả về value.

~~~java
public static void main(String[] args) { // method + block
    int sum = 2 + 3;                     // declaration statement
    sum++;                               // expression statement
    System.out.println(sum);             // method invocation statement
}
~~~

Đọc code theo nesting:

~~~mermaid
flowchart TD
    A["class"] --> B["method"]
    B --> C["block"]
    C --> D["statement"]
    D --> E["expression"]
~~~

## Vì sao phân biệt?

Khi compiler báo thiếu dấu chấm phẩy, thiếu ngoặc nhọn, hoặc expression không hợp lệ, bạn cần biết parser đang chờ đơn vị nào. Đây cũng là nền để học control flow và methods trong Module 3.

## Bài tập

Đánh dấu từng phần trong một class Hello World: class declaration, method declaration, block, variable declaration, method invocation và string literal.

## Nguồn

- Transcript course: lesson 516.
- Oracle: Expressions, Statements, and Blocks.

