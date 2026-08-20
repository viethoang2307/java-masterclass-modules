# Lời giải Bài 02

`AtomicInteger.incrementAndGet()` là operation atomic cho counter đơn giản. Mỗi thread nhận cùng reference, sau đó main `join` toàn bộ worker trước khi đọc kết quả.

Độ phức tạp: O(threads × increments), memory O(threads). Không dùng `get()` rồi `set(get()+1)` vì đó lại là read-modify-write không atomic. Nếu chỉ cần tổng theo batch lớn, thread-local partial sums rồi reduce có thể giảm contention.
