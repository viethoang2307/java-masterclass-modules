# Lời giải — Bài 09: Comparator Leaderboard

## Hướng tư duy

The comparator makes ties deterministic, so TreeSet does not collapse different players that share score and time.

## Độ phức tạp

Sorting is O(n log n) time and O(n) copy space.

## Lỗi thường gặp

Subtracting scores can overflow. A comparator that returns zero for unrelated players may silently drop entries in TreeSet.

## Phương án thay thế

Implement Comparable only if this ordering is truly the domain's one natural ordering; otherwise keep it external.

## Chạy

~~~powershell
javac --release 17 Main.java SelfCheck.java
java SelfCheck
~~~

Kết quả đúng phải in PASS.

