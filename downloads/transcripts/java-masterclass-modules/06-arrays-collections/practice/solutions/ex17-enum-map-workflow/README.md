# Lời giải 17 — EnumMap Workflow

Transition table là data, không phải chuỗi if rải rác. `EnumSet` biểu diễn tập đích type-safe; `EnumMap` đảm bảo đủ key theo declaration order. Counts khởi tạo zero cho mọi enum rồi merge state hiện tại. Operation average O(1); snapshot map immutable.
