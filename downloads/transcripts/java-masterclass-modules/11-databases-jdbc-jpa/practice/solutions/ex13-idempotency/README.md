# Lời giải Bài 13

Idempotency key phải được lưu durable cùng side effect trong transaction, thường có unique constraint. Map memory chỉ mô phỏng algorithm: duplicate request không apply lần hai. Nếu crash trước persist key, retry vẫn có thể duplicate.
