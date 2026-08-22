# 392 — TCP framing

Vì TCP là stream, application cần framing: delimiter (`\n`), length-prefix hoặc fixed-size frame. Parser phải chịu partial header/body và reject length quá lớn.

```text
[length:4 bytes][payload:length bytes]
```

Không dùng `available()` để biết message đã đủ. Accumulate bytes, parse khi đủ, giữ remainder cho frame kế tiếp.

## Bài tự luyện

Viết state machine parse length-prefixed frame với input chia thành từng byte.
