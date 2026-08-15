# Exercise 17 — EnumMap Workflow

**Độ khó:** Very Hard. Mô hình workflow `NEW→ACTIVE→{BLOCKED,DONE}`, `BLOCKED→ACTIVE`, `DONE` terminal. Dùng `EnumMap<State,EnumSet<State>>`; `transition(id,next)` chỉ đổi state hợp lệ; `counts()` trả đủ mọi state kể cả count 0.
