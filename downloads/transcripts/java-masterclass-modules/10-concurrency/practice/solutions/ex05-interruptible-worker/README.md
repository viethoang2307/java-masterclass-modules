# Lời giải Bài 05

`CountDownLatch.await` là blocking operation phản ứng với interrupt. Catch đặt cờ quan sát và gọi `Thread.currentThread().interrupt()` để giữ semantic cho caller tiếp theo, rồi worker return. Main join để không bỏ thread sống.

Không dùng `Thread.stop`; không catch rồi tiếp tục loop vô hạn. Nếu worker có resource, cleanup phải nằm trong `finally` trước khi return.
