# 95 — Inheritance Challenge — Worker Hierarchy

## Mục tiêu

Thiết kế hierarchy Worker với common fields/behavior và specialization cho Employee/Contractor.

## Mental model

Challenge nên bắt đầu từ domain vocabulary và substitution: mọi Worker đều có name và pay(), nhưng cách tính pay có thể khác. Common behavior ở superclass, policy riêng ở subtype.

## Ví dụ Java 17

~~~java
abstract class Worker {
    private final String name;
    Worker(String name) { this.name = name; }
    String name() { return name; }
    abstract long pay();
}
final class Employee extends Worker {
    private final long monthly;
    Employee(String name, long monthly) {
        super(name); this.monthly = monthly;
    }
    @Override long pay() { return monthly; }
}
~~~

## Lỗi thường gặp

- Superclass biết quá nhiều subtype.
- Đặt pay field public.
- Subclass không enforce non-negative amount.

## Bài tập ngắn

Tạo Worker hierarchy với at least 2 subtype và tính tổng pay qua Worker reference.

## Interview prompt

Khi nào hierarchy nên dùng abstract class thay vì concrete base class?

## Nguồn

Transcript course lesson 95; code được chuẩn hóa theo Java 17, giữ ý đồ OOP của course.

