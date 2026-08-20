# 513 — Testing pyramid cho capstone

Một hệ thống tốt có nhiều unit test nhanh, một số integration test và ít end-to-end test có giá trị.

## Tầng test

- value object/domain invariant: unit thuần;
- application service: fake ports, kiểm tra orchestration;
- JDBC/network adapter: integration với dependency thật hoặc contract server;
- JavaFX: view model/state test, một số UI smoke;
- packaged modular app: launch/smoke.

Test behavior và contract, không khóa implementation detail. Self-check có thể dùng `AssertionError`, nhưng project thật cần framework phù hợp để report/parallelization.

## Test cases

Mỗi use case có happy, boundary, invalid, dependency failure, cancellation/concurrency nếu liên quan. Test failure phải deterministic, không phụ thuộc clock/network thật.

## Checkpoint

Lập test matrix cho “sync library”, ghi tầng test, fake/real dependency và signal pass.

