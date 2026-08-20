# 422 — State vs interaction test

State test assert output/state cuối; interaction test assert dependency được gọi đúng. State thường bền hơn; interaction cần khi thứ tự/at-most-once là contract.

Đừng assert private method hoặc số lần gọi implementation detail nếu không ảnh hưởng observable behavior.
