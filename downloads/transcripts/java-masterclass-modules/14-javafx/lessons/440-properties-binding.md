# 440 — Properties và binding

JavaFX property cho observable value; binding biểu diễn derived state tự cập nhật.

```java
saveButton.disableProperty().bind(nameField.textProperty().isEmpty());
```

Không bind bidirectional giữa hai property có transform phức tạp mà không define source of truth.
