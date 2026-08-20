# 493 — Testing modular code

Test nên chạy trong điều kiện gần production: module path, packaged JAR và runtime flags giống nhau.

## Các lớp test

1. Unit test API không cần mở internal.
2. Module graph test kiểm tra descriptor và dependency.
3. Service test kiểm tra provider discovery.
4. Packaging smoke test chạy từ JAR/image.
5. Reflection test xác minh chỉ package cần thiết được opens.

Nếu framework test nằm ở unnamed module, việc truy cập internal có thể làm kết quả khác production. Dùng test module hoặc cấu hình `--add-opens` có ghi chú; không biến mọi package thành public.

## Evidence

Lưu JDK version, compile command, run command, module resolution output và exit code. Test fail cần giữ log nguyên nhân đầu tiên.

## Checkpoint

Thiết kế pipeline có bước `clean -> compile module graph -> unit -> package -> smoke run`. Xác định bước nào bắt lỗi missing service mà compile không thấy.

