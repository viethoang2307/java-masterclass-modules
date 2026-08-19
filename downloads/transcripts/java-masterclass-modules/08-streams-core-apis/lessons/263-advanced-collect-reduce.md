# Lesson 263 — Advanced Collect và Reduce

## Mục tiêu

Phân tích associativity, combiner và custom collector ở mức vừa đủ.

## Mental model

Collector có supplier tạo container, accumulator thêm phần tử, combiner gộp partial container và finisher tạo output. Parallel yêu cầu combiner đúng.

## Ví dụ Java 17

~~~java
String result = values.stream().collect(
    StringBuilder::new,
    StringBuilder::append,
    StringBuilder::append).toString();
~~~

## Phân tích

Custom collector mutable không nên chia sẻ container ngoài pipeline. Collector CONCURRENT/UNORDERED cần hiểu source order và thread safety.

## Complexity và contract

Sequential O(n); parallel hiệu quả phụ thuộc split/merge cost.

Stream là single-use; mọi null policy, ordering, duplicate policy và exception boundary phải được ghi rõ thay vì để mặc định ngầm.

## Lỗi thường gặp

- Gọi terminal operation hai lần trên cùng stream.
- Dùng side effect trong filter/map hoặc dựa vào thứ tự không được contract.
- Dùng reduce cho mutable accumulation khi collector diễn đạt rõ hơn.
- Quên empty result được biểu diễn bởi Optional hoặc collection rỗng.

## Bài tập

Tạo collector tính length total và report; kiểm tra cùng kết quả sequential/parallel.

