# 417 — Exception và timeout test

Test exception type và message contract vừa đủ; timeout bảo vệ khỏi deadlock/infinite wait.

```java
assertThrows(IllegalArgumentException.class, () -> service.load(-1));
assertTimeout(Duration.ofMillis(100), task);
```

Timeout không biến code chậm thành đúng; điều tra resource leak và synchronization sau failure.
