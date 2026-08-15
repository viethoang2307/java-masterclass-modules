# Module 05 — OOP Design

## Mục tiêu

Sau module này, người học có thể:

- chọn inheritance hay composition dựa trên IS-A/HAS-A và substitutability;
- thiết kế encapsulation với invariant, state transitions và aggregate boundary;
- dùng polymorphism, abstract class và interface để giảm conditional coupling;
- phân biệt overload, override, upcast, downcast, var và instanceof pattern;
- thiết kế POJO/record/value object, equals/hashCode và immutable boundary;
- dùng interface default/static/private methods đúng vai trò;
- giới hạn hierarchy bằng final/sealed và xây integration model nhiều object.

## Dependency

Module 04 cung cấp class/object, constructors, references, static/instance, record và Object/String mechanics. Module 5 tập trung vào design trade-off và mở rộng các mechanics đó thành hệ thống OOP.

## Phạm vi source

Track chính gồm 47 lesson:

1. **091–102 — Inheritance và object contracts:** common behavior, Object, this/super, override, String representation.
2. **103–109 — Composition và encapsulation:** Computer, Smart Kitchen, Printer và state transitions.
3. **110–118 — Polymorphism và OOP master challenge:** Movie, factory, casting, cars, Burger/Meal/Order.
4. **151–165 — Abstraction và interfaces:** abstract classes, interfaces, default/static/private methods, mapping challenge.
5. **246–249 — Restricted hierarchies và integration:** final, sealed, Pirate game và deterministic enhancements.

## Visual map

~~~mermaid
flowchart TD
    A["Domain requirement"] --> B{"IS-A or HAS-A?"}
    B -->|IS-A| C["Inheritance / abstract class"]
    B -->|HAS-A| D["Composition / aggregate"]
    C --> E["Override + polymorphism"]
    D --> F["Encapsulation + commands"]
    E --> G["Interface contract"]
    F --> G
    G --> H["Consumer depends on abstraction"]
    H --> I["Test invariant and scenarios"]
    J["final / sealed"] --> C
~~~

## Design checklist

- Một class có một responsibility rõ hay đang thành god object?
- Invariant nằm ở constructor/command boundary hay bị rải trong caller?
- Caller cần concrete type hay chỉ cần capability interface?
- Có thể thay subtype bằng base type mà không phá contract không?
- Mutable collection/reference có bị leak không?
- equals/hashCode/toString có đúng value semantics không?
- Hierarchy này cần mở rộng tự do, giới hạn bằng sealed hay cấm bằng final?
- Randomness, clock và I/O có được inject để test deterministic không?

## Quy ước code

- Java 17, compile bằng javac --release 17.
- Không dùng Maven, Gradle hoặc JUnit.
- SelfCheck gọi domain methods trực tiếp; solution không phụ thuộc interactive console.
- Dùng @Override, private fields và immutable boundary khi phù hợp.
- Mọi failure contract phải được document: boolean, null, exception hoặc Result.

## Cấu trúc

- [INDEX.md](INDEX.md) — 47 lesson.
- [lessons/](lessons) — tài liệu concept, code, pitfalls và checkpoint.
- [practice/README.md](practice/README.md) — 20 bài Medium đến Extreme.
- [practice/code](practice/code) — starter code có TODO.
- [practice/solutions](practice/solutions) — lời giải và self-check.
- [practice/verify-solutions.ps1](practice/verify-solutions.ps1) — verifier.

## Reference chính thức

- [Oracle — Object-Oriented Programming Concepts](https://docs.oracle.com/javase/tutorial/java/concepts/)
- [Oracle — Inheritance](https://docs.oracle.com/javase/tutorial/java/IandI/subclasses.html)
- [Oracle — Interfaces](https://docs.oracle.com/javase/tutorial/java/IandI/createinterface.html)
- [Oracle — Abstract Methods and Classes](https://docs.oracle.com/javase/tutorial/java/IandI/abstract.html)
- [Oracle — Sealed Classes](https://docs.oracle.com/en/java/javase/17/language/sealed-classes-and-interfaces.html)
- [Java Language Specification, Java SE 17](https://docs.oracle.com/javase/specs/jls/se17/html/index.html)

## Module checkpoint

Trước khi sang Module 06, hãy có thể:

- giải thích bằng diagram khi composition tốt hơn inheritance;
- viết aggregate có invariant và defensive copy;
- thêm subtype/implementation mà không sửa consumer loop;
- chọn abstract class/interface/final/sealed với lý do;
- implement equals/hashCode đúng cho value object;
- test polymorphic scenario và state transition deterministic.

