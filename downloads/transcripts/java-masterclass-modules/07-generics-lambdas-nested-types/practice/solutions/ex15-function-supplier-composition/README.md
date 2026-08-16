# Lời giải — Bài 15: Function và Supplier Composition

## Hướng tư duy

compose makes trim run before lower; orElseGet preserves laziness. The parse method makes the non-zero domain invariant explicit.

## Độ phức tạp

Each transformation is O(length of text); default lookup is O(1) apart from supplier cost.

## Lỗi thường gặp

Do not use Optional.orElse when the fallback is expensive. Do not swallow NumberFormatException.

## Phương án thay thế

Use UnaryOperator<String> for normalize because input/output are the same type.

## Chạy

~~~powershell
javac --release 17 Main.java SelfCheck.java
java SelfCheck
~~~

Kết quả đúng phải in PASS.

