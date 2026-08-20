# 416 — Test lifecycle

`@BeforeEach` tạo fixture sạch cho từng test; `@AfterEach` cleanup resource. `@BeforeAll` dùng cho expensive immutable setup nhưng phải tránh state leak.

Test isolation quan trọng hơn tốc độ vài milliseconds. Shared static mutable fixture là nguồn order-dependent failure.
