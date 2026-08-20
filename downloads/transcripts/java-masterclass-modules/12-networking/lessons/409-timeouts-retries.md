# 409 — Timeout, retry và cancellation

Tách connect timeout, read timeout, write timeout và overall deadline. Retry chỉ cho lỗi transient và operation idempotent, có exponential backoff + jitter.

Cancellation phải đóng socket/HTTP future hoặc truyền signal xuống parser. Timeout không tự hoàn tác side effect server.
