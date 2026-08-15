# 091. Inheritance: kiểm tra quan hệ IS-A

## Mục tiêu

Sau bài này bạn có thể quyết định một subclass có thực sự là một subtype hay chỉ đang tái sử dụng code một cách nguy hiểm. Trọng tâm không phải cú pháp `extends`, mà là contract và khả năng thay thế.

## Mental model

Inheritance tạo ra quan hệ “mọi đối tượng của `Child` đều có thể được dùng ở nơi cần `Parent`”. Câu hỏi đúng là: nếu caller chỉ biết `Parent`, mọi hành vi hợp lệ của `Child` có còn đúng không? Đây là substitutability, thường gắn với Liskov Substitution Principle.

```java
class Vehicle {
    void start() { System.out.println("engine starts"); }
}

class Car extends Vehicle {
    @Override
    void start() { System.out.println("car starts"); }
}
```

`Car IS-A Vehicle` vì `Car` giữ được ý nghĩa của `start`. Nếu `Vehicle` có `refuel()` nhưng subclass là xe điện và ném `UnsupportedOperationException`, hierarchy đã nói dối caller.

## Cách phân tích trước khi dùng `extends`

1. Viết contract của base type bằng các hành vi caller được phép gọi.
2. Liệt kê invariant của base type.
3. Kiểm tra subclass có thể giữ mọi precondition/postcondition không.
4. Nếu chỉ muốn dùng chung implementation, thử composition hoặc delegation.

## Lỗi thường gặp

- Dùng inheritance chỉ vì hai class có vài field giống nhau.
- Cho base class quá nhiều method khiến subclass phải override bằng exception.
- Override method nhưng thu hẹp input hợp lệ hoặc thay đổi ý nghĩa return.

## Bài tập và checkpoint

Phân tích `Bird`/`Penguin` và `Payment`/`CashPayment`. Viết một hierarchy đúng và một ví dụ nên chuyển sang interface hoặc composition. Nếu bạn phải viết `instanceof` để dùng subtype trong hầu hết consumer, abstraction có thể đang sai.

## Tham khảo

- Transcript bài 091.
- Java Language Specification 17, class inheritance.
- Oracle, Inheritance.
