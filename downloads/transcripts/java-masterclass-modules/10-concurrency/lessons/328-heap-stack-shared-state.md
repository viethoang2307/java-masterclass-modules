# 328 — Heap, stack và shared state

Mỗi thread có stack riêng cho call frame, parameter và local variable. Object thường nằm trên heap và có thể được nhiều thread tham chiếu. “Biến reference là local” không có nghĩa object mà nó trỏ tới không shared.

```java
final class Session {
    int count; // object trên heap, nếu shared thì cần protocol
}

void task(Session session) {
    int local = 1; // local của từng thread
    session.count += local; // read-modify-write, không atomic
}
```

Biến `count += 1` thực chất là đọc, cộng, ghi. Hai thread có thể cùng đọc giá trị cũ và một increment bị mất. Stack isolation bảo vệ local frame, không bảo vệ field của object shared.

## Ownership trước synchronization

Hỏi ba câu: object này thuộc thread nào? Có cần chia sẻ không? Nếu cần, ai được mutate? Thiết kế ownership rõ ràng thường đơn giản và nhanh hơn bọc mọi thứ bằng lock.

## Pitfall

- `final` bảo vệ assignment reference sau construction, không biến object mutable thành immutable;
- `Collections.unmodifiableList` ngăn mutation qua view nhưng không làm source list thread-safe;
- escape `this` trong constructor có thể cho thread khác thấy object chưa hoàn chỉnh.

## Bài tự luyện

Vẽ heap/stack cho hai thread cùng giữ reference tới một `Session`, rồi liệt kê mọi operation cần bảo vệ khi cập nhật balance và lastSeen.
