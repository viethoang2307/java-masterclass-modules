# Lời giải Bài 17

`RecursiveTask` chia tới threshold 1,000. Fork left, compute right trên worker hiện tại rồi join left giúp work-stealing hiệu quả hơn fork cả hai. Pool dùng try-with-resources vì Java 19 mới có AutoCloseable cho pool; Java 17 dùng `finally shutdown`.

Độ phức tạp O(n), stack O(log n), thêm task overhead. Mảng nhỏ có thể chạy sequential nhanh hơn.
