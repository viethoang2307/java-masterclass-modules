# 351 — CompletableFuture

`CompletableFuture` biểu diễn kết quả bất đồng bộ và cho phép compose thay vì block tuần tự.

```java
CompletableFuture<User> user = CompletableFuture.supplyAsync(() -> loadUser(id), pool);
CompletableFuture<Profile> profile = user.thenCompose(u -> loadProfile(u.id(), pool));
profile.orTimeout(800, TimeUnit.MILLISECONDS)
       .exceptionally(ex -> fallbackProfile());
```

`thenApply` biến đổi kết quả đồng bộ trong completion thread; `thenApplyAsync` submit sang executor. `thenCompose` flatten future; `thenCombine` phối hợp hai nhánh độc lập; `allOf` không tự gom typed results.

## Error và cancellation

`exceptionally` recover; `handle` nhận cả success/failure; `whenComplete` quan sát nhưng không biến lỗi thành success. Luôn chỉ rõ executor cho workload production, tránh vô tình dùng common pool.

## Bài tự luyện

Fan-out tới ba service giả lập, timeout từng nhánh, fallback một nhánh nhưng fail nếu quá hai nhánh lỗi; test không block caller lâu hơn deadline.
