# Bài 07 — Static dependency (Hard)

Cho descriptor và module name, trả về `requires`, `requires static` hoặc `absent`. Modifier `transitive` không làm dependency thành static; ví dụ `requires transitive common` vẫn là runtime `requires`.

Descriptor trong test có directive đơn giản trên một dòng.

