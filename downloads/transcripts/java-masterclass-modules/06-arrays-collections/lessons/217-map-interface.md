# 217. `Map` interface

## Mục tiêu

- Dùng `put`, `get`, `containsKey`, `remove` và `getOrDefault`.
- Phân biệt key uniqueness với value duplication.

```java
Map<String, Integer> stock = new HashMap<>();
Integer previous = stock.put("JAVA-17", 10);
int quantity = stock.getOrDefault("JAVA-21", 0);
boolean known = stock.containsKey("JAVA-17");
```

`put` thay value nếu key đã tồn tại và trả value cũ. `get` trả `null` có thể mang hai nghĩa: key vắng hoặc key map tới null; dùng `containsKey` để phân biệt. Domain code thường tránh null value.

## Views

- `keySet()`: tập key.
- `values()`: collection value, có thể trùng.
- `entrySet()`: cặp key/value, hiệu quả khi cần cả hai.

## Lỗi thường gặp

- Dùng `get(...) == null` làm kiểm tra duy nhất khi null value được phép.
- Lặp key rồi lookup lại thay vì lặp `entrySet`.
- Dùng mutable key.

## Bài tập ngắn

Xây phone book với normalized phone/name và xử lý duplicate key rõ ràng.

## Interview prompt

Tại sao `Map` không thể có hai entry với cùng key?

## Nguồn

- Transcript bài 217.
- Java 17 API: `Map`, `HashMap`.
