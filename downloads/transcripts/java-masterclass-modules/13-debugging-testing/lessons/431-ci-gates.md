# 431 — CI test gates

CI gate gồm compile, unit, integration, static checks, timeout và artifact report. Fail fast lỗi compile, nhưng vẫn lưu test report/log để debug.

Không để local-only test hoặc flaky retry làm gate giả xanh; pin JDK/dependency và seed.
