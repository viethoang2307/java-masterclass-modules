# 395 — URI và URL

URI mô tả resource (`scheme`, authority, path, query, fragment); URL là URI có cơ chế truy cập. Dùng `URI` để parse/resolve/validate trước khi tạo request.

```java
URI base = URI.create("https://example.com/api/");
URI target = base.resolve("users?id=7");
```

`resolve` phụ thuộc slash semantics; encode query value đúng cách, không nối raw user input. Whitelist scheme (`https`) và host khi application gọi outbound service.
