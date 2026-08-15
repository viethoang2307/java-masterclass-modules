# 221. Adventure game: hoàn thiện parser và loop

## Mục tiêu

- Xử lý command dài, alias và quit.
- Giữ game loop nhỏ, deterministic và test được.

```java
static String direction(String raw) {
    String normalized = raw.strip().toUpperCase(Locale.ROOT);
    return switch (normalized) {
        case "N", "NORTH" -> "N";
        case "S", "SOUTH" -> "S";
        case "E", "EAST" -> "E";
        case "W", "WEST" -> "W";
        case "Q", "QUIT" -> "Q";
        default -> "?";
    };
}
```

Domain method nên nhận `currentId` và command rồi trả transition result; I/O layer chỉ đọc/in.

## Test matrix

- Command viết thường, có whitespace.
- Alias đầy đủ và ký tự ngắn.
- Direction hợp lệ nhưng không có exit.
- Destination không tồn tại.
- Quit không làm thay state.
- Command không nhận diện.

## Mở rộng

Có thể dùng BFS với `Queue<Integer>` và `Set<Integer>` để tìm đường ngắn nhất giữa hai location.

## Bài tập ngắn

Thêm `shortestPath(world, start, goal)` và trả immutable list ID.

## Interview prompt

Tại sao parser và state transition nên là hai concern riêng?

## Nguồn

- Transcript bài 221.
- Java 17 API: switch expressions, `Queue`, `Set`.
