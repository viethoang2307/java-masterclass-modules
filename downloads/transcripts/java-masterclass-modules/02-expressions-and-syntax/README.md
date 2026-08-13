# Module 02 — Expressions và Syntax

Source chính: lessons 006, 014–020, 032, 492–505, 514–518.

## Mục tiêu

Sau module này, người học có thể:

- đọc một chương trình Java từ token tới statement;
- phân biệt expression, statement, block và declaration;
- hiểu biến, literal, primitive type, wrapper và `String`;
- dự đoán type của arithmetic expression;
- giải thích numeric promotion, overflow, narrowing cast và floating-point precision;
- viết `Hello World` đúng cấu trúc trong JShell/IDE;
- đọc compiler error thay vì sửa ngẫu nhiên.

## Dependency

Module 01: JDK, JShell, IntelliJ IDEA và workflow chạy code.

## Lộ trình

1. `006` — học bằng cách tự gõ source code.
2. `014`, `492–495` — Hello World, statement và `main`.
3. `015`, `496` — keyword và variables.
4. `016`, `497` — expressions, operands và assignment.
5. `017`, `498` — tám primitive types và wrapper classes.
6. `018`, `499` — `byte`, `short`, `long` và width.
7. `019`, `500` — arithmetic với nhiều numeric type và casting.
8. `020`, `501` — primitive types challenge.
9. `502–503` — `float`, `double` và precision.
10. `504–505` — `char`, `boolean` và `String`.
11. `032`, `514–518` — legacy recap về setup, summary, keywords, expressions, statements, whitespace và indentation.

## Quy ước version

Track `492–518` là legacy/parallel content, có đoạn dùng JDK 11. Các tài liệu dưới đây giữ giá trị concept nhưng code mẫu ưu tiên Java 17. Chỗ khác biệt được đánh dấu `Bổ sung ngoài course`.

## Visual map

~~~mermaid
flowchart TD
    A["Source code"] --> B["Lexical tokens"]
    B --> C["Expressions"]
    C --> D["Statements"]
    D --> E["Blocks and methods"]
    E --> F["javac type checking"]
    F --> G["Bytecode"]
    G --> H["JVM execution"]
~~~

## Cấu trúc thư mục

- lessons/: 28 bài được biên soạn theo source transcript, gồm concept, code, lỗi thường gặp, bài tập và checkpoint.
- examples/: 5 chương trình Java độc lập để compile/run bằng JDK.
- INDEX.md: mục lục và thứ tự học.

Chạy toàn bộ ví dụ:

~~~text
javac -d out examples/*.java
java -cp out PrimitiveChallenge
java -cp out FloatingPointDemo
~~~

Output đáng chú ý của FloatingPointDemo cho thấy 0.1 + 0.2 có thể không bằng chính xác 0.3; đây là lý do phải chọn cách biểu diễn và phép so sánh phù hợp.

## Reference chính thức

- Oracle — Expressions, Statements, and Blocks: https://docs.oracle.com/javase/tutorial/java/nutsandbolts/expressions.html
- Oracle — Primitive Data Types: https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html
- Java Language Specification, Java SE 17: https://docs.oracle.com/javase/specs/jls/se17/html/index.html
- Java SE 17 Math API: https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/Math.html

## Module checkpoint

- Tôi giải thích được vì sao `byte + short` thường trở thành `int`.
- Tôi dự đoán được kết quả của `5 / 2` và `5.0 / 2`.
- Tôi biết khi nào cần suffix `L`, `f`, `d`.
- Tôi phân biệt compile-time error, runtime exception và wrong output.
- Tôi không dùng `double` cho tiền chỉ vì code ngắn hơn.
