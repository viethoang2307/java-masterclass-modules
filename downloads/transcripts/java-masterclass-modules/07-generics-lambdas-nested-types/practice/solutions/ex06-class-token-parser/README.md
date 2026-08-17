# Lời giải — Bài 06: Class Token Parser

## Hướng tư duy

Erasure means the method needs Class<T> to recover runtime type information. Class.cast makes the final cast checked by the token.

## Độ phức tạp

Parsing is O(length of input); firstOrDefault is O(1).

## Lỗi thường gặp

Do not use an unchecked (T) cast for arbitrary values. Do not use reflection as a substitute for an explicit conversion policy.

## Phương án thay thế

Use a Map<Class<?>, Function<String, ?>> registry when supported types grow, with a carefully scoped checked adapter.

## Chạy

~~~powershell
javac --release 17 Main.java SelfCheck.java
java SelfCheck
~~~

Kết quả đúng phải in PASS.

