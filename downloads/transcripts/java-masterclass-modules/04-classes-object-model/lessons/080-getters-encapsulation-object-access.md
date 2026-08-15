# 80 — Getters, Encapsulation và Object Access

## Mục tiêu

Dùng private fields và getters để kiểm soát quyền đọc; hiểu encapsulation là bảo vệ invariant chứ không chỉ generate boilerplate.

## Mental model

Getter là read API. Encapsulation tốt giới hạn mutation; không phải field nào cũng cần setter. Với mutable object, getter trả reference có thể làm lộ state.

## Ví dụ Java 17

~~~java
final class BankAccount {
    private final String id;
    private int balance;

    BankAccount(String id) { this.id = id; }
    String id() { return id; }
    int balance() { return balance; }
    boolean deposit(int amount) {
        if (amount <= 0) return false;
        balance += amount;
        return true;
    }
}
~~~

## Lỗi thường gặp

- Tạo setter cho mọi field mặc định.
- Getter trả mutable collection nội bộ.
- Cho balance âm vì không validate command.

## Bài tập ngắn

Viết account chỉ cho deposit/withdraw hợp lệ; không cho caller gán balance.

## Interview prompt

Encapsulation ngăn loại bug nào mà compiler không ngăn?

## Nguồn

Transcript course lesson 80; code được chuẩn hóa theo Java 17, giữ ý đồ OOP của course.

