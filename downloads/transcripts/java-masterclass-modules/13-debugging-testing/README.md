# Module 13 — Debugging, Testing và Logging

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
