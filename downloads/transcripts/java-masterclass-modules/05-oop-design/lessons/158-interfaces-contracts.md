# 158. Interface contracts

## Interface là lời hứa

```java
interface Notifier {
    DeliveryResult send(Message message);
}
```

Contract phải nói rõ null, idempotency, retry, exception/result và thread-safety nếu liên quan. Tên method không đủ để caller biết behavior.

## Dependency inversion

Service phụ thuộc interface:

```java
final class AlertService {
    private final Notifier notifier;
    AlertService(Notifier notifier) { this.notifier = Objects.requireNonNull(notifier); }
    DeliveryResult alert(Message message) { return notifier.send(message); }
}
```

Test inject `FakeNotifier`; production inject email/SMS implementation.

## Interface nhỏ

Một interface có `send`, `refund`, `schedule`, `export` buộc implementation phụ thuộc method không cần. Tách theo capability để implementer và consumer chỉ thấy contract liên quan.

## Bài tập

Viết contract comment cho `PaymentGateway.charge`, gồm retry và duplicate request. Tạo fake kiểm tra service gọi đúng một lần.
