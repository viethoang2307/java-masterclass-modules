# Lời giải — Readability graph

BFS dùng `ArrayDeque` và `HashSet`. Dùng `getOrDefault` để module không có cạnh vẫn là node hợp lệ. Độ phức tạp O(V + E), cycle không làm lặp vô hạn.

