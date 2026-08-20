# 414 — DNS và connection reuse

DNS có cache/TTL và có thể đổi IP; connection pool/reuse giảm handshake nhưng cần max idle/lifetime. Failure một IP không luôn nghĩa hostname down.

Đừng cache DNS vô hạn; chọn policy theo service discovery. Retry cùng IP có thể vô ích, retry resolver/alternate address cần giới hạn.
