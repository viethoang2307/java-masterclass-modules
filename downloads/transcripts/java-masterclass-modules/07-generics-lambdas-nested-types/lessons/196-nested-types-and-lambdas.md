# Lesson 196 — Nested types kết hợp lambda

## Mục tiêu

Kết hợp static nested command, functional interface và immutable pipeline; kiểm tra ownership và capture.

~~~java
class Pipeline<T> {
    private final List<T> values;
    static final class Step<T> {
        private final Function<T, T> operation;
        Step(Function<T, T> operation) { this.operation = operation; }
        T apply(T value) { return operation.apply(value); }
    }
    Pipeline(List<T> values) { this.values = List.copyOf(values); }
}
~~~

Step static vì không cần Pipeline instance. API cần trả lời: lambda có capture outer mutable state không; pipeline immutable hay mutate; exception boundary; generic variance; nested type public hay implementation detail.

Nếu dùng inner class cho callback gắn outer state, document lifecycle để không giữ outer quá lâu.

## Bài tập

Thiết kế RuleEngine<T> có static Rule, when(Predicate<? super T>, Consumer<? super T>) và evaluate; test rule order, short-circuit, immutable input.

