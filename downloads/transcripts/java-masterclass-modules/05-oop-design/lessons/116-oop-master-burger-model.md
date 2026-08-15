# 116. Burger model: composition trong domain nhiều option

## Model

Burger có bread, meat và toppings. Topping là collection nhưng burger phải kiểm soát quantity/price:

```java
record Topping(String name, long priceCents) {}

final class Burger {
    private final String name;
    private final List<Topping> toppings = new ArrayList<>();
    Burger(String name) { this.name = require(name); }
    void addTopping(Topping topping) {
        Objects.requireNonNull(topping);
        if (toppings.size() == 4) throw new IllegalStateException("maximum toppings");
        toppings.add(topping);
    }
    long priceCents() { return ...; }
}
```

Burger có thể mutable trong lúc build nhưng phải expose snapshot và chốt order trước checkout. Nếu reasoning về state quan trọng hơn convenience, dùng immutable builder.

## Composition thay inheritance

`DeluxeBurger` chỉ nên là subtype nếu mọi code nhận `Burger` đều dùng được. Nếu khác biệt chỉ là preset toppings, factory tạo `Burger` thường đơn giản hơn.

## Money và bài tập

Dùng cents và `Math.addExact`, không dùng `double`. Thiết kế builder reject duplicate topping, giới hạn 4 topping và trả immutable receipt line.
