# Practice — Module 04 — Classes và Object Model

Bộ 20 bài tăng dần từ Medium đến Extreme. Tổng thể bao phủ class/object, encapsulation, constructors, references, static/instance, POJO/record, inheritance, Object contract và String API.

## Quy ước

- code/: đề bài, starter code có TODO, sample và completion criteria.
- solutions/: lời giải hoàn chỉnh, hướng tư duy, pitfalls và complexity.
- Mỗi exercise compile riêng vì có Main/SelfCheck riêng.
- Java 17, javac --release 17, không Maven/Gradle/JUnit.
- SelfCheck gọi domain methods trực tiếp, không phụ thuộc interactive console.

## Mức độ

- 01–05: Medium
- 06–12: Hard
- 13–17: Very Hard
- 18–20: Extreme

## Mục lục

| # | Bài | Độ khó | Coverage | Thư mục |
|---:|---|---|---|---|
| 01 | Class/object model | Medium | fields, methods, instance state | [code](code/ex01-class-object-model) / [solution](solutions/ex01-class-object-model) |
| 02 | Encapsulated bank account | Medium | private fields, invariants | [code](code/ex02-encapsulated-account) / [solution](solutions/ex02-encapsulated-account) |
| 03 | Constructor chaining | Medium | constructors, this | [code](code/ex03-constructor-chaining) / [solution](solutions/ex03-constructor-chaining) |
| 04 | Customer validation | Medium | validation, getters | [code](code/ex04-customer-validation) / [solution](solutions/ex04-customer-validation) |
| 05 | Reference aliasing | Medium | identity, aliasing, copy | [code](code/ex05-reference-aliasing) / [solution](solutions/ex05-reference-aliasing) |
| 06 | Static ID generator | Hard | static state, instance fields | [code](code/ex06-static-id-generator) / [solution](solutions/ex06-static-id-generator) |
| 07 | POJO vs record | Hard | data carriers, accessors | [code](code/ex07-pojo-vs-record) / [solution](solutions/ex07-pojo-vs-record) |
| 08 | Value object equality | Hard | equals, hashCode, Object | [code](code/ex08-value-object-equality) / [solution](solutions/ex08-value-object-equality) |
| 09 | Worker inheritance | Hard | extends, abstract behavior | [code](code/ex09-inheritance-workers) / [solution](solutions/ex09-inheritance-workers) |
| 10 | Polymorphic payroll | Hard | override, dynamic dispatch | [code](code/ex10-polymorphic-payroll) / [solution](solutions/ex10-polymorphic-payroll) |
| 11 | this/super constructor chain | Hard | super, override, constructor order | [code](code/ex11-this-super-chain) / [solution](solutions/ex11-this-super-chain) |
| 12 | Overload/override trace | Hard | compile-time vs runtime dispatch | [code](code/ex12-overload-override-trace) / [solution](solutions/ex12-overload-override-trace) |
| 13 | Text block report | Very Hard | text blocks, formatting | [code](code/ex13-text-block-report) / [solution](solutions/ex13-text-block-report) |
| 14 | String normalizer | Very Hard | immutable String, strip, blank | [code](code/ex14-string-normalizer) / [solution](solutions/ex14-string-normalizer) |
| 15 | String parser | Very Hard | indexOf, substring, validation | [code](code/ex15-string-parser) / [solution](solutions/ex15-string-parser) |
| 16 | StringBuilder CSV | Very Hard | builder, loop formatting | [code](code/ex16-stringbuilder-csv) / [solution](solutions/ex16-stringbuilder-csv) |
| 17 | Immutable order | Very Hard | defensive copy, record/value | [code](code/ex17-immutable-order) / [solution](solutions/ex17-immutable-order) |
| 18 | Object contract audit | Extreme | equals/hashCode/toString | [code](code/ex18-object-contract-audit) / [solution](solutions/ex18-object-contract-audit) |
| 19 | OOP state machine | Extreme | encapsulation, commands, static registry | [code](code/ex19-oop-state-machine) / [solution](solutions/ex19-oop-state-machine) |
| 20 | OOP model capstone | Extreme | integrated object-model audit | [code](code/ex20-oop-model-capstone) / [solution](solutions/ex20-oop-model-capstone) |

## Chạy một bài

~~~powershell
cd code/ex01-class-object-model
javac --release 17 Main.java SelfCheck.java
java SelfCheck
~~~

Lời giải thành công phải in PASS.

## Chạy toàn bộ solutions

~~~powershell
./verify-solutions.ps1
~~~

