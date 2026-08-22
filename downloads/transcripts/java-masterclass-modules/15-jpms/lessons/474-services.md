# 474 — Service provider trong JPMS

Service là abstraction cho phép module consumer không phụ thuộc compile-time vào implementation cụ thể.

```java
// consumer
module com.acme.app {
    uses com.acme.payment.PaymentGateway;
}

// provider
module com.acme.paypal {
    requires com.acme.payment.api;
    provides com.acme.payment.PaymentGateway
        with com.acme.paypal.PaypalGateway;
}
```

Consumer gọi `ServiceLoader.load(PaymentGateway.class)`. Provider phải có public no-arg constructor hoặc provider class phù hợp với quy tắc `ServiceLoader`.

## Module graph

`uses` không tự tạo dependency tới implementation. Runtime cần provider module nằm trong graph/resolution. Với `jlink`, phải đưa provider vào image nếu ứng dụng sẽ load nó.

## Thiết kế SPI

Service interface nên nhỏ, ổn định và chứa contract lỗi rõ ràng. Implementation không nên lộ package. Có thể có nhiều provider; ứng dụng cần policy chọn provider hoặc xử lý không có provider.

## Checkpoint

Viết pseudocode load tất cả provider, lọc theo `id()`, xử lý trường hợp không có provider và ghi log provider đã chọn.

