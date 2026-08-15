# 156 — Abstract class challenge — Storefront

## Mục tiêu

Xây Product abstract với price/name và subtype pricing cho store.

## Mental model

Storefront chỉ cần Product.price(); pricing policy khác nhau nằm trong subtype hoặc strategy.

## Ví dụ Java 17

~~~java
`abstract class Product { final String name; abstract int price(); }`
~~~

## Lỗi thường gặp

- Store tự switch subtype.
- Price mutation public.
- Invalid product name.

## Bài tập ngắn

Tạo Book/Electronic và total catalog.

## Interview prompt

Có nên dùng abstract class hay interface cho Product?

## Nguồn

Transcript course lesson 156; ví dụ được chuẩn hóa theo Java 17 và diễn giải theo hướng OOP design.

