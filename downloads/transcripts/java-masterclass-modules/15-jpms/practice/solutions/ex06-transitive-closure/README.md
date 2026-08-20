# Lời giải — Transitive closure

BFS mở rộng từ root và đánh dấu trước khi enqueue lại. Cycle `common -> app` vì vậy an toàn. Độ phức tạp O(V + E), bộ nhớ O(V).

