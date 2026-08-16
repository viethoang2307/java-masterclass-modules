# Lesson 189 — Function và BiFunction

## Mục tiêu

Dùng Function<T,R> cho mapping; đọc đúng compose/andThen; và chọn UnaryOperator/BinaryOperator khi cùng type.

~~~java
Function<String, String> trim = String::trim;
Function<String, String> upper = String::toUpperCase;
Function<String, String> normalize = upper.compose(trim);
Function<String, Integer> size = normalize.andThen(String::length);
~~~

compose chạy function argument trước; andThen chạy function hiện tại trước. UnaryOperator<T> diễn đạt T -> T, BinaryOperator<T> diễn đạt T,T -> T. BiFunction phù hợp hai input khác nhau.

Composition không tự catch exception. Không biến mọi lỗi thành null vì mất nguyên nhân; dùng Result/Optional/exception policy.

## Lỗi thường gặp

Đảo compose/andThen, dùng Function cho side effect, và không validate null.

## Bài tập

Viết pipeline parse tiền tệ: trim, normalize separator, parse, validate non-negative; test input lỗi.

