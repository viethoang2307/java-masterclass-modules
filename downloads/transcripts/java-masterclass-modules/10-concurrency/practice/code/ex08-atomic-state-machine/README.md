# Bài 08 — Atomic state machine (Hard)

Dùng `AtomicReference` cho state `NEW -> RUNNING -> STOPPED`. Nhiều thread cùng start nhưng chỉ một transition `NEW -> RUNNING` được thành công.
