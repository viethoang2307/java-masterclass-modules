# Lời giải 06 — LinkedList Itinerary

`ListIterator` cho phép vừa duyệt vừa chèn đúng cursor. Khi gặp phần tử lớn hơn, gọi `previous()` rồi `add`; nếu bằng nhau thì từ chối duplicate. Worst-case O(n), insertion tại cursor O(1). Dùng index trên `LinkedList` có thể biến traversal thành O(n²).
