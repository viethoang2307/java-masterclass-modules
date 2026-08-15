# 157 — Abstract class challenge final

## Mục tiêu

Hoàn thiện storefront report, discount behavior và polymorphic tests.

## Mental model

Tách base identity, variation pricing và presentation. Test mỗi subtype plus one integration report.

## Ví dụ Java 17

~~~java
`static int total(Product... ps){int t=0;for(Product p:ps)t+=p.price();return t;}`
~~~

## Lỗi thường gặp

- Discount logic rải outer loop.
- Test chỉ một subtype.
- Price overflow không nêu.

## Bài tập ngắn

Thêm DiscountedProduct hoặc PricingPolicy và so sánh designs.

## Interview prompt

Strategy có thể thay inheritance ở đâu?

## Nguồn

Transcript course lesson 157; ví dụ được chuẩn hóa theo Java 17 và diễn giải theo hướng OOP design.

