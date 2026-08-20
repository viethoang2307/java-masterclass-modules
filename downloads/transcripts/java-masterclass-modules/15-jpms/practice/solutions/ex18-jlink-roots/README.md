# Lời giải — `jlink` root selection

Dùng BFS từ tất cả root, chỉ enqueue dependency của module đang xét. Set visited loại cycle và duplicate. Đây là O(V + E) trên phần graph reachable; provider dynamic vẫn cần được đưa vào roots/graph bằng policy riêng.

