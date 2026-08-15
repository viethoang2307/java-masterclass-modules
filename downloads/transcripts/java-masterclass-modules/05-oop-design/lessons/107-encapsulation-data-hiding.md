# 107. Encapsulation và data hiding

## Getter không tự động là encapsulation

```java
final class Wallet {
    private long cents;
    public long balanceCents() { return cents; }
    public void add(long amount) {
        if (amount <= 0) throw new IllegalArgumentException("amount");
        cents = Math.addExact(cents, amount);
    }
}
```

Caller được hỏi balance nhưng không được set balance tùy ý. Method `add` là command giữ invariant.

## Mutable reference leak

```java
final class Playlist {
    private final List<String> songs;
    Playlist(List<String> songs) { this.songs = new ArrayList<>(songs); }
    List<String> songs() { return List.copyOf(songs); }
}
```

Constructor copy chống caller sửa input; accessor snapshot chống caller sửa internal state. Chọn `Collections.unmodifiableList` khi muốn view sống, `List.copyOf` khi muốn snapshot immutable.

## Access level

Bắt đầu với `private`. Mở `public` cho capability caller cần, không mở field “cho tiện”. `protected` tạo contract cho subclass và nên dùng tiết chế.

## Bài tập

Audit một `Customer` class có public setters cho mọi field. Chuyển thành constructor + command methods, viết rõ invariant email, credit limit và status.

## Pitfalls

- Getter trả `ArrayList` nội bộ.
- Setter cho state chỉ được đổi qua workflow.
- Public constructor cho object chưa đủ dữ liệu hợp lệ.
