# Module 04 — Classes và Object Model

## Mục tiêu

Sau module này, người học có thể:

- model state và behavior bằng class/object/instance;
- thiết kế constructor, overload, constructor chaining và validation;
- bảo vệ invariant bằng encapsulation, getters và command methods;
- giải thích reference, aliasing, identity, equality và Object contract;
- phân biệt static/instance members và quản lý shared state;
- chọn POJO hay record cho data carrier;
- hiểu inheritance, this, super, overload và override;
- xử lý String immutable, text block, String methods và StringBuilder.

## Dependency

Module 02 cung cấp primitive/String basics. Module 03 cung cấp methods, control flow và parsing. Module 05 sẽ mở rộng sang composition, encapsulation design, polymorphism và abstraction.

## Phạm vi source

Track chính của module là lesson 072 và 079–102:

1. **072, 079–086 — Class/object foundation:** blueprint, state/behavior, fields, getters/setters, bank account, constructors, references.
2. **087–090 — Class design:** static/instance variables/methods, POJO và Java record.
3. **091–098 — Inheritance core:** superclass/subclass, Object, worker challenge, this/super, overload VS override.
4. **099–102 — Text/data representation:** text blocks, String best practices, String manipulation và StringBuilder.

Các lesson 091–118 tiếp tục được khai thác ở Module 05 dưới góc nhìn OOP design; tài liệu ở đây tập trung vào object model và language mechanics.

## Visual map

~~~mermaid
flowchart TD
    A["Class blueprint"] --> B["new Object"]
    B --> C["Instance state"]
    B --> D["Instance behavior"]
    C --> E["Encapsulation"]
    E --> F["Valid state transitions"]
    A --> G["Static class state"]
    A --> H["Constructor contract"]
    H --> B
    I["Superclass"] --> J["Subclass"]
    J --> K["Override and polymorphism"]
    L["String / record"] --> M["Value representation"]
~~~

## Quy ước code

- Java 17, compile bằng javac --release 17.
- Không dùng Maven, Gradle hoặc JUnit.
- Fields thường private; mutation đi qua method có contract.
- Constructor phải tạo object hợp lệ hoặc fail rõ ràng.
- Override dùng @Override; equals/hashCode phải nhất quán.
- Tách domain calculation khỏi console output để self-check deterministic.

## Cấu trúc

- [INDEX.md](INDEX.md) — 25 lesson và thứ tự học.
- [lessons/](lessons) — concept, Java 17 examples, pitfalls và checkpoint.
- [practice/README.md](practice/README.md) — 20 bài Medium đến Extreme.
- [practice/code](practice/code) — starter code có TODO.
- [practice/solutions](practice/solutions) — lời giải đầy đủ và self-check.
- [practice/verify-solutions.ps1](practice/verify-solutions.ps1) — verifier compile/run 20 solutions.

## Chạy practice

~~~powershell
cd practice/code/ex01-class-object-model
javac --release 17 Main.java SelfCheck.java
java SelfCheck
~~~

Chạy toàn bộ solutions:

~~~powershell
./practice/verify-solutions.ps1
~~~

## Reference chính thức

- [Oracle — Classes and Objects](https://docs.oracle.com/javase/tutorial/java/javaOO/)
- [Oracle — Inheritance](https://docs.oracle.com/javase/tutorial/java/IandI/subclasses.html)
- [Oracle — Records](https://docs.oracle.com/en/java/javase/17/language/records.html)
- [Object Java SE 17 API](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/Object.html)
- [String Java SE 17 API](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/String.html)
- [StringBuilder Java SE 17 API](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/StringBuilder.html)

## Module checkpoint

Trước khi sang Module 05, hãy có thể:

- vẽ object/reference diagram cho aliasing;
- giải thích constructor order và this/super;
- bảo vệ balance hoặc score invariant bằng private fields;
- chọn POJO/record với trade-off rõ ràng;
- implement equals/hashCode cho value object;
- giải thích static, overload, override và dynamic dispatch;
- dùng StringBuilder khi tạo output trong loop.

