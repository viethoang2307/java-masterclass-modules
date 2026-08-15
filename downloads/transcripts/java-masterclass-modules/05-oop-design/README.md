# Module 05 — OOP Design

Đây là module về cách biến Java mechanics thành design có contract: chọn inheritance hay composition, bảo vệ invariant, giới hạn mutation, dùng polymorphism và dependency inversion. Bản lesson hiện tại được viết để học theo từng bài, không chỉ làm index transcript.

## Kết quả cần đạt

- Phân tích quan hệ IS-A/HAS-A và substitutability trước khi dùng `extends`.
- Thiết kế aggregate có encapsulation, state transition và defensive copy.
- Dùng abstract class cho shared invariant/implementation; dùng interface cho capability và dependency inversion.
- Phân biệt overload/override, static/runtime type, upcast/downcast, `var` và pattern matching.
- Thiết kế value object/record/final class với `equals`, `hashCode`, immutability đúng.
- Dùng default/static/private interface methods có mục đích.
- Giới hạn hierarchy bằng `final`/`sealed` và test randomness bằng dependency injection.

## Bản đồ học

```text
Inheritance + Object contract
          ↓
Composition + Encapsulation + State machine
          ↓
Polymorphism + Factory + Casting
          ↓
Abstract class + Interface + Mapping
          ↓
final + sealed + Integration capstone
```

## Cấu trúc lesson

Mỗi bài gồm: mục tiêu, mental model, ví dụ code, phân tích contract, design trade-off, lỗi thường gặp, bài tập/checkpoint và reference liên quan. Hãy đọc code, tự dự đoán output, sau đó chạy self-check của practice.

## Phạm vi transcript

- 091–102: inheritance, object contracts, `this`/`super`, overload/override và String presentation.
- 103–109: composition, encapsulation, data hiding, state transitions và Printer challenge.
- 110–118: polymorphism, factory, casting, cars và Burger/Order challenge.
- 151–165: abstraction, abstract class, interface, default/static/private methods và mapping.
- 246–249: `final`, sealed hierarchy và Pirate integration.

## Practice

[Practice index](practice/README.md) có 20 bài từ Medium đến Extreme. Starter code ở `practice/code`; lời giải có phân tích và self-check ở `practice/solutions`.

```powershell
cd practice/solutions/ex01-composition-computer
javac --release 17 Main.java SelfCheck.java
java SelfCheck

cd ../..
powershell.exe -ExecutionPolicy Bypass -File .\verify-solutions.ps1
```

## References

- [Oracle — Object-Oriented Programming Concepts](https://docs.oracle.com/javase/tutorial/java/concepts/)
- [Oracle — Inheritance](https://docs.oracle.com/javase/tutorial/java/IandI/subclasses.html)
- [Oracle — Interfaces](https://docs.oracle.com/javase/tutorial/java/IandI/createinterface.html)
- [Oracle — Abstract Methods and Classes](https://docs.oracle.com/javase/tutorial/java/IandI/abstract.html)
- [Java 17 sealed classes](https://docs.oracle.com/en/java/javase/17/language/sealed-classes-and-interfaces.html)
