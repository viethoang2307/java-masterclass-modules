# Bài 12 — Concurrent refresh snapshot (Hard)

Chấp nhận incoming chỉ khi requestId lớn hơn current; stale response giữ nguyên current. Snapshot accepted phải copy list immutable. Current null được coi requestId -1.

Đây là model hóa stale-response bug trong JavaFX/network refresh.

