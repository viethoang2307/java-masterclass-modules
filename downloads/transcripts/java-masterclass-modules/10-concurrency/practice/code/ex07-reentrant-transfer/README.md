# Bài 07 — ReentrantLock và transfer (Hard)

Hai thread transfer ngược chiều giữa hai account. Dùng `ReentrantLock`, lock theo thứ tự id và `try/finally`. Self-check có timeout; không được để deadlock.
