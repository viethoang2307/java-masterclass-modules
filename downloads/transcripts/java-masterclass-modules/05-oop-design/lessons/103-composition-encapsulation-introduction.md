# 103. Composition và encapsulation: HAS-A trước IS-A

## Mental model

Composition biểu diễn object sở hữu hoặc sử dụng object khác: `Computer HAS-A Monitor`, `Order HAS-A List<Line>`. Caller tương tác qua behavior của aggregate, không sửa parts tùy ý.

```java
final class Computer {
    private final Monitor monitor;
    private final Keyboard keyboard;
    Computer(Monitor monitor, Keyboard keyboard) {
        this.monitor = Objects.requireNonNull(monitor);
        this.keyboard = Objects.requireNonNull(keyboard);
    }
    void boot() { monitor.turnOn(); keyboard.connect(); }
}
```

Composition giảm coupling hierarchy: thay `Monitor` implementation không cần subclass `Computer`. Dependency injection qua constructor cũng giúp test bằng fake object.

## Encapsulation

Encapsulation không chỉ là private field + getter. Nó là quyền quyết định invariant thuộc về object nào. Nếu balance không được âm, `Account.withdraw()` phải kiểm tra; caller không được lấy field rồi tự trừ.

## Ownership

Hãy ghi rõ object được truyền vào là owned, shared hay borrowed. Collection cần defensive copy khi aggregate phải kiểm soát contents:

```java
this.lines = new ArrayList<>(lines);
```

## Bài tập

Vẽ object graph cho `Order → Customer`, `Order → LineItem`, `LineItem → Product`. Đánh dấu object nào immutable, object nào mutable và boundary nào validate.

## Lỗi thường gặp

- Getter trả mutable collection nội bộ.
- Constructor nhận dependency null rồi lỗi muộn.
- Composition nhưng vẫn expose toàn bộ part để caller điều khiển invariant.
