# Bài 10 — Module-path command (Hard)

Tạo chuỗi command chính xác: `java --module-path "<path>" -m <module>/<mainClass>`. Reject input rỗng/null bằng `IllegalArgumentException`; quote path để hỗ trợ khoảng trắng trên Windows.

Không thêm `--add-opens` hoặc classpath vào command vì đây là module-mode contract.

