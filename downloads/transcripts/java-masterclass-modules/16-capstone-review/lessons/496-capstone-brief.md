# 496 — Capstone brief và acceptance contract

Capstone là Music Library Desktop Application: người dùng quản lý artist/album/song, tìm kiếm, lưu dữ liệu và xem trạng thái đồng bộ. Mục tiêu không phải nhồi mọi API vào một class mà là chứng minh các kiến thức kết nối thành hệ thống có boundary.

## In scope

- domain model có invariant;
- repository/persistence có transaction boundary;
- service và command layer độc lập UI;
- JavaFX view model cập nhật đúng UI thread;
- import/export hoặc sync có timeout/cancellation;
- tests, logging, error message và packaging evidence.

## Acceptance contract

Mỗi use case phải có input, output, lỗi có chủ ý và test. README của project phải ghi command build/run, JDK, cấu trúc module và trade-off. Demo một happy path chưa đủ; cần chứng minh empty state, invalid input, duplicate, I/O failure và shutdown.

## Checkpoint

Viết một trang scope: ba user story, ba non-functional requirement, năm acceptance test và phần cố ý không làm trong capstone.

