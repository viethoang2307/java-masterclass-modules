# 403 — BodyHandler và streaming

`BodyHandlers.ofString` tiện nhưng giữ toàn body trong memory. File/response lớn nên streaming hoặc custom `BodySubscriber` có giới hạn.

Body handler quyết định charset/size/processing; không parse JSON trước khi kiểm status/content type. Back-pressure của reactive subscriber phải được tôn trọng.

## Bài tự luyện

Thiết kế handler reject body > 1 MiB và cancel subscription khi vượt limit.
