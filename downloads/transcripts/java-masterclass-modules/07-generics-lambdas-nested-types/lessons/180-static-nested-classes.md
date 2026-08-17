# Lesson 180 — Static nested classes

## Mục tiêu

Dùng static nested để nhóm type, ẩn implementation detail và xây immutable value/builder mà không giữ outer reference.

~~~java
class HttpRequest {
    private final String method;
    private final String path;
    private HttpRequest(String method, String path) {
        this.method = method; this.path = path;
    }
    static final class Builder {
        private String method = "GET";
        private String path = "/";
        Builder method(String value) { method = Objects.requireNonNull(value); return this; }
        Builder path(String value) { path = Objects.requireNonNull(value); return this; }
        HttpRequest build() { return new HttpRequest(method, path); }
    }
}
~~~

Nested class được truy cập private member của cùng top-level nest. Static builder dễ test vì không cần Outer object.

## Lỗi thường gặp

Bỏ static vô tình yêu cầu outer instance; builder expose mutable reference; validate thiếu ở build; nested class quá lớn.

## Bài tập

Tạo Config.Builder với host bắt buộc, port 1–65535 và timeout dương. Chứng minh build result không bị builder mutation ảnh hưởng.

