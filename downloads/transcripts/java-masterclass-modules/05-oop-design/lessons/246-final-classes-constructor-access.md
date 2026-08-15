# 246. `final` classes và constructor access

## `final` là design statement

`final class` không thể bị subclass. Dùng khi invariant/security/representation không cho phép mở rộng:

```java
public final class Money {
    private final String currency;
    private final long cents;
    public Money(String currency, long cents) {
        if (currency == null || currency.isBlank() || cents < 0)
            throw new IllegalArgumentException("money");
        this.currency = currency.strip(); this.cents = cents;
    }
    public long cents() { return cents; }
}
```

Private fields + no setters + final class làm value object dễ reasoning. Nếu class không final nhưng equality dùng `getClass`, subtype có thể tạo semantics kỳ lạ.

## Constructor access

Private constructor + static factory kiểm soát creation:

```java
public static Money usd(long cents) { return new Money("USD", cents); }
```

Package-private constructor phù hợp khi chỉ factory trong package được tạo object. Đây là API boundary.

## Bài tập

Thiết kế `EmailAddress` final, factory normalize, constructor không để invalid state. Test không thể subclass và equality ổn định.
