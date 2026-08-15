# 213. `LinkedHashSet` và `TreeSet`

## Mục tiêu

- Chọn set implementation theo ordering.
- Phân biệt equality của hash set và ordering equality của sorted set.

| Loại | Thứ tự | Chi phí phổ biến |
|---|---|---|
| `HashSet` | Không bảo đảm | O(1) average |
| `LinkedHashSet` | Insertion order | O(1) average, tốn thêm liên kết |
| `TreeSet` | Sorted order | O(log n) |

```java
Set<String> insertion = new LinkedHashSet<>();
NavigableSet<Integer> sorted = new TreeSet<>(List.of(9, 2, 7));
```

`TreeSet` xem hai phần tử là trùng nếu comparator trả `0`, dù `equals` có thể trả `false`. Comparator nên nhất quán với equality khi collection đại diện uniqueness nghiệp vụ.

## Lỗi thường gặp

- Chọn `TreeSet` chỉ để output đẹp, dù sort một lần ở rìa đủ dùng.
- Comparator chỉ so một field không unique, làm “mất” phần tử.
- Trông chờ `LinkedHashSet` tự sort.

## Bài tập ngắn

Lưu event theo timestamp và ID, bảo đảm hai event cùng thời điểm vẫn tồn tại.

## Interview prompt

Vì sao comparator trả `0` quyết định uniqueness trong `TreeSet`?

## Nguồn

- Transcript bài 213.
- Java 17 API: `LinkedHashSet`, `TreeSet`, `Comparator`.
