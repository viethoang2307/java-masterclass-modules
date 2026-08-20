# Bài 19 — Outbox state (Extreme)

Mô phỏng outcome của transaction DB và publish event. DB fail => rollback/no outbox; DB success + publish fail => committed event pending retry.
