# Module 07 — Generics, Nested Types và Lambdas

Module này đi từ type safety đến higher-order behavior: generic class/method, bounds và wildcards; type erasure và legacy boundary; nested/local/anonymous classes; functional interfaces, lambdas, method references và composition.

## Kết quả cần đạt

- Giải thích invariance, upper/lower bound và áp dụng PECS theo hướng dữ liệu.
- Viết generic API không raw type, không unchecked cast tùy tiện và có null/exception contract.
- Nhận diện hệ quả của type erasure, generic arrays, varargs và class token.
- Chọn static nested, inner, local hoặc anonymous class theo ownership/lifecycle.
- Dùng Predicate, Consumer, Function, Supplier, Comparator và method reference đúng semantics.
- Kiểm soát effectively final, capture, side effect, ordering và short-circuit.
- Kết hợp Generics + Nested Types + Lambdas trong một API có test và complexity rõ.

## Lộ trình

~~~text
Generic class/method → inference → bounds → extends/super → PECS
        ↓
Erasure → raw types → generic arrays/varargs → Comparable/Comparator
        ↓
Nested overview → static nested → inner → local → anonymous
        ↓
Lambda → functional interfaces → Predicate/Consumer/Function/Supplier
        ↓
Capture → method references → comparator/composition → capstone
~~~

## Cách học

1. Đọc lesson và viết lại mental model bằng ví dụ nhỏ.
2. Dự đoán compile-time type, output, mutation và exception trước khi chạy.
3. Tự sửa các compile example: wildcard, inference, lambda target typing.
4. Làm bài tương ứng trong practice/README.md.
5. Chạy từng SelfCheck và verifier toàn bộ solutions.

## Phạm vi transcript

- 166–178: generic types, methods, inference, bounds, wildcard, PECS, erasure và ordering.
- 179–184: static nested, inner, enclosing instance, local và anonymous classes.
- 185–198: lambda expression, functional interfaces, Predicate/Consumer/Function/Supplier, capture, method references, composition và capstone.
- 586–600: legacy/reference track về generics, nested types và lambdas; đã được quy chiếu vào lesson tương ứng, không tạo bài trùng.

## Practice

Bộ practice gồm 20 bài từ Medium đến Extreme. Mỗi bài có đề và starter code trong code/, lời giải đầy đủ trong solutions/, cùng SelfCheck.java.

~~~powershell
cd practice/solutions/ex01-generic-box
javac --release 17 Main.java SelfCheck.java
java SelfCheck

cd ../..
powershell.exe -ExecutionPolicy Bypass -File .\verify-solutions.ps1
~~~

Verifier compile từng exercise trong thư mục tạm nên các class Main không xung đột. Java code dùng Java 17, javac và JShell; không cần Maven, Gradle hoặc JUnit.

## References

- Java Language Specification 17: type erasure, classes, interfaces và lambda expressions.
- Java 17 API: java.util.function, Comparator, Collections và Optional.
- Oracle Java Tutorials: Generics, Nested Classes và Lambda Expressions.
