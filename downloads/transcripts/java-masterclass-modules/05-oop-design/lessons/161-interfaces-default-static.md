# 161. Default và static methods trong interface

## Default method

Default method cho phép thêm behavior có implementation mà không phá mọi implementation cũ:

```java
interface Auditable {
    String id();
    default String auditKey() { return "AUDIT:" + id(); }
}
```

Dùng cho behavior derivable từ contract, không dùng để nhét business state vào interface.

## Static method

Static interface method được gọi qua interface, không qua instance:

```java
interface MoneyRules {
    static long requireNonNegative(long cents) {
        if (cents < 0) throw new IllegalArgumentException("negative");
        return cents;
    }
}
```

## Conflict

Một class implement hai interface có cùng default signature phải override và resolve conflict. Class method thắng interface default.

## Bài tập

Tạo hai interface có default `label()`, implement chung và resolve rõ bằng `InterfaceA.super.label()` hoặc implementation mới.
