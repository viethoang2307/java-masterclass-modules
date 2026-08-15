# Exercise 18 — Immutable Catalog

**Độ khó:** Extreme.

Xây catalog bất biến từ collection `Product(sku,name,tags)`. Chuẩn hóa SKU uppercase, tag lowercase, defensive-copy mọi set; reject duplicate SKU. `find(sku)` trả product hoặc null, `byTag(tag)` trả immutable list sort theo SKU. Thay đổi collection đầu vào sau constructor không được ảnh hưởng catalog.

Tiêu chí: không expose mutable state; index tag được dựng một lần; lookup SKU O(1) average; query tag không scan toàn catalog.
