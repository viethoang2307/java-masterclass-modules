# Practice — Module 05 — OOP Design

Bộ 20 bài tăng dần từ Medium đến Extreme, bao phủ composition, encapsulation, polymorphism, abstract class, interface, casting, immutable value object, final/sealed và OOP integration.

## Quy ước

- code/: đề bài, starter code có TODO, sample và completion criteria.
- solutions/: lời giải, hướng tư duy, pitfalls, complexity và SelfCheck.
- Mỗi exercise compile riêng bằng javac --release 17.
- Không Maven, Gradle hoặc JUnit.
- SelfCheck deterministic, không phụ thuộc random hoặc interactive input.

## Mức độ

- 01–05: Medium
- 06–12: Hard
- 13–17: Very Hard
- 18–20: Extreme

## Mục lục

| # | Bài | Độ khó | Coverage | Thư mục |
|---:|---|---|---|---|
| 01 | Computer composition | Medium | HAS-A, delegation | [code](code/ex01-composition-computer) / [solution](solutions/ex01-composition-computer) |
| 02 | Encapsulated Printer | Medium | invariant, state commands | [code](code/ex02-encapsulation-printer) / [solution](solutions/ex02-encapsulation-printer) |
| 03 | Polymorphic workers | Medium | abstract base, override | [code](code/ex03-polymorphic-workers) / [solution](solutions/ex03-polymorphic-workers) |
| 04 | Abstract payments | Medium | abstract class, template | [code](code/ex04-abstract-payments) / [solution](solutions/ex04-abstract-payments) |
| 05 | Interface mappers | Medium | interface contract | [code](code/ex05-interface-mappers) / [solution](solutions/ex05-interface-mappers) |
| 06 | Value object contract | Hard | equals/hashCode | [code](code/ex06-value-object-contract) / [solution](solutions/ex06-value-object-contract) |
| 07 | Sealed Result | Hard | sealed hierarchy, records | [code](code/ex07-sealed-result) / [solution](solutions/ex07-sealed-result) |
| 08 | Strategy pricing | Hard | composition, strategy interface | [code](code/ex08-strategy-pricing) / [solution](solutions/ex08-strategy-pricing) |
| 09 | Stateful aggregate | Hard | encapsulation, transitions | [code](code/ex09-stateful-aggregate) / [solution](solutions/ex09-stateful-aggregate) |
| 10 | Capability design | Hard | interface segregation | [code](code/ex10-capability-design) / [solution](solutions/ex10-capability-design) |
| 11 | Casting audit | Hard | upcast/downcast/instanceof | [code](code/ex11-casting-audit) / [solution](solutions/ex11-casting-audit) |
| 12 | Factory polymorphism | Hard | factory, base references | [code](code/ex12-factory-polymorphism) / [solution](solutions/ex12-factory-polymorphism) |
| 13 | Immutable meal | Very Hard | defensive copy, composition | [code](code/ex13-immutable-meal) / [solution](solutions/ex13-immutable-meal) |
| 14 | Burger composition | Very Hard | aggregate pricing | [code](code/ex14-burger-composition) / [solution](solutions/ex14-burger-composition) |
| 15 | Order pricing | Very Hard | polymorphic line items | [code](code/ex15-order-pricing) / [solution](solutions/ex15-order-pricing) |
| 16 | Abstract storefront | Very Hard | abstraction, open/closed | [code](code/ex16-abstract-storefront) / [solution](solutions/ex16-abstract-storefront) |
| 17 | Notification ports | Very Hard | interface adapters | [code](code/ex17-notification-ports) / [solution](solutions/ex17-notification-ports) |
| 18 | OOP receipt | Extreme | object contract, formatting | [code](code/ex18-oop-receipt) / [solution](solutions/ex18-oop-receipt) |
| 19 | Pirate combat | Extreme | state, capabilities, composition | [code](code/ex19-pirate-combat) / [solution](solutions/ex19-pirate-combat) |
| 20 | OOP design capstone | Extreme | integrated OOP audit | [code](code/ex20-oop-design-capstone) / [solution](solutions/ex20-oop-design-capstone) |

## Chạy một bài

~~~powershell
cd code/ex01-composition-computer
javac --release 17 Main.java SelfCheck.java
java SelfCheck
~~~

Lời giải thành công phải in PASS.

## Chạy toàn bộ solutions

~~~powershell
./verify-solutions.ps1
~~~

