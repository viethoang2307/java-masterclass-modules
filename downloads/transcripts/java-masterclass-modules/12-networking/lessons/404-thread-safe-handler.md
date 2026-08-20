# 404 — Thread-safe response handling

Custom handler có thể nhận callbacks theo lifecycle; state mutable phải confined hoặc synchronized. Không reuse `ByteBuffer`/accumulator giữa requests.

Mỗi response có correlation id, byte count, status và failure cause riêng. Handler không được block event thread bằng disk/CPU dài.
