# Module 03 — Control Flow, Methods và Input

## Mục tiêu

Sau module này, người học có thể:

- đọc và viết expressions với assignment, comparison, logical operators, ternary và precedence;
- thiết kế if/else, switch, for, while, do-while với boundary và termination rõ ràng;
- tách logic thành methods có parameters, return values và overloads;
- parse text thành primitive, đọc console input và xử lý invalid token/EOF;
- viết solution có invariant, test table, output contract và self-check độc lập.

## Dependency

Module 01 cung cấp JDK/JShell/CLI workflow. Module 02 cung cấp expressions, primitive types, casting và String semantics.

## Lộ trình lesson

Track chính là 506–548, gồm 43 lesson được biên soạn lại theo Java 17:

1. **506–515 — Expressions và điều kiện:** operators, assignment, if, logical operators, ternary, precedence.
2. **516–520 — Nền tảng control flow:** keywords, statements, blocks, whitespace và if/else.
3. **521–534 — Methods và challenge workflow:** return value, method decomposition, diff review, overloading và duration challenge.
4. **535–543 — Selection và loops:** program flow, switch, for, while, do-while, digit sum.
5. **544–548 — Parsing và input:** wrapper parsing, Scanner, invalid input, valid-count loop, min/max.

Các lesson legacy 046–077 vẫn có trong transcript để đối chiếu nội dung cũ; chúng không được nhân bản thành tài liệu thứ hai để tránh hai source of truth.

## Visual map

~~~mermaid
flowchart LR
    A["Input text"] --> B["Parse and validate"]
    B --> C["Typed state"]
    C --> D{"Selection"}
    D --> E["if / switch"]
    D --> F["Loop"]
    F --> G["for / while / do-while"]
    E --> H["Method contract"]
    G --> H
    H --> I["Deterministic output"]
    I --> J["Self-check and boundary tests"]
~~~

## Quy ước code

- Java 17, compile bằng javac --release 17.
- Không dùng Maven, Gradle hoặc JUnit.
- Tách calculation khỏi console I/O khi có thể để test dễ hơn.
- Mọi loop phải có progress measure và termination condition.
- Mọi input boundary phải nêu behavior của invalid input và EOF.
- Dùng braces cho control-flow block, parentheses khi muốn làm rõ precedence.

## Cấu trúc

- [INDEX.md](INDEX.md) — lesson index và thứ tự học.
- [lessons/](lessons) — 43 tài liệu concept, ví dụ, pitfalls và checkpoint.
- [practice/README.md](practice/README.md) — 20 bài từ Medium đến Extreme.
- [practice/code](practice/code) — starter code có TODO.
- [practice/solutions](practice/solutions) — lời giải, explanation, pitfalls và complexity.
- [practice/verify-solutions.ps1](practice/verify-solutions.ps1) — compile/run toàn bộ 20 lời giải.

## Chạy practice

~~~powershell
cd practice/code/ex01-score-classifier
javac --release 17 Main.java SelfCheck.java
java SelfCheck
~~~

Chạy toàn bộ lời giải:

~~~powershell
./practice/verify-solutions.ps1
~~~

## Reference chính thức

- [Oracle — Control Flow Statements](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/flow.html)
- [Oracle — Defining Methods](https://docs.oracle.com/javase/tutorial/java/javaOO/methods.html)
- [Java Language Specification, Java SE 17](https://docs.oracle.com/javase/specs/jls/se17/html/index.html)
- [Scanner Java SE 17 API](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/Scanner.html)
- [Integer.parseInt Java SE 17 API](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/Integer.html#parseInt(java.lang.String))

## Module checkpoint

Trước khi sang Module 04, hãy có thể:

- viết một method pure để tính kết quả và một method riêng để format;
- giải thích vì sao &&/|| short-circuit;
- chọn switch, for, while hay do-while với lý do rõ ràng;
- xử lý invalid token mà không retry vô hạn;
- chứng minh min/max bằng invariant và boundary tests.

