# Lời giải — Transaction outcome

Ưu tiên kiểm tra begin, sau đó success path, cuối cùng rollback result. Điều này giữ thông tin rollback failure thay vì che nó bằng lỗi work ban đầu. Độ phức tạp O(1).

