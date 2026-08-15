# 96 — Inheritance Challenge Part 2 — Specialized Employees

## Mục tiêu

Hoàn thiện subtype behavior, override đúng contract và kiểm tra polymorphic collection.

## Mental model

Caller nên iterate collection của base type và gọi method virtual. Không cần biết subtype cụ thể cho common operation.

## Ví dụ Java 17

~~~java
abstract class Worker {
    abstract String role();
    abstract long pay();
}
final class HourlyWorker extends Worker {
    private final long rate;
    private final int hours;
    HourlyWorker(long rate, int hours) { this.rate = rate; this.hours = hours; }
    @Override String role() { return "hourly"; }
    @Override long pay() { return rate * hours; }
}
~~~

## Lỗi thường gặp

- Gọi subtype-only method từ base reference.
- Không test zero hours.
- Override trả behavior không hợp contract.

## Bài tập ngắn

Tạo payroll report từ list Worker, dùng dynamic dispatch và test mix subtype.

## Interview prompt

Dynamic dispatch xảy ra ở compile time hay runtime?

## Nguồn

Transcript course lesson 96; code được chuẩn hóa theo Java 17, giữ ý đồ OOP của course.

