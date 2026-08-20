# Bài 18 — Production readiness score (Extreme)

Mỗi check có weight không âm. `score` cộng weight của check passed; negative weight là invalid. `status` là `READY` chỉ khi list không rỗng và mọi check pass, ngược lại `NOT_READY`.

Ví dụ check: tests, smoke, secrets, timeout, rollback, observability.

