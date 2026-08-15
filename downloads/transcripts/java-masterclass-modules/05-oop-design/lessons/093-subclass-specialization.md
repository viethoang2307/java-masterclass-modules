# 093. Subclass specialization và contract mở rộng

## Mục tiêu

Specialization không chỉ là thêm field; subclass phải thêm capability mà vẫn giữ contract của base.

```java
class Account {
    private long balanceCents;
    public void deposit(long cents) {
        if (cents <= 0) throw new IllegalArgumentException("positive deposit required");
        balanceCents = Math.addExact(balanceCents, cents);
    }
    public long balanceCents() { return balanceCents; }
}

final class SavingsAccount extends Account {
    private final int interestRateBasisPoints;
    SavingsAccount(int rate) {
        if (rate < 0) throw new IllegalArgumentException("rate");
        interestRateBasisPoints = rate;
    }
    long projectedInterest() {
        return Math.multiplyExact(balanceCents(), interestRateBasisPoints) / 10_000;
    }
}
```

`SavingsAccount` thêm hành vi, không làm `deposit` có semantics khác. Caller của `Account` vẫn dùng được object này.

## Precondition và postcondition

- Không thu hẹp input hợp lệ của base method.
- Không làm yếu postcondition: nếu base nói deposit thành công thì balance phải tăng đúng.
- Exception type cũng là một phần contract cần cân nhắc.

## Khi specialization là dấu hiệu xấu

Nếu subclass phải override nhiều method để vô hiệu hóa behavior, base abstraction quá rộng. Nếu caller thường xuyên viết `if (account instanceof SavingsAccount savings)`, capability nên là interface riêng như `InterestBearing` hoặc service nhận capability.

## Bài tập

Tạo `TimedCache extends Cache` chỉ khi mọi quy tắc của `Cache` vẫn đúng. Sau đó thiết kế lại cùng bài bằng composition và so sánh coupling.

## Lỗi thường gặp

- Override để lách invariant của base.
- Expose subtype-specific mutable field.
- Dùng `protected` để subclass sửa state thay vì command method.
