# Lời giải Bài 03

Identifier không thể dùng `?`, nên switch trên closed set là cách rõ ràng. Input lạ fail fast thay vì cố sanitize. Nếu cần direction, whitelist direction riêng rồi ghép hai token đã kiểm soát.
