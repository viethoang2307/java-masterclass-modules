# 096. Worker specialization: hourly và salaried

## Validate ở boundary

Subtype nên giữ dữ liệu riêng và validate trong constructor:

```java
final class HourlyWorker extends Worker {
    private final long rateCents;
    private final int hours;
    HourlyWorker(String id, String name, long rateCents, int hours) {
        super(id, name);
        if (rateCents < 0 || hours < 0 || hours > 744)
            throw new IllegalArgumentException("work range");
        this.rateCents = rateCents; this.hours = hours;
    }
    @Override public long calculatePayCents() {
        return Math.multiplyExact(rateCents, hours);
    }
}
```

`SalariedWorker` giữ monthly salary và không cần hours. Cả hai cùng thực hiện một contract nhưng khác algorithm. Constructor bảo vệ giá trị bất biến; payroll service giữ policy chung.

## Khi hierarchy bắt đầu phình

Nếu pay cần tax, overtime, bonus và currency, đừng nhồi mọi policy vào `Worker`. Tách `PayPolicy`, `Money` hoặc value object để hierarchy giữ nhỏ. Inheritance nên biểu diễn variation ổn định, không phải mọi thay đổi nghiệp vụ.

## Bài tập

Tạo worker nhận `PayPolicy` bằng composition. So sánh testability với subclass và viết một test thay policy mà không tạo class mới.

## Lỗi thường gặp

- Dùng field `type` trong base rồi lại switch.
- Constructor subtype gọi method overridable của base.
- Test không đi qua base reference.
