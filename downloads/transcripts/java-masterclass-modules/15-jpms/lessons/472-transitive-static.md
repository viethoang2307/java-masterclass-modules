# 472 — `requires transitive` và `requires static`

Mặc định, dependency không được truyền cho consumer. Nếu module `A requires B` và `B requires C`, module `A` không tự động đọc `C`.

```java
module com.acme.api {
    requires transitive com.acme.types;
}
```

`requires transitive` nói rằng mọi module đọc `com.acme.api` cũng được readability tới `com.acme.types`. Dùng khi public API của A chứa type từ B; nếu không, consumer sẽ phải khai báo dependency trực tiếp.

```java
module com.acme.tooling {
    requires static com.acme.annotations;
}
```

`requires static` cần dependency lúc compile nhưng không bắt buộc ở runtime. Nó phù hợp annotation/compiler support không xuất hiện trong execution path, không phù hợp database driver mà code thật sự gọi lúc chạy.

## Cạm bẫy

- Dùng `transitive` quá nhiều làm graph phình to và API bị dính implementation.
- Dùng `static` cho runtime dependency dẫn tới `NoClassDefFoundError`.
- Nhầm `transitive` với re-export tất cả package: readability không đồng nghĩa package được export.

## Checkpoint

Phân loại các dependency của một SDK: public DTO, logging API, annotation và JDBC driver; quyết định directive cho từng loại và giải thích.

