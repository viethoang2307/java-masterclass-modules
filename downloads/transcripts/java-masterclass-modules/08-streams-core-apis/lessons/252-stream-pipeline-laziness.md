# Lesson 252 — Stream Pipeline và Laziness

## Mục tiêu

Nhìn thấy khi nào lambda chạy và vì sao intermediate operation chưa tạo kết quả.

## Mental model

filter/map/sorted là intermediate. forEach/count/findFirst là terminal. Pipeline không làm việc khi chỉ khai báo.

## Ví dụ Java 17

~~~java
Stream<Integer> pipeline = Stream.of(1, 2, 3)
    .peek(value -> System.out.println("source=" + value))
    .filter(value -> value > 1);
System.out.println("before terminal");
pipeline.findFirst();
~~~

## Phân tích

peek là công cụ quan sát/debug, không phải nơi đặt business mutation. Short-circuit terminal như findFirst có thể không đọc hết source.

## Complexity và contract

Thời gian phụ thuộc số phần tử thực sự được consume; findFirst có thể dừng sớm.

Stream là single-use; mọi null policy, ordering, duplicate policy và exception boundary phải được ghi rõ thay vì để mặc định ngầm.

## Lỗi thường gặp

- Gọi terminal operation hai lần trên cùng stream.
- Dùng side effect trong filter/map hoặc dựa vào thứ tự không được contract.
- Dùng reduce cho mutable accumulation khi collector diễn đạt rõ hơn.
- Quên empty result được biểu diễn bởi Optional hoặc collection rỗng.

## Bài tập

Dùng log để đo thứ tự filter/map và chứng minh filter đặt trước map có thể giảm số lần map.

