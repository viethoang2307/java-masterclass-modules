# 436 — Integration boundary

Integration test dùng real filesystem/database/network boundary khi fake không bắt được type/serialization/protocol issue. Giữ số lượng vừa đủ, cleanup deterministic và chạy isolated.

Unit test logic nhanh; integration xác nhận wiring; e2e ít nhưng cover critical path.
