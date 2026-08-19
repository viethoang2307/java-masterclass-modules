# Lesson 250 — Streams và Collections

## Mục tiêu

Stream là pipeline xử lý dữ liệu một lần, không phải container lưu dữ liệu.

## Mental model

Tách data ownership của Collection khỏi computation pipeline của Stream. Stream lazy, có thể single-use, và terminal operation mới kích hoạt pipeline.

## Ví dụ Java 17

~~~java
List<Integer> values = List.of(1, 2, 3, 4);
long count = values.stream().filter(value -> value % 2 == 0).count();
System.out.println(count);
~~~

## Phân tích

Collection giữ state và có thể duyệt nhiều lần; Stream mô tả cách tính. Không nên dùng Stream để thay thế mọi collection hoặc lưu kết quả trong biến stream.

## Complexity và contract

O(n) cho pipeline filter/count và O(1) auxiliary space trong ví dụ sequential.

Stream là single-use; mọi null policy, ordering, duplicate policy và exception boundary phải được ghi rõ thay vì để mặc định ngầm.

## Lỗi thường gặp

- Gọi terminal operation hai lần trên cùng stream.
- Dùng side effect trong filter/map hoặc dựa vào thứ tự không được contract.
- Dùng reduce cho mutable accumulation khi collector diễn đạt rõ hơn.
- Quên empty result được biểu diễn bởi Optional hoặc collection rỗng.

## Bài tập

Thử chạy lại cùng một Stream sau count và giải thích IllegalStateException. Viết phiên bản dùng Collection để so sánh lifecycle.

