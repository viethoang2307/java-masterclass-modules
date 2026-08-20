# Lời giải Bài 01

Parse bằng `URI`, kiểm tra scheme/host explicit. Không dùng `startsWith("https")`; URI malformed phải fail closed. Production còn whitelist host/port để chống SSRF.
