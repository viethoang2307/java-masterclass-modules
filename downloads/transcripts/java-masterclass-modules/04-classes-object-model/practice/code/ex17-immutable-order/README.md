# Bài 17 — Immutable order

**Độ khó:** Very Hard

## Kiến thức phủ

defensive copy, List.copyOf, unmodifiable view, value state

## Đề bài

Xây Order(id, items). Constructor phải copy items; items() không cho caller mutate nội bộ. Null item không hợp lệ. totalItems trả size.

## Input/output mẫu

~~~text
List gốc thêm item sau new không đổi order
order.items().add(...) -> UnsupportedOperationException
~~~

## Tiêu chí hoàn thành

- Main.java compile bằng javac --release 17.
- Implement đúng class/method contract mà SelfCheck sử dụng.
- Enforce invariant ở constructor hoặc command method.
- Không để debug output trong domain methods.

## Cách chạy

~~~powershell
javac --release 17 Main.java SelfCheck.java
java SelfCheck
java Main
~~~

Starter có TODO có chủ đích. Làm bài trong code trước khi xem solutions.

