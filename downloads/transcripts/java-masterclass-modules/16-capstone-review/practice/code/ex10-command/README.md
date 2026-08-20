# Bài 10 — Command normalization (Hard)

Trim command và collapse mọi whitespace liên tiếp thành một space. Throw `IllegalArgumentException` cho null/blank. `ADD   ARTIST  x` thành `ADD ARTIST x`.

Không lower-case payload vì tên artist/title có thể case-sensitive.

