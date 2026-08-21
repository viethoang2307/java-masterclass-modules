# Lesson 421 — Mockito và unit isolation

## Mục tiêu

Phân biệt state-based test với interaction-based test; mock boundary bên ngoài nhưng không mock mọi domain object.

## Ví dụ

~~~java
@Test
void chargesCustomerAfterPaymentAccepted() {
    PaymentGateway gateway = mock(PaymentGateway.class);
    when(gateway.charge("u1", new BigDecimal("10.00"))).thenReturn(true);
    Checkout checkout = new Checkout(gateway);

    assertTrue(checkout.pay("u1", new BigDecimal("10.00")));

    verify(gateway).charge("u1", new BigDecimal("10.00"));
}
~~~

Mock phù hợp với payment gateway, clock, HTTP client hoặc repository boundary. Value object và pure function thường nên dùng object thật.

## Rules

- Mock only collaborators that are slow, nondeterministic or external.
- Stub behavior needed by the scenario.
- Verify important interaction, not every internal call.
- Reset mock ít khi cần; tạo mới mỗi test.
- Nếu setup mock quá dài, thiết kế class có thể đang quá coupling.

## Lỗi thường gặp

Mock implementation detail, verify quá nhiều, test vẫn pass khi behavior sai vì stub quá rộng.

## Bài tập

Test service có repository và clock: mock repository/clock, dùng domain object thật, kiểm tra cả result và side effect quan trọng.
