# Lời giải — Bài 08: Generic Varargs Flatten

## Hướng tư duy

The method consumes each list and creates a new immutable result. The array factory supplies the reifiable component type.

## Độ phức tạp

flatten is O(total element count) time and space; copyWithFactory is O(n).

## Lỗi thường gặp

Do not store the varargs array or cast Object[] to T[]. @SafeVarargs is justified only when the method preserves the invariant.

## Phương án thay thế

Prefer Collection<? extends T> when varargs readability or warning behavior is not worth the convenience.

## Chạy

~~~powershell
javac --release 17 Main.java SelfCheck.java
java SelfCheck
~~~

Kết quả đúng phải in PASS.

