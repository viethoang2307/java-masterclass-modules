# 094. Object contract: equality, identity và representation

## Mục tiêu

Phân biệt identity (`==`), logical equality (`equals`) và representation (`toString`) để không viết collection/domain code sai.

## Ba contract khác nhau

```java
record Money(String currency, long cents) {}

Money a = new Money("USD", 500);
Money b = new Money("USD", 500);
System.out.println(a == b);      // false: khác object reference
System.out.println(a.equals(b)); // true: cùng value
```

`==` với object kiểm tra cùng reference. `equals` kiểm tra cùng ý nghĩa theo domain. `hashCode` phải giống nhau khi `equals` là true. `toString` phục vụ debug/log/UI, không phải parser nếu chưa định nghĩa format ổn định.

## Tự viết `equals`

```java
@Override public boolean equals(Object other) {
    if (this == other) return true;
    if (!(other instanceof Money money)) return false;
    return cents == money.cents && currency.equals(money.currency);
}
@Override public int hashCode() { return Objects.hash(currency, cents); }
```

`equals` cần reflexive, symmetric, transitive, consistent và false với null. Field tham gia equality phải là field định danh/giá trị, không tùy tiện thêm mọi field mutable.

## Lỗi thường gặp

- Override `equals` nhưng quên `hashCode`.
- Dùng `getClass()` khi muốn equality giữa subtype hợp lệ, hoặc dùng `instanceof` khi subtype làm thay đổi semantics.
- Lấy `toString` làm dữ liệu business.

## Bài tập

Viết value object `EmailAddress` normalize lowercase và test trong `HashSet`. Thử bỏ `hashCode`, quan sát lookup trong map/set.

## Checkpoint

Trước khi đưa class vào `HashMap`/`HashSet`, phải trả lời: identity có immutable không, equality dựa trên field nào, và object có được mutate sau insertion không?
