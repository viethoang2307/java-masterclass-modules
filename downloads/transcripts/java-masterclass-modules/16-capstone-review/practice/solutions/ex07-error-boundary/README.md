# Lời giải — Error boundary

`switch` đóng vai trò mapping policy, giữ error code ổn định và dùng default cho category mới/chưa biết. Adapter có thể log cause riêng; UI chỉ nhận code an toàn. Độ phức tạp O(1).

