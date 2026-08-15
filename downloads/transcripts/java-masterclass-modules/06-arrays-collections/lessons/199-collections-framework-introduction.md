# 199. Collections Framework: bức tranh tổng thể

## Mục tiêu

- Phân biệt `Collection`, `Collections` và Java Collections Framework.
- Chọn đúng cấu trúc dữ liệu dựa trên thứ tự, trùng lặp và cách tra cứu.

## Mental model

`Collection<E>` là interface gốc cho nhóm phần tử. `List` giữ thứ tự và cho phép trùng, `Set` loại trùng, còn `Queue` mô hình hóa hàng đợi. `Map<K,V>` thuộc framework nhưng không kế thừa `Collection` vì nó lưu cặp khóa–giá trị. `Collections` là utility class chứa các thuật toán static.

```java
List<String> order = new ArrayList<>();
Set<String> tags = new HashSet<>();
Map<String, Integer> stock = new HashMap<>();
```

## Chọn cấu trúc

- Cần truy cập theo index: `ArrayList`.
- Cần phần tử duy nhất: `HashSet`.
- Cần thứ tự sort tự nhiên: `TreeSet` hoặc `TreeMap`.
- Cần lookup theo key: `HashMap`.

## Lỗi thường gặp

- Dùng `List` rồi tự kiểm tra trùng thay vì biểu diễn invariant bằng `Set`.
- Nhầm `Collection` interface với `Collections` utility class.
- Chọn collection theo thói quen mà không xác định operation chính.

## Bài tập ngắn

Chọn cấu trúc phù hợp cho playlist, username duy nhất, bảng tồn kho và hàng chờ in; giải thích bằng hai tiêu chí.

## Interview prompt

Vì sao `Map` không extends `Collection`?

## Nguồn

- Transcript bài 199.
- Java 17 API: `java.util.Collection`, `java.util.Collections`.
