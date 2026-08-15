# Bài 13 — Immutable meal

**Độ khó:** Very Hard

## Kiến thức phủ

composition, defensive copy, value objects

## Đề bài

Meal(id, items, cents) phải immutable: copy items, return unmodifiable list, price >=0. totalItems và totalCents.

## Input/output mẫu

~~~text
original list mutate không đổi meal
Meal.items().add -> UnsupportedOperationException
~~~

## Tiêu chí hoàn thành

- Compile bằng javac --release 17.
- Implement đúng class/interface/method contract mà SelfCheck sử dụng.
- Enforce invariant ở constructor hoặc command boundary.
- Consumer không được phụ thuộc concrete type khi đề yêu cầu abstraction.

## Cách chạy

~~~powershell
javac --release 17 Main.java SelfCheck.java
java SelfCheck
java Main
~~~

Starter có TODO có chủ đích. Làm bài trong code trước khi xem solutions.

