# 515 — Debugging và observability

Khi lỗi xảy ra ở nhiều thread/layer, stack trace đơn lẻ không đủ. Log structured event với operation, correlation ID, entity ID không nhạy cảm, duration và outcome.

## Triage order

1. Reproduce bằng command tối giản.
2. Lưu JDK/config/build commit.
3. Tách first failure khỏi cascading errors.
4. Thêm evidence ở boundary, không spam từng dòng loop.
5. Viết regression test trước khi refactor rộng.

Không log password, token, full payload chứa PII. Error user-facing nên an toàn, log internal có cause/stack trace và correlation ID.

## Checkpoint

Viết một error event cho sync timeout và một cho constraint violation; chỉ ra field nào user thấy và field nào chỉ log.

