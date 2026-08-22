# 497 — Từ requirements tới traceability matrix

Một requirement tốt có actor, trigger, precondition, behavior và observable outcome.

```text
US-03: Khi nhập artist mới, app trim tên, từ chối rỗng,
      lưu thành công và cập nhật ListView.
```

## Matrix

| Requirement | Domain | Adapter | Test | Evidence |
|---|---|---|---|---|
| tên không rỗng | `ArtistName` | form validator | invalid input | SelfCheck/log |
| lưu atomic | repository | file/JDBC adapter | failure giữa chừng | temp file |

Traceability giúp biết một thay đổi ảnh hưởng lớp nào và phát hiện feature chỉ có UI nhưng thiếu domain/test. Mỗi row nên có ID ổn định, không dùng tên ticket mơ hồ.

## Negative cases

Ghi rõ duplicate policy, encoding, timezone, max size, timeout và behavior khi dependency unavailable. Đây là nơi kiến thức expressions, exceptions, I/O và concurrency gặp nhau.

## Checkpoint

Chọn một feature import CSV và viết matrix ít nhất bốn row, gồm một lỗi parse và một lỗi persistence.

