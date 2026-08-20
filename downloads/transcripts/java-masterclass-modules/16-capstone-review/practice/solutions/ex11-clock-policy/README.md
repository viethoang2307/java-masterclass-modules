# Lời giải — Deterministic clock

So sánh `now` với `created.plus(ttl)`, dùng mốc truyền vào nên test lặp lại được. TTL bằng zero hết hạn ngay tại cùng instant; TTL âm bị reject. Độ phức tạp O(1).

