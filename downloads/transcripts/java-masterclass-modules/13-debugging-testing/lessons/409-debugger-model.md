# 409 — Debugger mental model

Debugger pauses execution so you can inspect stack, locals, fields and threads at a point in time. It observes behavior; it does not prove behavior after resume.

Start with a hypothesis and a breakpoint near the first incorrect state, not the final symptom. Record input, expected/actual, version and environment before stepping.

## Bài tự luyện

Chọn bug null pointer, viết reproducer tối thiểu và ghi observation/hypothesis/action log.
