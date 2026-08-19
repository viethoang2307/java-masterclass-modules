# Lesson 271 — Random và Randomness

## Mục tiêu

Phân biệt Random, ThreadLocalRandom, SplittableRandom và SecureRandom theo use case.

## Mental model

Random stream có thể tạo finite values bằng ints(origin,bound), nhưng stream vẫn lazy. Bound là inclusive/exclusive theo overload; phải kiểm tra seed nếu test deterministic.

## Ví dụ Java 17

~~~java
Random random = new Random(42);
List<Integer> sample = random.ints(5, 1, 7).boxed().toList();
int dice = ThreadLocalRandom.current().nextInt(1, 7);
~~~

## Phân tích

Random không phải cryptographic source. Seed giúp reproducible test nhưng không nên dùng cho token bảo mật. Infinite random stream cần limit.

## Complexity và contract

Tạo 5 phần tử O(5); random generation cost constant per value.

Mọi pipeline cần nói rõ single-use, null handling, encounter order, duplicate handling, numeric precision và exception boundary.

## Lỗi thường gặp

- Dùng side effect mutable trong stream rồi gọi parallel.
- Lạm dụng Optional hoặc reduce làm code khó đọc hơn imperative code.
- Nhầm LocalDate, LocalDateTime, Instant và ZonedDateTime.
- Dùng double/Math.round cho tiền mà không có rounding policy.

## Bài tập

Viết dice simulator nhận Random injection, test cùng seed cho cùng output và kiểm tra range.

