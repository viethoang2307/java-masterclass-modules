# 212. Task Set challenge: merge theo key

## Phân loại key

~~~java
Set<TaskKey> localKeys = new HashSet<>(local.keySet());
Set<TaskKey> remoteKeys = new HashSet<>(remote.keySet());

Set<TaskKey> localOnly = new HashSet<>(localKeys);
localOnly.removeAll(remoteKeys);

Set<TaskKey> common = new HashSet<>(localKeys);
common.retainAll(remoteKeys);
~~~

Map lưu phiên bản; Set hỗ trợ partition key. localOnly, remoteOnly và common phải đôi một rời nhau, union bằng toàn bộ key.

## Merge rule mẫu

Task chỉ có một phía được giữ. Cùng key cùng status giữ một bản. Cùng key khác status chọn progression cao hơn hoặc ghi conflict. Rule phải là code/data explicit.

## Bài tập

Trả report deterministic theo key, thêm conflict list và test conflict không bị mất.

## Pitfalls

Dùng Set<Task> khiến state mutation làm duplicate behavior khó hiểu, merge theo display text và sửa input map trực tiếp.
