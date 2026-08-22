# Lời giải — Service provider selection

Lọc provider null/không healthy/sai id rồi lấy max priority. `Stream.max` giữ phần tử đầu tiên khi comparator hòa, nên policy vẫn deterministic theo input order. Độ phức tạp O(n).

