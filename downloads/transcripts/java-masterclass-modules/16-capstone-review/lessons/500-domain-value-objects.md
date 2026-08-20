# 500 — Domain model và value object

Primitive như `String`, `long`, `double` thường cho phép state không hợp lệ. Value object gom validation và semantics:

```java
public record ArtistName(String value) {
    public ArtistName {
        value = value == null ? "" : value.trim();
        if (value.isEmpty() || value.length() > 120) throw new IllegalArgumentException("invalid artist name");
    }
}
```

Record phù hợp object immutable có equality theo giá trị. Entity cần identity ổn định và lifecycle rõ; đừng dùng record nếu entity cần mutate controlled state.

## Invariant placement

Validate tại boundary nhận input và lặp lại invariant trong constructor/domain operation. Đừng tin UI validation là lớp bảo vệ duy nhất vì import, test hoặc network có thể bypass UI.

## Checkpoint

Thiết kế `TrackId`, `DurationSeconds` và `SearchQuery`; ghi null/blank/range policy và exception type.

