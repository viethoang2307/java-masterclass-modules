# 212. Task Set challenge: triển khai

## Mục tiêu

- Dùng set operations để phân loại task.
- Giải quyết conflict bằng rule explicit.

```java
Set<TaskKey> localKeys = new HashSet<>(local.keySet());
Set<TaskKey> remoteKeys = new HashSet<>(remote.keySet());

Set<TaskKey> localOnly = new HashSet<>(localKeys);
localOnly.removeAll(remoteKeys);

Set<TaskKey> common = new HashSet<>(localKeys);
common.retainAll(remoteKeys);
```

Map thường phù hợp hơn `Set<Task>` khi cần lấy phiên bản task theo key. Set vẫn hữu ích để tính tập key.

## Merge rule mẫu

- Task chỉ có một phía: giữ task đó.
- Cùng key, status giống: giữ một bản.
- Cùng key, status khác: chọn status có mức tiến triển cao hơn hoặc ghi conflict.
- Không âm thầm bỏ conflict.

## Kiểm thử

Xác minh partition: `localOnly`, `remoteOnly`, `common` đôi một rời nhau và union bằng toàn bộ key.

## Bài tập ngắn

Thêm danh sách conflict có thứ tự deterministic để report ổn định.

## Interview prompt

Khi nào chuyển từ `Set<Task>` sang `Map<TaskKey,Task>`?

## Nguồn

- Transcript bài 212.
- Java 17 API: `HashSet`, `HashMap`.
