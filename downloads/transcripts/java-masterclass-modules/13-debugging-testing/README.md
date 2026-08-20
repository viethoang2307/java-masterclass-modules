# Module 13 — Debugging và Testing

Module này biến lỗi thành evidence: reproduce, isolate, inspect state, viết regression test, rồi đo confidence. Debugger và test bổ trợ nhau; breakpoint không thay thế invariant/assertion.

## Kết quả học tập

- dùng debugger: breakpoint, conditional breakpoint, step, stack, watches và field watchpoint;
- đọc stack trace, exception cause chain, thread dump và log có context;
- thiết kế unit test nhỏ, deterministic, độc lập và dễ chẩn đoán;
- dùng JUnit 5 concepts: assertions, lifecycle, parameterized test, exception/timeout và nested test;
- phân biệt fake/mock/stub/spy, state vs interaction testing;
- test boundary, property/invariant, regression, concurrency và flaky test;
- phân tích coverage đúng cách, không chạy theo phần trăm mù;
- xây test pyramid, test data builder, fixture cleanup và CI gate;
- làm capstone từ bug report tới fix evidence.

## Lộ trình

| Bài | Trọng tâm |
|---|---|
| 409–414 | IntelliJ debugger, stack trace, breakpoints, watches, logging |
| 415–420 | JUnit assertions, lifecycle, exception, parameterized và challenges |
| 421–426 | test double, boundary, property, regression, flaky/concurrent test |
| 427–432 | coverage, mutation mindset, test data, CI và observability |
| 433–438 | design for testability, performance, contract test và capstone |

## Practice

20 bài dùng `javac`/JShell và `SelfCheck`, không thêm JUnit dependency; lesson có syntax JUnit 5 để bạn chuyển sang project có test framework. Solutions không có TODO.

```powershell
powershell -ExecutionPolicy Bypass -File .\practice\verify-solutions.ps1
```

## Debug loop

```text
report -> reproduce -> minimize -> observe -> hypothesize -> change -> regression test -> verify
```

Không sửa theo symptom trước khi có reproducer và expected behavior rõ.
