# 153. Abstract classes phần 1: shared state và template

## Ví dụ

```java
abstract class Payment {
    private final long amountCents;
    protected Payment(long amountCents) {
        if (amountCents <= 0) throw new IllegalArgumentException("amount");
        this.amountCents = amountCents;
    }
    public final long amountCents() { return amountCents; }
    public final Receipt pay() {
        validate();
        return perform();
    }
    protected void validate() {}
    protected abstract Receipt perform();
}
```

`pay()` là template method bảo vệ sequence; subtype chỉ implement `perform`. Base giữ amount và invariant chung.

## Hook method

Hook mặc định rỗng nên dùng khi optional extension có ý nghĩa. Nếu hook không liên quan tới nhiều subtype, interface hoặc composition có thể rõ hơn.

## Bài tập

Thêm `CardPayment` và `CashPayment`; test `pay()` luôn validate trước perform. Tạo fake gateway để không phụ thuộc network.

## Lỗi thường gặp

Gọi method override trong constructor, để subclass tự set base fields, và cho phép override `pay()` phá sequence.
