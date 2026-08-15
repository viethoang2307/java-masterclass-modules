# 102. `StringBuilder` và output động

## Vì sao cần StringBuilder?

`String` immutable. Nối trong loop bằng `+` có thể tạo nhiều intermediate object; `StringBuilder` giữ buffer mutable và append tuần tự.

```java
static String formatNames(List<String> names) {
    StringBuilder result = new StringBuilder();
    for (int i = 0; i < names.size(); i++) {
        if (i > 0) result.append(", ");
        result.append(names.get(i));
    }
    return result.toString();
}
```

`toString()` tạo snapshot String; caller không thấy builder nội bộ.

## Chọn công cụ

`String.join` phù hợp delimiter đơn giản, `StringJoiner` có prefix/suffix, `StringBuilder` phù hợp report nhiều section, còn `Formatter` phù hợp format số/ngày nhưng cần hiểu locale.

## Bài tập và pitfalls

Viết `OrderReport` gồm header, line items, total và newline cuối cố định. Test empty list, một item, nhiều item và Unicode. Tránh quên `toString`, delimiter thừa và dùng builder dùng chung giữa threads.

## Checkpoint

Formatter là adapter ở rìa hệ thống; domain object không nên bị thiết kế theo cách output hiện tại.
