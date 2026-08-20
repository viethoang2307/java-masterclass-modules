# 522 — Code review checklist

Review theo risk, không chỉ format.

## Correctness

Invariant có được bảo vệ ở domain không? Error/empty/cancel có test? Resource/transaction có đóng đúng? Concurrent state có stale write/race không?

## Design

Dependency direction có sạch? Public API nhỏ? Naming phản ánh domain? Abstraction có reason to exist? `Optional`, streams và exceptions có dùng đúng semantics?

## Operations

Command run được? Log có correlation ID mà không lộ secret? Timeout/retry bounded? Migration/rollback và support evidence có rõ?

## Review output

Mỗi comment ghi impact, evidence và đề xuất. Phân biệt blocker, important và nit. Author nên trả lời bằng test/measurement, không chỉ “đã sửa”.

## Checkpoint

Review một PR giả lập gồm 10 lỗi; xếp priority và yêu cầu evidence cho ba blocker.

