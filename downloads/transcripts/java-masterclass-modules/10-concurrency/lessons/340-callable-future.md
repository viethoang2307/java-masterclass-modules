# 340 — Callable, submit và Future

`Callable<T>` trả kết quả và có thể ném exception. `submit` trả `Future<T>` để lấy kết quả, timeout hoặc cancel.

```java
Future<Integer> future = pool.submit(() -> expensiveCalculation());
try {
    int value = future.get(500, TimeUnit.MILLISECONDS);
} catch (TimeoutException e) {
    future.cancel(true);
} catch (ExecutionException e) {
    Throwable cause = e.getCause();
}
```

`get()` là blocking. `ExecutionException` bọc exception từ task; cần đọc `getCause`. `cancel(true)` gửi interrupt nhưng task phải kiểm tra interrupt hoặc dùng blocking API phản ứng được.

`invokeAll` chờ tất cả future; `invokeAny` trả task đầu tiên thành công và hủy phần còn lại theo contract. Luôn đưa timeout nếu upstream có latency budget.

## Pitfall

Submit task rồi bỏ `Future` làm lỗi bị mất. Chờ future tuần tự có thể loại bỏ lợi ích song song; submit hết rồi collect hoặc dùng completion strategy.

## Bài tự luyện

Chạy 5 `Callable`, một task fail và một task quá hạn; thiết kế báo cáo phân biệt success, failure, timeout và cancellation.
