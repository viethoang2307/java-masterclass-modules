# 108. Encapsulation và state transitions

## State machine thay cho boolean rời rạc

```java
enum OrderStatus { DRAFT, SUBMITTED, PAID, CANCELLED }

final class Order {
    private OrderStatus status = OrderStatus.DRAFT;
    public OrderStatus status() { return status; }
    public void submit() {
        require(OrderStatus.DRAFT);
        status = OrderStatus.SUBMITTED;
    }
    public void pay() {
        require(OrderStatus.SUBMITTED);
        status = OrderStatus.PAID;
    }
    private void require(OrderStatus expected) {
        if (status != expected) throw new IllegalStateException("expected " + expected);
    }
}
```

State transition là behavior của aggregate, không phải `order.setPaid(true)`. Một enum giúp liệt kê trạng thái hợp lệ; command method bảo vệ transition.

## Atomicity

Validate mọi precondition trước khi mutate. Nếu `pay()` còn cần charge gateway, cân nhắc status `PAYMENT_PENDING` và result rõ thay vì mutate rồi gọi service có thể fail.

## Test matrix

Test happy path, transition sai, repeated command, exception không đổi state và mỗi terminal state. Property quan trọng: operation fail không làm state drift.

## Bài tập

Thiết kế subscription `TRIAL → ACTIVE → PAUSED → CANCELLED`; viết allowed transition table và test toàn bộ cặp state.

## Pitfalls

- Nhiều boolean tạo trạng thái không hợp lệ.
- Public setter cho enum.
- Nuốt exception rồi vẫn báo success.
