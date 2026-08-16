# Lesson 194 — Composition của Function và Predicate

## Mục tiêu

Xây pipeline từ function nhỏ; short-circuit predicate; và giữ error boundary rõ.

~~~java
Function<String, String> normalize =
    String::trim;
normalize = normalize.andThen(String::toLowerCase);

Predicate<String> emailLike =
    value -> !value.isBlank()
        && value.indexOf('@') >= 0;
~~~

Composition tạo function mới, không chạy ngay. Predicate có thể dùng ? super T khi nhận input:

~~~java
static <T> Predicate<T> not(Predicate<? super T> p) {
    return value -> !p.test(value);
}
~~~

Mỗi function nên có invariant rõ. Parse có thể throw; hãy chọn Result/Optional/exception policy thay vì trả null tùy tiện.

## Bài tập

Tạo pipeline Username gồm parse, validate, format; test null, blank, Unicode và ký tự sai.

