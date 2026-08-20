# Bài 20 — Order transaction capstone (Extreme)

Trả outcome của order: stock fail => rollback; payment fail => rollback; cả hai thành công => `COMMITTED:OUTBOX`. Đây là pure contract để luyện transaction boundary, không giả lập JDBC server.
