# 502 — SOLID qua một feature thật

Review SOLID bằng câu hỏi cụ thể:

- **SRP**: class có một reason to change không?
- **OCP**: thêm provider mới có sửa switch core không?
- **LSP**: implementation có giữ pre/post-condition của port không?
- **ISP**: consumer có phải phụ thuộc method không dùng không?
- **DIP**: policy có phụ thuộc adapter chi tiết không?

Một `LibraryService` vừa parse CSV, mở file, validate domain, chạy SQL và update JavaFX là violation dễ thấy. Tách theo use case và boundary, nhưng giữ flow có thể đọc.

## Trade-off

SOLID không yêu cầu class nhỏ vô hạn. Abstraction có cost: indirection, naming và test setup. Ghi lý do thiết kế trong decision record thay vì áp dụng pattern theo checklist máy móc.

## Checkpoint

Refactor một method 80 dòng thành ports/use case/domain operation; liệt kê behavior được giữ nguyên và test bảo vệ nó.

