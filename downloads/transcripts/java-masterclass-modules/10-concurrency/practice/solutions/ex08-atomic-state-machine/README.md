# Lời giải Bài 08

`compareAndSet` đảm bảo chỉ một thread claim state NEW. Thread thắng chuyển sang RUNNING; sau khi tất cả worker join, owner chuyển RUNNING sang STOPPED. State transition nguyên tử, không cần synchronized cho field state.

Không dùng `get` rồi `set` vì hai thread có thể cùng quan sát NEW. Với state phụ thuộc nhiều field, atomic reference nên trỏ tới immutable snapshot.
