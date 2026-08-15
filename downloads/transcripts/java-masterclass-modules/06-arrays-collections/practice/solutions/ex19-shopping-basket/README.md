# Lời giải 19 — Shopping Basket

Basket dùng `LinkedHashMap` để receipt deterministic. Reserve làm available giảm ngay; failure kiểm tra trước nên không có partial mutation. Remove trả stock trước rồi giảm/xóa basket entry. Checkout tính từng subtotal và total bằng exact arithmetic trước khi clear; receipt dùng `List.copyOf`. Operation average O(1), checkout O(b). Lỗi thường gặp: kiểm tra và mutate xen kẽ, dùng `double`, quên release khi remove, hoặc clear trước khi phép tính có thể overflow.
