# Module 16 — Capstone và Review

Module cuối nối các kiến thức thành một Music Library Desktop Application có domain model, application service, persistence, networking, concurrency, JavaFX, testing, observability và JPMS. Đây là module để chứng minh năng lực thiết kế và vận hành, không chỉ nhớ syntax.

## Mục tiêu

- chuyển requirements thành domain invariant và traceability matrix;
- tách UI/CLI, application, domain, ports và infrastructure;
- dùng OOP/SOLID, collections, streams, `Optional`, exceptions đúng boundary;
- xây persistence/JDBC, transaction, import/export và network sync có timeout;
- quản lý JavaFX state, UI thread, cancellation và stale response;
- viết test deterministic, debug bằng evidence, logging/metrics an toàn;
- review security/performance/resilience, package bằng JPMS hoặc classpath có chủ ý;
- tạo README, CI, runtime artifact, runbook và postmortem có thể handoff.

## Lộ trình lesson

| Nhóm | Lesson | Trọng tâm |
|---|---:|---|
| Scope & design | 496–503 | brief, requirements, layers, boundary, value object, OOP/SOLID, collections |
| Data & integration | 504–511 | streams, errors, JDBC, transaction, network, concurrency, JavaFX, persistence |
| Quality & operations | 512–521 | commands, testing, clock, debugging, metrics, security, performance, resilience, packaging, CI |
| Review & handoff | 522–525 | code review, refactoring, portfolio/interview, demo/postmortem |

Mở [INDEX.md](INDEX.md) để học tuần tự. Mỗi lesson có checkpoint; hãy lưu câu trả lời/diagram/command vào project journal để biến kiến thức thành evidence.

## Practice

[practice/README.md](practice/README.md) gồm 20 bài từ Medium đến Extreme. Bộ bài bao phủ requirements, value object, aggregate invariant, polymorphism, collections/streams, error boundary, repository/transaction, command, deterministic clock, concurrency snapshot, retry, protocol, schema migration, layer audit, testing và production readiness.

Practice dùng Java 17 thuần, không cần JavaFX/JDBC server/network thật, nhưng contract được thiết kế để chuyển sang capstone. Mỗi bài có starter `code/`, lời giải `solutions/`, `README.md` và `SelfCheck.java`.

```powershell
Set-Location .\java-masterclass-modules\16-capstone-review\practice
powershell -ExecutionPolicy Bypass -File .\verify-solutions.ps1
```

Verifier compile solution riêng bằng `javac --release 17`, chạy `SelfCheck`, yêu cầu `PASS` và xóa `.class` sau mỗi bài. Starter có TODO có chủ ý; không compile starter trong verifier.

## Completion gate

Capstone chỉ được coi là hoàn thành khi clean checkout chạy được bằng command trong README, test và smoke evidence có, không có secret/generated artifact, transaction/error/concurrency boundary được review và người khác có thể handoff theo runbook.

