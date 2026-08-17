# Lời giải — Bài 02: Generic swap và copy

## Hướng tư duy

The two methods show the direction of data flow: source produces T, target consumes T.

## Độ phức tạp

swap is O(1); copyTo is O(n) time and O(1) auxiliary space.

## Lỗi thường gặp

Do not change both parameters to List<T>; that rejects valid subtype/supertype callers.

## Phương án thay thế

Use Collections.copy only when the target already has enough slots; this exercise intentionally appends to a destination.

## Chạy

~~~powershell
javac --release 17 Main.java SelfCheck.java
java SelfCheck
~~~

Kết quả đúng phải in PASS.

