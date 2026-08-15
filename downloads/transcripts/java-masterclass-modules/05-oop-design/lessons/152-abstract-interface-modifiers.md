# 152. Abstract class, interface và modifiers

## So sánh nhanh

Abstract class phù hợp khi các subtype chia sẻ state/implementation và có quan hệ domain chặt. Interface phù hợp khi mô tả capability có thể xuất hiện ở các hierarchy không liên quan.

```java
abstract class Document {
    private final String id;
    protected Document(String id) { this.id = id; }
    public final String id() { return id; }
    public abstract String render();
}

interface Exportable { byte[] export(); }
```

Một class có thể implement nhiều interface nhưng chỉ extends một class. Đây là lý do interface hữu ích cho cross-cutting capability.

## Modifier

`abstract` class không instantiate trực tiếp; `final` method khóa invariant; `private` giấu implementation; `protected` mở extension contract cho subclass. Mỗi modifier là một quyết định API, không chỉ style.

## Bài tập

Thiết kế `Report` abstract class có template render và `Exportable` interface cho PDF/CSV. Giải thích vì sao không biến mọi method thành `protected`.

## Pitfalls

Tạo abstract class chỉ để chứa static utility, interface chứa state mutable, hoặc hierarchy inheritance khi chỉ cần capability đều là dấu hiệu abstraction chưa rõ.
