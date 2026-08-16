# 148. Banking challenge: encapsulate account state

## Aggregate boundary

Account nên sở hữu ledger và expose command, không cho caller add transaction tùy ý.

~~~java
final class Account {
    private final List<Long> ledger = new ArrayList<>();
    void deposit(long cents) { requirePositive(cents); ledger.add(cents); }
    void withdraw(long cents) { requirePositive(cents); ledger.add(-cents); }
    List<Long> transactions() { return List.copyOf(ledger); }
}
~~~

Nếu withdraw không được vượt balance, validate trước khi append. Failure phải giữ ledger unchanged.

## Bài tập

Thêm transfer giữa hai account với validate-all-before-mutate, exact arithmetic và result rõ. Test source/destination khi failure.

## Lỗi thường gặp

Trả ledger nội bộ, append debit trước rồi mới kiểm tra đủ tiền, và nhầm snapshot với live view.
