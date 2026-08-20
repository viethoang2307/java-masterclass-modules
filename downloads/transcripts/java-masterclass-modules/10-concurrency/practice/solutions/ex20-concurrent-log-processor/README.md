# Lời giải Bài 20

Pattern được compile một lần; mỗi task tạo matcher trên line riêng. `ConcurrentHashMap.merge` là atomic cho từng level, còn Future được collect để không return trước khi mọi task xong. Malformed input được coi là record bị bỏ qua và không làm hỏng batch.

Độ phức tạp O(n × lineLength), memory O(number of levels + futures). Với file lớn, dùng bounded `BlockingQueue`, producer/consumer và output snapshot; không submit vô hạn vào queue unbounded.

Pitfall: dùng một `Matcher` dùng chung giữa thread, parse level bằng `split` không có validation, hoặc quên shutdown khiến verifier không thoát.
