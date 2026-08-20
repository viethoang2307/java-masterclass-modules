# Bài 12 — BlockingQueue producer/consumer (Hard)

Producer đưa các số 1..100 vào queue bounded rồi gửi sentinel. Consumer lấy và cộng. Dùng `put/take`, xử lý interrupt và đảm bảo mọi thread kết thúc.
