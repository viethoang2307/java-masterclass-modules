# Lời giải Bài 01

SQL text chứa placeholder, value được bind ở `PreparedStatement#setLong(1, id)`. Tách SQL khỏi input giúp chống injection và giữ query plan ổn định. Self-check chỉ kiểm contract string; integration test phải bind/excute với driver thật.
