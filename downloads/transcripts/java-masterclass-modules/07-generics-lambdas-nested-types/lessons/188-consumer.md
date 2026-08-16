# Lesson 188 — Consumer

## Mục tiêu

Dùng Consumer<T> khi callback nhận dữ liệu và không trả kết quả; hiểu andThen và side-effect contract.

~~~java
Consumer<String> audit = value -> System.out.println("AUDIT " + value);
Consumer<String> send = value -> System.out.println("SEND " + value);
Consumer<String> pipeline = audit.andThen(send);
~~~

Consumer trước throw thì Consumer sau không chạy. IntConsumer/BiConsumer phù hợp primitive hoặc hai input. Map.forEach là ví dụ BiConsumer.

Trong parallel stream, không ghi vào ArrayList chung. Dùng collector hoặc thiết kế thread-safe. Nếu cần tạo object mới, dùng Function thay vì Consumer mutation âm thầm.

## Lỗi thường gặp

Mutate input không ghi contract, log dữ liệu nhạy cảm, và mong andThen chạy sau exception.

## Bài tập

Tạo pipeline normalize, audit, persist mô phỏng; test thứ tự và persist failure.

