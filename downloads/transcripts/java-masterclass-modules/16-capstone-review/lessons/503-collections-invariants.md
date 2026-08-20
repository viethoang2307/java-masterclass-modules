# 503 — Collections và invariant

Chọn collection theo contract:

- `List`: thứ tự và duplicate có nghĩa;
- `Set`: uniqueness là invariant;
- `Map`: lookup theo key, key phải có equality/hash ổn định;
- immutable snapshot: consumer không thể sửa state owner.

Không expose mutable internal collection:

```java
public List<Track> tracks() { return List.copyOf(tracks); }
```

Khi cập nhật aggregate, validate duplicate ID, ordering và ownership trong một operation. `HashMap` cần key immutable; nếu key mutate sau insert, lookup có thể mất entry.

## Concurrency note

`List.copyOf` tạo snapshot nhưng không làm việc đọc/ghi gốc thread-safe. Chọn lock, actor, single-writer hoặc immutable state transition theo ownership.

## Checkpoint

Viết invariant cho `Album.tracks`: ID unique, vị trí liên tục, title non-blank, thứ tự hiển thị ổn định.

