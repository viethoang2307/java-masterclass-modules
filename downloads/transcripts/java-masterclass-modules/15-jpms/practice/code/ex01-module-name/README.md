# Bài 01 — Validate module name (Medium)

Viết `isValidModuleName`. Tên phải có ít nhất một segment, mỗi segment là Java identifier không phải keyword và không được rỗng. `com.acme.player` hợp lệ; `com..player`, `9player` và `class.app` không hợp lệ.

Tiêu chí: xử lý `null`, ký tự Unicode hợp lệ và không chấp nhận khoảng trắng. Không dùng regex duy nhất nếu nó làm sai quy tắc identifier của Java.

