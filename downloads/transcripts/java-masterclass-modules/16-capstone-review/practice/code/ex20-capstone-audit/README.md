# Bài 20 — Integrated capstone audit (Extreme)

Audit project theo bốn invariant: requirement complete; track IDs nonblank/unique; dependency graph không cycle; mọi required module có trong runtime set. Report theo prefix `requirement:`, `duplicate-track:`, `dependency-cycle`, `missing-runtime:`.

Đây là bài tổng hợp, solution nên tách helper để mỗi rule có thể test riêng.

