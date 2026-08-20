# 412 — Testing local protocols

Unit test parser bằng byte chunks; integration test dùng loopback server; fault test disconnect, partial write, timeout, malformed frame và slow reader.

Test phải timeout và cleanup port/thread. Không assert timing chính xác; assert protocol outcome và resource termination.
