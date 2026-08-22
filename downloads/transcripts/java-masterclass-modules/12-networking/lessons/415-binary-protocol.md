# 415 — Binary protocol design

Binary protocol cần version, endian, length, type, checksum/error code và max sizes. `ByteBuffer.order(ByteOrder.BIG_ENDIAN)` phải explicit.

Parser validate length trước allocate để tránh memory exhaustion. Unknown version/type nên trả protocol error, không đoán silently.
