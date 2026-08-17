# Lesson 187 — Predicate

## Mục tiêu

Dùng Predicate<T> cho điều kiện; composition and/or/negate; và kiểm soát short-circuit, null policy.

~~~java
Predicate<String> longEnough = value -> value.length() >= 8;
Predicate<String> hasDigit = value -> value.chars().anyMatch(Character::isDigit);
Predicate<String> valid = longEnough.and(hasDigit);
~~~

and/or short-circuit. Nếu điều kiện đầu false trong and, điều kiện sau không chạy. Với primitive hot loop, cân nhắc IntPredicate để tránh boxing.

Null policy phải rõ: Objects::nonNull.and(valid), fail fast hoặc contract non-null. Predicate không nên có side effect.

## Lỗi thường gặp

Dùng or thay vì and, chạy predicate expensive trước predicate cheap, và dùng mutable shared state.

## Bài tập

Xây filter rule User: active, email hợp lệ, age tối thiểu. Đếm call để chứng minh short-circuit.

