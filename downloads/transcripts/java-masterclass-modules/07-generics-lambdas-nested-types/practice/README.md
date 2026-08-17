# Practice — Module 07: Generics, Nested Types và Lambdas

Mỗi bài có starter trong code/ và lời giải tham khảo trong solutions/. Hãy đọc đề, dự đoán compile-time type và behavior, tự làm trước rồi chạy SelfCheck.

| Bài | Chủ đề | Độ khó | Kiến thức phủ |
|---:|---|---|---|
| 01 | Generic Box và Pair | Medium | generic class, invariance, immutable value |
| 02 | Generic swap và copy | Medium | generic methods, PECS |
| 03 | Bounded Number Statistics | Medium | T extends Number, numeric policy |
| 04 | PECS Transfer | Medium | extends source, super target |
| 05 | Wildcard Inventory | Medium | List<?>, wildcard read/write |
| 06 | Class Token Parser | Hard | type erasure, Class<T> |
| 07 | Raw Type Audit | Hard | heap pollution, legacy boundary |
| 08 | Generic Varargs Flatten | Hard | generic arrays, SafeVarargs |
| 09 | Comparator Leaderboard | Hard | Comparator contract, tie-breaker |
| 10 | Static Nested Builder | Hard | static nested, immutable builder |
| 11 | Inner Cursor | Hard | inner member, enclosing state |
| 12 | Local và Anonymous Validation | Hard | local class, anonymous class |
| 13 | Predicate Filter Pipeline | Very Hard | composition, short-circuit |
| 14 | Consumer Audit Pipeline | Very Hard | Consumer, side-effect ordering |
| 15 | Function và Supplier Composition | Very Hard | compose, andThen, lazy fallback |
| 16 | Method Reference Registry | Very Hard | constructor/static/bound references |
| 17 | Lambda Capture Pricing | Very Hard | effectively final, BigDecimal |
| 18 | Immutable Functional Pipeline | Extreme | generic pipeline, variance, immutability |
| 19 | Generic Repository và Nested Query | Extreme | bounded generic, query, lambda |
| 20 | Expression & Type Audit Capstone | Extreme | primitive, casting, overflow, precision, formatting |

## Chạy một bài

~~~powershell
cd solutions/ex01-generic-box
javac --release 17 Main.java SelfCheck.java
java SelfCheck
~~~

SelfCheck thành công phải in PASS. Mỗi exercise compile trong thư mục riêng nên các class Main không xung đột.

## Chạy toàn bộ lời giải

~~~powershell
powershell.exe -ExecutionPolicy Bypass -File .\verify-solutions.ps1
~~~

Verifier không dùng Maven, Gradle hoặc JUnit; chỉ yêu cầu JDK 17 có javac và java trong PATH.
