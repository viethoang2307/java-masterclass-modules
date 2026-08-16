# Lesson 197 — Functional interface challenge

## Mục tiêu

Thiết kế interface nhỏ cho validation; composition short-circuit; và phân biệt first failure với all failures.

~~~java
@FunctionalInterface
interface Check<T> {
    Optional<String> validate(T value);
    default Check<T> and(Check<T> other) {
        return value -> {
            Optional<String> first = validate(value);
            return first.isPresent() ? first : other.validate(value);
        };
    }
}
~~~

Optional.empty là valid, Optional.of(message) là invalid. Contract phải ghi null, side effect, thứ tự lỗi và exception. Nếu muốn hiển thị tất cả lỗi, tạo AllChecks trả List<String> thay vì gọi lại FirstFailure nhiều lần.

## Lỗi thường gặp

Dùng exception cho invalid input thường, message không deterministic và compose check side effect.

## Bài tập

Validation UserRegistration gồm username, email, age, password; có first failure và all failures, test thứ tự.

