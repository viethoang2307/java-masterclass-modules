# 376 — Entity lifecycle

Entity thường đi qua `new/transient`, `managed`, `detached`, `removed`. `persist` đưa object vào context; dirty checking phát hiện thay đổi managed khi flush; `merge` copy state vào instance managed khác.

```text
new -> persist -> managed -> detach/clear -> detached
                         └-> remove -> removed
```

Đừng giữ entity managed quá lâu; persistence context lớn làm memory và flush cost tăng. `equals/hashCode` cần nhất quán với id strategy, đặc biệt trước khi id generated.

## Bài tự luyện

Mô tả điều gì xảy ra khi sửa entity sau `detach`, gọi `merge`, rồi rollback transaction.
