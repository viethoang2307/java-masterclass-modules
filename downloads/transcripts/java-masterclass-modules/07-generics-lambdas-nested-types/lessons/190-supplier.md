# Lesson 190 — Supplier

## Mục tiêu

Dùng Supplier cho giá trị được tạo khi get; hiểu lazy default; và phân biệt factory với memoization.

~~~java
Supplier<String> token = () -> UUID.randomUUID().toString();
String first = token.get();
String second = token.get();
~~~

Supplier thường tạo giá trị mỗi lần gọi. Optional.orElse đánh giá default eager, còn orElseGet(Supplier) có thể không gọi fallback khi value có sẵn.

Supplier không tự cache. Memoization cần policy về thread safety, null và failure.

~~~java
static <T> T orElseGet(Optional<T> value, Supplier<T> fallback) {
    return value.orElseGet(fallback);
}
~~~

## Lỗi thường gặp

Tưởng Supplier chạy một lần, capture state không thread-safe, và che factory expensive.

## Bài tập

So sánh eager/lazy bằng counter; viết Lazy<T> chỉ gọi loader một lần và test loader failure.

