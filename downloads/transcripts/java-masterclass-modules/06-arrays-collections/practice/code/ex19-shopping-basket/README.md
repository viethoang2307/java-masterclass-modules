# Exercise 19 — Shopping Basket

**Độ khó:** Extreme.

Store giữ price, available stock và basket quantity theo normalized SKU. `addToBasket` reserve ngay: chỉ trừ stock sau khi kiểm tra đủ; cộng quantity bằng exact arithmetic. `removeFromBasket` release quantity; reject quá số đang giữ. `checkout` tính cents bằng exact arithmetic, trả immutable receipt theo insertion order và chỉ clear basket khi thành công.

Mọi failure phải giữ nguyên stock và basket. Không dùng `double` cho tiền.
