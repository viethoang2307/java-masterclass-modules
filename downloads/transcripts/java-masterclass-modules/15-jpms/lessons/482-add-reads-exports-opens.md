# 482 — Các cờ escape hatch

Ba cờ thường xuất hiện khi migration hoặc test:

```powershell
java --add-reads app=legacy.lib ...
java --add-exports lib/com.acme.internal=app ...
java --add-opens lib/com.acme.entity=test.module ...
```

- `--add-reads A=B`: cho A đọc B ngoài descriptor.
- `--add-exports M/P=A`: export package P của M cho A.
- `--add-opens M/P=A`: mở deep reflection cho A.

## Chính sách sử dụng

Các cờ này hữu ích để xác minh giả thuyết hoặc unblock test/migration, nhưng làm dependency nằm ngoài source descriptor. Mỗi flag cần issue, owner, lý do và kế hoạch xóa.

## Sai lầm

- Dùng `--add-opens` để chữa lỗi import compile-time.
- Thêm flag vào IDE nhưng quên production script.
- Copy flags vào mọi môi trường thay vì sửa module boundary.

## Bài thực hành

Tạo một test reflection cần mở có chọn lọc, chạy thành công với `--add-opens`, sau đó chuyển thành `opens ... to test.module` trong descriptor và so sánh hai cách.

