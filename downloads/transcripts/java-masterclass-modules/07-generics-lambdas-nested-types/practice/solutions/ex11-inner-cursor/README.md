# Lời giải — Bài 11: Inner Cursor

## Hướng tư duy

Cursor is an inner member class because it needs the enclosing Notebook's lines. Notebook copies its input, so cursor traversal cannot mutate the caller's list.

## Độ phức tạp

hasNext is O(1); next is O(1); notebook construction is O(n) for the defensive copy.

## Lỗi thường gặp

Do not make Cursor static if it needs outer state. Do not return the mutable source list.

## Phương án thay thế

Implement Iterator<String> when the cursor should integrate with enhanced for and the standard iteration contract.

## Chạy

~~~powershell
javac --release 17 Main.java SelfCheck.java
java SelfCheck
~~~

Kết quả đúng phải in PASS.

