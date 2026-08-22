# 411 — Network security

Validate scheme/host/port để tránh SSRF; dùng TLS certificate verification, hostname verification và secret store. Giới hạn request size, header count, redirect target và connection rate.

Không tắt TLS verification để “fix” local nhanh rồi mang vào production. Log remote address có thể là PII, cần policy.
