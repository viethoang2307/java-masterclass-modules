# Lời giải Bài 16

Một query lấy parent cộng N query lazy child tạo N+1. Fetch join/DTO có thể giảm query count nhưng phải kiểm duplicate row, pagination và memory. Metric query count trong test giúp bắt regression.
