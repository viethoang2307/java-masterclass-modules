# Module 13 — Debugging, Testing và Logging

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
## Mục tiêu

- Dùng IntelliJ debugger, breakpoints, watches và stack trace.
- Viết unit test có behavior contract bằng JUnit 5.
- Dùng parameterized tests và test exception/boundary.
- Dùng Mockito để cô lập external collaborator vừa đủ.
- Thiết kế logging có level, context, correlation id và redaction policy.
- Chạy test từ Maven để local và CI dùng cùng một command.
- Viết regression test sau mỗi bug fix.

## Lộ trình

1. Lessons 409–419 — debugger, breakpoints, watches, stack trace và assertions.
2. Lesson 420 — JUnit 5 testing workflow.
3. Lesson 421 — Mockito và unit isolation.
4. Lesson 422 — Logging và observability.

## Test contract

IDE là convenience; mvn test hoặc mvn verify là source of truth. Test không phụ thuộc thứ tự, timezone, file local hoặc secret. Log không được chứa password, token hoặc dữ liệu nhạy cảm.

## Module checkpoint

Người học phải có một project có unit test, mock một boundary bên ngoài, log có ngữ cảnh và regression test cho một bug đã tái hiện.
