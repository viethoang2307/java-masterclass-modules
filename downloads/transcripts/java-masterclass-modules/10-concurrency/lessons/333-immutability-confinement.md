# 333 — Immutable state và thread confinement

Concurrency dễ hơn khi không có shared mutable state. Immutable object không đổi sau construction nên có thể share an toàn nếu được publish đúng cách. Thread confinement giữ object chỉ trong một thread, ví dụ local variable, actor mailbox hoặc `ThreadLocal`.

```java
record PriceSnapshot(long cents, String currency) {
    PriceSnapshot {
        if (cents < 0 || currency == null) throw new IllegalArgumentException();
    }
}

final class Context {
    private static final ThreadLocal<String> REQUEST_ID = new ThreadLocal<>();
    static void set(String id) { REQUEST_ID.set(id); }
    static String get() { return REQUEST_ID.get(); }
    static void clear() { REQUEST_ID.remove(); }
}
```

`ThreadLocal` không tự cleanup trong thread pool. Luôn `remove()` trong `finally`, nếu không request trước có thể làm rò context sang request sau.

## Thiết kế

Ưu tiên value object, copy-on-write hoặc message passing trước khi thêm lock. Nếu phải share, share immutable snapshot thay vì container mutable.

## Bài tự luyện

Chuyển một DTO mutable thành immutable record/class; viết test thử mutate list đầu vào sau constructor để chứng minh defensive copy.
