# Lời giải — Immutable aggregate

Copy input vào mutable buffer, kiểm tra duplicate rồi trả `List.copyOf`. Input không bị mutate và output không thể sửa. Kiểm tra duplicate O(n); có thể dùng Set ID nếu aggregate lớn.

