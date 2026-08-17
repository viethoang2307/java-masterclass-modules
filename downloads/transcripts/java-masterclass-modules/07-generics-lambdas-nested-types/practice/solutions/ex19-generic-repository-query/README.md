# Lời giải — Bài 19: Generic Repository và Nested Query

## Hướng tư duy

The repository accepts Collection<? extends T>, while callbacks consume T through Predicate<? super T> and Comparator<? super T>. Query is static because it does not need repository state.

## Độ phức tạp

Construction is O(n); find is O(n); query is O(n log n) when ordered and O(n) otherwise, with O(n) result space.

## Lỗi thường gặp

Do not expose the internal map. Do not silently overwrite duplicate IDs unless that is the documented policy.

## Phương án thay thế

A database-backed repository should push predicate/order/limit to the data source; this in-memory version makes the contracts visible.

## Chạy

~~~powershell
javac --release 17 Main.java SelfCheck.java
java SelfCheck
~~~

Kết quả đúng phải in PASS.

