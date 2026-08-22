# Module 05 — OOP Design Requirements

Bộ này gồm 5 bài requirement độc lập theo hướng project. Mỗi bài yêu cầu thiết kế domain có contract rõ ràng, thay vì chỉ hoàn thành vài TODO rời rạc.

## Lộ trình

| Bài | Tên | Trọng tâm | Độ khó |
|---:|---|---|---|
| 01 | Smart Workspace | composition, encapsulation, dependency injection, state command | Hard |
| 02 | Order Lifecycle Aggregate | aggregate, invariant, state transition, defensive copy, records | Very Hard |
| 03 | Polymorphic Payroll | abstract class, inheritance, override, strategy, factory, overload | Very Hard |
| 04 | Checkout Ports | interfaces, sealed result, capability design, mapping, adapters, DI | Extreme |
| 05 | ShopFlow Capstone | tích hợp toàn bộ Module 05 thành một hệ thống | Extreme+ |

## Cách làm

Nên làm theo thứ tự. Bài sau có thể dùng lại tư duy của bài trước nhưng không bắt buộc phải copy code.

- Mỗi bài có thể đặt trong một thư mục riêng.
- Dùng Java 17 và javac --release 17.
- Tự viết Main.java và SelfCheck.java cho từng bài.
- Domain method không được in debug output.
- Test phải kiểm tra cả happy path, invalid input và state transition.

## Coverage theo Module 05

| Nhóm nội dung | Bài bao phủ |
|---|---|
| HAS-A, composition, constructor injection | 01, 02, 04, 05 |
| Encapsulation và invariant | 01, 02, 05 |
| Aggregate và state transition | 02, 05 |
| Polymorphism và dynamic dispatch | 03, 04, 05 |
| Abstract class và template method | 03, 04 |
| Interface và dependency inversion | 03, 04, 05 |
| Strategy và factory | 03, 04, 05 |
| Record/value object/immutability | 02, 04, 05 |
| equals, hashCode, toString | 02, 03, 05 |
| Capability interface và casting audit | 04, 05 |
| final và sealed | 02, 04, 05 |
| Mapping và notification ports | 04, 05 |

## Quy ước chung

- Tiền dùng long cents, không dùng double.
- Value object phải normalize input và validate ở constructor boundary.
- Collection trả ra ngoài phải là defensive copy hoặc immutable view.
- Class không cần subclass phải là final.
- Consumer nên phụ thuộc vào abstraction, không phụ thuộc implementation cụ thể.
- Nếu một hành vi có thể biểu diễn bằng polymorphism, không rải instanceof theo toàn bộ application service.
