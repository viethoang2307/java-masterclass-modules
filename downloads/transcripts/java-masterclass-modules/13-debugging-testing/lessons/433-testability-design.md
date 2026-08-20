# 433 — Design for testability

Inject clock, random, transport và repository thay vì gọi static/global trực tiếp. Tách pure decision logic khỏi I/O để test nhanh.

Testability tốt thường đi cùng ownership rõ, dependency inversion và side effect boundary nhỏ.
