# 511 — Persistence, import/export và compatibility

File export là một public artifact dù chỉ dùng nội bộ. Chọn format có schema/version, encoding UTF-8, escape delimiter và behavior khi field mới/cũ.

## Safe write

Ghi vào temp file cùng directory, flush/close, rồi move atomic nếu filesystem hỗ trợ. Giữ backup hoặc checksum khi dữ liệu quan trọng. Không truncate file hiện tại trước khi parse/serialize thành công.

## Migration

Parser đọc version và migrate từng version có test. Không đoán silently khi field bắt buộc thiếu; trả lỗi có line/record number.

## Checkpoint

Thiết kế format export v1/v2 cho album thêm field `genre`; viết compatibility matrix và failure behavior khi file bị cắt giữa chừng.

