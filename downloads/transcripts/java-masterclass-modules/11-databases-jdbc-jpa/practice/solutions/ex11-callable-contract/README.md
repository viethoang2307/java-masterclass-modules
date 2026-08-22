# Lời giải Bài 11

Procedure name là constant contract; values được `setLong`/`registerOutParameter` ở code JDBC thật. OUT parameter phải register đúng `java.sql.Types` trước execute. Vendor syntax cần integration test.
