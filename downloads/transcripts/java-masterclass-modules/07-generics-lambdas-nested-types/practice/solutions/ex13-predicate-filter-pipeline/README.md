# Lời giải — Bài 13: Predicate Filter Pipeline

## Hướng tư duy

Predicates are composed with and, so cheap guards run before field access. Stream filter keeps encounter order for the sequential list.

## Độ phức tạp

O(n) predicate evaluations and O(k) result space, where k is the number of eligible users.

## Lỗi thường gặp

Do not access fields before the non-null guard. Do not hide side effects in predicates.

## Phương án thay thế

For hot primitive-only filters, use specialized predicates or an imperative loop after profiling.

## Chạy

~~~powershell
javac --release 17 Main.java SelfCheck.java
java SelfCheck
~~~

Kết quả đúng phải in PASS.

