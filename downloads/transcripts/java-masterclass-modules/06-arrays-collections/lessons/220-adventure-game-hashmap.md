# 220. Adventure game với `HashMap`

## Mục tiêu

- Mô hình hóa location graph bằng map.
- Tách parse command khỏi navigation rules.

```java
record Location(int id, String description, Map<String, Integer> exits) {
    Location {
        exits = Map.copyOf(exits);
    }
}

Map<Integer, Location> world = new HashMap<>();
```

Mỗi location là node; exits là directed edges từ command (`N`, `S`, `E`, `W`) tới destination ID. `world` cung cấp lookup O(1) average theo ID.

## Navigation

1. Normalize input bằng `strip().toUpperCase(Locale.ROOT)`.
2. Resolve alias command.
3. Tìm destination trong exits của location hiện tại.
4. Xác minh destination tồn tại trong world.
5. Chỉ cập nhật current location khi hợp lệ.

## Lỗi thường gặp

- Mutable exits bị caller sửa.
- Dangling destination ID.
- Trộn `Scanner` loop với domain logic, khó test.

## Bài tập ngắn

Viết validator phát hiện exit trỏ đến location không tồn tại.

## Interview prompt

Vì sao graph representation bằng `Map<ID, Location>` phù hợp với game này?

## Nguồn

- Transcript bài 220.
- Java 17 API: `HashMap`, `Map.copyOf`.
