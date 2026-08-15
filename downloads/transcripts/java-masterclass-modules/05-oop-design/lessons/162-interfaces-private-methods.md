# 162. Private interface methods

## Vì sao cần private helper?

Java 9+ cho phép private method trong interface để share logic giữa default methods mà không publicize helper:

```java
interface Reportable {
    String name();
    default String compact() { return normalize(name()); }
    default String detailed() { return "NAME=" + normalize(name()); }
    private String normalize(String value) { return value.strip(); }
}
```

Private method không phải API cho implementation class; nó chỉ là implementation detail của interface.

## Khi nên chuyển sang class

Nếu private helper bắt đầu giữ nhiều state/policy, interface có thể đang làm quá nhiều. Tách formatter/service để test độc lập.

## Bài tập

Viết interface `Renderable` có hai default format dùng helper private; test null và whitespace contract.

## Pitfalls

Nhầm private interface method với abstract method, hoặc dùng default method để thay một abstract class có shared mutable state.
