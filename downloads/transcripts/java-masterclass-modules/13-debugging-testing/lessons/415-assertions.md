# 415 — JUnit assertions

JUnit assertions so sánh expected/actual, collection, exception và timeout. Message nên nêu input/expected để failure diagnostic.

```java
assertEquals(42, result.total());
assertTrue(result.items().contains("A"));
```

Không dùng assertion để test implementation detail nếu behavior contract không yêu cầu; tránh nhiều assertion không liên quan trong một test.
