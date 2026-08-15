# Lời giải 07 — Iterator Filter

Iterator sở hữu cursor và cung cấp operation remove hợp lệ sau `next`. Xóa trực tiếp qua list trong enhanced for có thể gây `ConcurrentModificationException`. Complexity O(n) trên `LinkedList`; với `ArrayList`, nhiều lần xóa có thể tốn O(n²) do shifting. `removeIf` là phương án ngắn hơn.
