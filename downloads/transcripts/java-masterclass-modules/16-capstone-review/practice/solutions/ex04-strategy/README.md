# Lời giải — Strategy selection

Duyệt candidates một lần và chỉ thay `best` khi priority lớn hơn, nên tie giữ input order. Policy không biết behavior bên trong strategy. Độ phức tạp O(n), bộ nhớ O(1).

