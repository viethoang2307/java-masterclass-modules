# Bài 08 — Repository contract (Hard)

Mỗi operation repository phải parameterized, đóng resource và translate infrastructure error ở boundary. Trả lỗi `unsafe-sql:<name>`, `leaked-resource:<name>`, `leaked-error:<name>` theo thứ tự cột kiểm tra.

Bài không chạy JDBC thật; nó luyện review evidence trước khi integration test.

