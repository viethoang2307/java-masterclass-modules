# 82 — Classes Challenge — Bank Account

## Mục tiêu

Xây BankAccount có customer name, account number, balance; bảo vệ deposit/withdraw và output deterministic.

## Mental model

Challenge nên bắt đầu từ invariant: account number không blank, balance không âm, deposit dương, withdraw không vượt balance. Methods return boolean hoặc result rõ ràng.

## Ví dụ Java 17

~~~java
final class BankAccount {
    private final String number;
    private final String customer;
    private long balance;

    BankAccount(String number, String customer, long balance) {
        if (number == null || number.isBlank() || balance < 0) {
            throw new IllegalArgumentException();
        }
        this.number = number;
        this.customer = customer;
        this.balance = balance;
    }

    boolean withdraw(long amount) {
        if (amount <= 0 || amount > balance) return false;
        balance -= amount;
        return true;
    }
}
~~~

## Lỗi thường gặp

- Khởi tạo balance âm.
- withdraw rồi mới kiểm tra.
- Trả void khiến caller không biết command thành công.

## Bài tập ngắn

Hoàn thiện challenge với deposit, withdraw, getter và test boundary zero/overdraft.

## Interview prompt

Khi nào nên throw exception thay vì return false cho invalid operation?

## Nguồn

Transcript course lesson 82; code được chuẩn hóa theo Java 17, giữ ý đồ OOP của course.

