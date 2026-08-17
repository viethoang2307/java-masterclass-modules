# Lesson 007 — Reproducible build và CI entry point

## Mục tiêu

Thiết kế project mà một người mới có thể clone, build và test mà không cần biết máy của tác giả.

## Checklist

1. Clone repository vào thư mục mới.
2. Kiểm tra java -version và mvn -version.
3. Đọc README, pom.xml và .gitignore.
4. Chạy mvn clean verify.
5. Chạy ứng dụng từ artifact hoặc documented command.
6. Ghi lại failure gồm command, version, log và expected behavior.

## Version boundary

Pin Java release trong Maven compiler configuration. Dependency phải được review; không copy một jar vào thư mục lib mà không ghi nguồn và version.

## CI skeleton

CI tối thiểu cần checkout code, setup JDK, chạy mvn -B verify và lưu test report. CI phải dùng cùng command với contributor.

## Lỗi thường gặp

- README chỉ hướng dẫn IntelliJ.
- Commit target/, .class, secret hoặc local config.
- Dùng latest dependency không kiểm soát.
- CI chạy lệnh khác local.
- Không ghi cách xử lý khi build fail.

## Bài tập

Viết một runbook onboarding cho máy sạch và một CI checklist. Mục tiêu là người khác chỉ cần copy commands, không cần hỏi thêm.
