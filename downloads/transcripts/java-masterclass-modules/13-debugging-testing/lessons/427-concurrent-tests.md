# 427 — Concurrent test

Dùng barrier/latch để điều khiển interleaving; assert invariant và termination, không assert thứ tự log. Luôn timeout và cleanup mọi executor/thread.

Stress lặp giúp tìm bug nhưng không chứng minh absence; tooling chuyên dụng cần cho JMM-level race.
