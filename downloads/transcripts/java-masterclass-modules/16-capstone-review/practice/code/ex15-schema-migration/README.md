# Bài 15 — Schema migration (Very Hard)

`migrations` map version hiện tại → version kế tiếp. Trả list gồm cả current/target; throw `IllegalArgumentException` nếu thiếu step hoặc gặp cycle. Nếu current == target, list chỉ có một version.

Migration phải explicit, không nhảy phiên bản bằng đoán.

