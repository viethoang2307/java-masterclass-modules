# Bài 20 — Concurrent log processor (Extreme)

Nhận danh sách log lines, parse level `INFO|WARN|ERROR` bằng `Pattern`, xử lý song song và trả map count deterministic. Dòng malformed phải bị bỏ qua; executor phải shutdown.
