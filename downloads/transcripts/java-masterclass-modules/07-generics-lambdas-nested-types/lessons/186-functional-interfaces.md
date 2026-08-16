# Lesson 186 — Functional interface

## Mục tiêu

Thiết kế interface có đúng một abstract method; dùng @FunctionalInterface; và phân biệt default/static method với abstract method.

~~~java
@FunctionalInterface
interface Transformer<T, R> {
    R apply(T input);
    default <V> Transformer<T, V> andThen(Function<? super R, ? extends V> next) {
        return input -> next.apply(apply(input));
    }
}
~~~

Object methods như equals không làm mất tính functional. Annotation giúp compiler phát hiện khi interface bị thêm abstract method.

Nếu callback cần checked exception, Supplier/Function chuẩn không đủ; tạo CheckedSupplier hoặc adapter có exception policy rõ. Tên method nên phản ánh behavior, null, side effect, thread safety và exception.

## Lỗi thường gặp

Có hai abstract method, dùng Consumer khi cần result, nuốt exception và generic quá rộng khiến inference khó.

## Bài tập

Tạo Validator<T> với validate, and, or, negate; test short-circuit và không gọi rule thừa.

