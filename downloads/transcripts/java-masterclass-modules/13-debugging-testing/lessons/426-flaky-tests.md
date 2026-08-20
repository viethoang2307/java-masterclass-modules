# 426 — Flaky test

Flaky test pass/fail không ổn định do timing, order, clock, random, network, shared state hoặc cleanup. Retry test chỉ che symptom và làm CI confidence giảm.

Gắn seed, log duration/thread, cô lập resource, dùng latch thay sleep và quarantine có owner/deadline.
