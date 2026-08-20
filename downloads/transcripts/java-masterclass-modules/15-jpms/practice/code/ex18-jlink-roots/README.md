# Bài 18 — `jlink` root selection (Extreme)

Cho module graph và một hoặc nhiều root module, tính closure cần đưa vào runtime image. Root luôn xuất hiện; graph có cycle phải an toàn.

Không thêm module không reachable. Đây là static graph model, không tự đoán dependency nạp qua reflection.

