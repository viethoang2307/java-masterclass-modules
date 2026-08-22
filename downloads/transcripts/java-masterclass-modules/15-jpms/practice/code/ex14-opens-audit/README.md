# Bài 14 — Reflection/opens audit (Very Hard)

`needsOpen` phải true với `opens package;` hoặc `opens package to targetModule;`, false khi chỉ có `exports`. Không coi `opens other` là match.

Input descriptor hợp lệ, mỗi directive có thể nằm trên một dòng. Target null không được bypass policy.

