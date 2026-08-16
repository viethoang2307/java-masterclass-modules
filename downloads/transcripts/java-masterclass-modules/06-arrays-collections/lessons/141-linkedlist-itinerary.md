# 141. Itinerary bằng LinkedList

## Domain rule

Itinerary có thứ tự điểm đến; operation add stop, insert before/after, remove current và navigate. Đừng để console loop quyết định invariant của list.

~~~java
final class Itinerary {
    private final LinkedList<String> stops = new LinkedList<>();
    void add(String stop) {
        if (stop == null || stop.isBlank()) throw new IllegalArgumentException("stop");
        stops.add(stop.strip());
    }
    List<String> snapshot() { return List.copyOf(stops); }
}
~~~

## Cursor design

Nếu navigation state quan trọng, giữ cursor hợp lệ và document behavior khi remove current hoặc đi quá đầu/cuối. Có thể trả Optional thay vì null.

## Bài tập

Thêm next/previous/current, ordered insertion và undo command. Test empty itinerary, boundary navigation và snapshot không leak.

## Lỗi thường gặp

Trả LinkedList nội bộ, cursor trỏ node đã remove, và trộn parsing command với model.
