# 510 — JavaFX view model và unidirectional state

View model là cầu giữa application service và JavaFX. Nó giữ observable state, selected ID, busy/error message và command methods; UI bind vào state thay vì gọi repository trực tiếp.

```java
private final ReadOnlyObjectWrapper<ScreenState> state =
    new ReadOnlyObjectWrapper<>(ScreenState.empty());
```

## State transition

`Idle -> Loading -> Ready` hoặc `Loading -> Error`; mọi transition ghi lại invariant. Khi selection bị xóa khỏi list, clear selection; khi filter đổi, không giữ index cũ mù quáng.

## Thread rule

Background task chỉ tạo immutable result. Chuyển result sang UI thread trước khi set JavaFX property/observable list. Test view model bằng fake service và deterministic executor.

## Checkpoint

Định nghĩa `ScreenState` cho empty, loading, content và error; liệt kê event làm state đổi và UI effect tương ứng.

