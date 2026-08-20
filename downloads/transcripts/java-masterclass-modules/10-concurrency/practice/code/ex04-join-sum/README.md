# Bài 04 — Join và chia workload (Medium)

Chia mảng số nguyên thành nhiều đoạn, mỗi thread tính một partial sum, main `join` rồi cộng các partial sum. Mỗi thread chỉ ghi slot riêng để không cần lock.
