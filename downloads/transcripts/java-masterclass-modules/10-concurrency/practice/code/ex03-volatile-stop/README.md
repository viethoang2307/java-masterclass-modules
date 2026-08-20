# Bài 03 — Volatile stop flag (Medium)

Worker phải chạy loop cho tới khi main yêu cầu dừng. Dùng một stop flag có visibility đúng, gửi request, `join` với timeout và trả về worker đã thực sự kết thúc.
