# 118. Deluxe Burger và quyết định inheritance/composition

## Câu hỏi design

Deluxe burger có phải subtype không? Nếu mọi code nhận `Burger` đều dùng được deluxe và deluxe chỉ thêm preset/giới hạn mà không phá behavior, inheritance có thể hợp lệ. Nếu chỉ là một cấu hình, factory/composition phù hợp hơn.

```java
static Burger deluxeBurger() {
    Burger burger = new Burger("Deluxe");
    burger.addTopping(new Topping("cheese", 100));
    burger.addTopping(new Topping("bacon", 150));
    return burger;
}
```

Factory tạo object thường, tránh subclass chỉ để gọi constructor khác.

## Pricing và extensibility

Nếu price thay đổi theo campaign, inject `PricingPolicy` thay vì override `price()` trong nhiều subclass:

```java
interface PricingPolicy { long priceOf(Burger burger); }
```

## Capstone checklist

Value object cho money/name, aggregate bảo vệ list/status, calculator không dùng floating point, formatter tách domain và self-check có invalid input/state transition/overflow.

## Bài tập

Viết review memo so sánh subclass `DeluxeBurger` với factory/composition về test, API và thay đổi pricing.
