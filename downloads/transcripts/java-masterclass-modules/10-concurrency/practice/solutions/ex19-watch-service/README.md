# Lời giải Bài 19

Watcher được register trước khi producer tạo file, nên event không bị bỏ lỡ. `poll(timeout)` bảo vệ self-check khỏi treo. Sau khi đọc events phải `reset`; temp directory được cleanup trong finally.

Trong hệ thống thật event có thể trùng/gộp và file chưa ghi xong. Dùng temp + atomic move, debounce và retry đọc; xử lý `OVERFLOW` bằng rescan.
