# 332 — synchronized method và block

`synchronized` dùng intrinsic monitor của object/class để bảo vệ critical section. Một thread giữ monitor thì thread khác muốn vào cùng monitor phải chờ; khi unlock, các write trước đó được publish cho lock tiếp theo.

```java
final class BankAccount {
    private long cents;

    public synchronized void deposit(long amount) {
        if (amount <= 0) throw new IllegalArgumentException("amount");
        cents += amount;
    }

    public synchronized long balance() {
        return cents;
    }
}
```

Synchronized instance method khóa `this`; static method khóa `BankAccount.class`. Block cho phép chọn lock object riêng, thường tốt hơn để giảm phạm vi khóa.

## Quy tắc

- critical section ngắn và chỉ chứa state cần bảo vệ;
- luôn lock cùng object cho cùng invariant;
- không expose lock object mutable ra ngoài;
- không gọi callback, I/O hoặc code không kiểm soát khi giữ lock.

## Pitfall

`volatile` và `synchronized` giải bài toán khác nhau. Synchronized không làm code “chạy song song” trong critical section, nhưng không cần khóa toàn bộ method nếu chỉ một phần đụng shared state.

## Bài tự luyện

Viết `Inventory` có `reserve` và `release`; invariant stock không âm phải đúng khi 20 thread thao tác đồng thời.
