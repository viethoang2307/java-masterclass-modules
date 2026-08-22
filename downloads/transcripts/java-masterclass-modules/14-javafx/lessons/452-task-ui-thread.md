# 452 — Task và UI thread

`Task<V>` chạy background; update `message/progress/value` qua API thread-safe, còn node chỉ mutate trên Application Thread.

```java
Task<List<Item>> task = new Task<>() {
    protected List<Item> call() { return load(); }
};
task.setOnSucceeded(e -> list.setAll(task.getValue()));
```

Không gọi `task.get()` trên UI thread khi chưa done.
