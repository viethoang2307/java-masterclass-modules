# Bài 05 — Interrupt hợp tác (Medium)

Worker chờ trên `CountDownLatch`. Main phải interrupt worker, worker ghi nhận `InterruptedException`, restore interrupt flag và kết thúc. Không được swallow exception.
