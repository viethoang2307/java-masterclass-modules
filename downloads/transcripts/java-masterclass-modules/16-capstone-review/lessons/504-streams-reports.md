# 504 — Streams cho report, không thay thế domain logic

Streams phù hợp cho read model/report:

```java
Map<String, Long> counts = tracks.stream()
    .collect(Collectors.groupingBy(Track::artist, TreeMap::new, Collectors.counting()));
```

Giữ pipeline ngắn, đặt tên intermediate nếu business rule phức tạp. Đừng dùng `parallelStream` mặc định cho I/O hoặc collection nhỏ; benchmark và hiểu thread pool trước.

## Correctness

Đừng mutate shared list trong `forEach`. Chọn collector đúng cho duplicate/null/order. Khi output là API, sort explicit để report deterministic.

## Boundary

Stream query có thể nằm application/read model; invariant ghi dữ liệu vẫn thuộc domain/repository transaction. Không đưa SQL/JavaFX side effect vào `map`/`filter`.

## Checkpoint

Tạo report top artist theo số track và tổng duration, tie-break alphabetic, test empty input và duplicate record.

