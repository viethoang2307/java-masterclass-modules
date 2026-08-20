# 411 — Watches và field watchpoint

Watch expression tính giá trị tại pause; field watchpoint dừng khi field bị đọc/ghi tùy IDE/JVM support. Dùng để tìm writer đầu tiên làm state sai.

Watch có thể gọi method có side effect hoặc tốn thời gian; ưu tiên pure expression. Field watchpoint trong hot loop làm chương trình chậm và thay đổi timing.
