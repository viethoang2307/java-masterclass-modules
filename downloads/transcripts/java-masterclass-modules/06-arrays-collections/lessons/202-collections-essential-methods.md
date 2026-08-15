# 202. Collections: các method thiết yếu

## Mục tiêu

- Dùng đúng `addAll`, `copy`, `fill`, `min`, `max`, `sort` và `shuffle`.
- Hiểu precondition của từng thuật toán.

## Ví dụ Java 17

```java
List<Integer> values = new ArrayList<>(List.of(8, 3, 5, 3));
Collections.sort(values);                 // [3, 3, 5, 8]
int min = Collections.min(values);        // 3
int max = Collections.max(values);        // 8
Collections.shuffle(values, new Random(7));
```

`Collections.copy(destination, source)` không tự mở rộng destination. Destination phải có ít nhất `source.size()` phần tử:

```java
List<String> dest = new ArrayList<>(Arrays.asList(new String[3]));
Collections.copy(dest, List.of("A", "B", "C"));
```

## Điểm cần nhớ

- `sort` và `shuffle` sửa list tại chỗ.
- Dùng seeded `Random` để test deterministic.
- `min`/`max` cần natural order hoặc `Comparator`.
- Immutable list sẽ từ chối operation sửa đổi.

## Bài tập ngắn

Viết chương trình shuffle deck với seed nhận từ command line và chứng minh không mất/trùng card.

## Interview prompt

Tại sao `Collections.copy` cần destination đã có đủ kích thước?

## Nguồn

- Transcript bài 202.
- Java 17 API: `java.util.Collections`.
