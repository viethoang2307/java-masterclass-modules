# Lời giải — Bài 16: Method Reference Registry

## Hướng tư duy

ArrayList::new and LinkedList::new are constructor references; String::length is unbound and receives the String as its first functional argument.

## Độ phức tạp

Factory lookup is O(1) average; lengths is O(n) time and O(n) result space.

## Lỗi thường gặp

A method reference needs a target functional interface. A constructor reference creates the object only when get/apply is invoked.

## Phương án thay thế

Use an enum strategy when the set of factory names is closed and should be validated at compile time.

## Chạy

~~~powershell
javac --release 17 Main.java SelfCheck.java
java SelfCheck
~~~

Kết quả đúng phải in PASS.

