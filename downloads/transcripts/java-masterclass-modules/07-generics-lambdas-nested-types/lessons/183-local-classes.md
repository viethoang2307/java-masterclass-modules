# Lesson 183 — Local classes

## Mục tiêu

Dùng local class khi helper có tên giúp algorithm dễ đọc nhưng không cần public API; hiểu capture và lexical scope.

~~~java
static List<String> normalize(List<String> input) {
    class Normalizer {
        String apply(String value) {
            return value == null ? "" : value.trim().toLowerCase();
        }
    }
    Normalizer n = new Normalizer();
    return input.stream().map(n::apply).toList();
}
~~~

Local class có thể dùng parameter/local effectively final và enclosing instance. Compiler lưu capture trong field ẩn.

Nếu helper cần unit test riêng, reuse ở nhiều method hoặc có domain meaning, tách thành package-private/top-level class. Đừng dùng local class để né thiết kế module.

## Lỗi thường gặp

Local class quá lớn, capture mutable state, dùng local class khi lambda đủ rõ.

## Bài tập

Viết parseCsvLine có local Tokenizer và Validator, trả immutable result và test input lỗi.

