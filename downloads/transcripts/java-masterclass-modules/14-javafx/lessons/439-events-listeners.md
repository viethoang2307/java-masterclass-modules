# 439 — Events và listeners

Event có target, source, type và bubbling qua parent. Handler nên gọi command/view-model, không nhồi persistence vào lambda UI.

Listener phải remove khi view lifecycle kết thúc nếu giữ reference lớn, tránh leak.
