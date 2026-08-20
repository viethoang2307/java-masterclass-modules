# Bài 11 — Descriptor audit (Hard)

Audit descriptor với module name mong đợi và set package thực tế trong output. Báo `missing-module` nếu declaration sai/thiếu, và `missing-export:<package>` nếu exports một package không tồn tại.

Không báo lỗi cho package internal không export; đó là trạng thái hợp lệ và thường mong muốn.

