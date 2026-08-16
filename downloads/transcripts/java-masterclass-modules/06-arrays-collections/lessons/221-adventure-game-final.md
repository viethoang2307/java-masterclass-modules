# 221. Adventure game: parser, transition và BFS

## Parser boundary

~~~java
static String direction(String raw) {
    String command = raw.strip().toUpperCase(Locale.ROOT);
    return switch (command) {
        case "N", "NORTH" -> "N";
        case "S", "SOUTH" -> "S";
        case "E", "EAST" -> "E";
        case "W", "WEST" -> "W";
        case "Q", "QUIT" -> "Q";
        default -> "?";
    };
}
~~~

Domain transition nhận normalized command và trả result; I/O layer chỉ đọc/in.

## Shortest path

BFS dùng Queue<Integer> và Set<Integer> visited, lưu predecessor để reconstruct path. Graph có cycle nên visited là bắt buộc.

## Test matrix

Test lowercase/whitespace, alias, valid direction không có exit, destination lỗi, quit không đổi state và unknown command.

## Bài tập

Implement shortestPath immutable list ID và test start=goal, unreachable, cycle và missing node.
