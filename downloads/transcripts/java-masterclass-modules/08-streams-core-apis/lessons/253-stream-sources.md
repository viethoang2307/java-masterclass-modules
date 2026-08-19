# Lesson 253 — Stream Sources

## Mục tiêu

Tạo stream từ Collection, array, Stream.of, builder, iterate, generate và primitive stream.

## Mental model

Source quyết định finite/infinite, ordering và resource lifecycle. Infinite source phải có limit hoặc short-circuit terminal.

## Ví dụ Java 17

~~~java
int[] scores = {3, 5, 7};
IntStream.of(scores).sum();
Stream.iterate(1, value -> value <= 100, value -> value * 2)
    .forEach(System.out::println);
~~~

## Phân tích

Stream.generate/iterate có thể vô hạn. Files.lines và resource stream cần try-with-resources. Không tự tiện gọi parallel trên source chưa hiểu characteristics.

## Complexity và contract

Finite sum là O(n); infinite stream chỉ an toàn khi có giới hạn.

Stream là single-use; mọi null policy, ordering, duplicate policy và exception boundary phải được ghi rõ thay vì để mặc định ngầm.

## Lỗi thường gặp

- Gọi terminal operation hai lần trên cùng stream.
- Dùng side effect trong filter/map hoặc dựa vào thứ tự không được contract.
- Dùng reduce cho mutable accumulation khi collector diễn đạt rõ hơn.
- Quên empty result được biểu diễn bởi Optional hoặc collection rỗng.

## Bài tập

Tạo stream số Fibonacci có limit 10, array stream và stream từ range; ghi ordering từng source.

