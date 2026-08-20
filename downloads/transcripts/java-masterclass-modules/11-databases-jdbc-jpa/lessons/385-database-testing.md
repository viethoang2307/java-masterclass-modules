# 385 — Database testing

Unit test repository boundary có thể dùng fake/contract; integration test cần database engine thật hoặc container để kiểm tra SQL, type, constraint, isolation và migration. H2 compatibility không chứng minh đúng với MySQL/PostgreSQL.

Test phải cô lập dữ liệu, cleanup deterministic và có timeout. Seed data nên versioned; test assertion vào behavior, không phụ thuộc id tự sinh nếu không cần.

## Bài tự luyện

Lập test matrix cho transfer: success, insufficient funds, duplicate request, deadlock retry, constraint error và rollback.
