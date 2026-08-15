# 219. Collection views của Map

## Mục tiêu

- Hiểu backing views từ `keySet`, `values`, `entrySet`.
- Sửa map an toàn qua iterator hoặc entry.

```java
Map<String, Integer> stock = new HashMap<>(Map.of("A", 0, "B", 3));
stock.entrySet().removeIf(entry -> entry.getValue() == 0);
```

Views liên kết với map gốc: remove qua view sẽ remove mapping. Thông thường không thể `add` entry tùy ý qua view.

```java
for (Map.Entry<String, Integer> entry : stock.entrySet()) {
    entry.setValue(entry.getValue() + 1);
}
```

## Snapshot khi nào?

Dùng `Set.copyOf(map.keySet())` hoặc `List.copyOf(map.values())` khi cần immutable snapshot, không muốn thay đổi sau đó của map phản ánh vào dữ liệu trả về.

## Lỗi thường gặp

- Nghĩ `keySet()` là bản copy độc lập.
- Sửa map trực tiếp trong enhanced for và gặp `ConcurrentModificationException`.
- Dùng `values()` khi cần giữ liên kết với key.

## Bài tập ngắn

Loại mọi entry có quantity bằng 0 và trả snapshot key còn lại.

## Interview prompt

Backing view khác defensive copy ở điểm nào?

## Nguồn

- Transcript bài 219.
- Java 17 API: `Map.keySet`, `values`, `entrySet`.
