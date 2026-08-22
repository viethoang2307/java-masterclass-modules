# Lời giải — Topological compile plan

DFS dùng state `0/1/2`: visiting lại node state 1 nghĩa là cycle. Sort node và dependency trước khi duyệt để output reproducible. Độ phức tạp O(V + E), không phụ thuộc số lần module được tham chiếu.

