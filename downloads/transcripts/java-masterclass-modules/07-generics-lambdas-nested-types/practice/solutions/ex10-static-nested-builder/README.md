# Lời giải — Bài 10: Static Nested Builder

## Hướng tư duy

Builder is static because it does not need an outer Config instance. The constructor copies validated state into final fields.

## Độ phức tạp

Build and access are O(1); the object uses O(1) space.

## Lỗi thường gặp

Validating only in setters makes a mutable builder awkward; also do not expose the builder's fields or return it from Config.

## Phương án thay thế

A validated record factory is shorter when there are few optional fields; builder is useful when construction has many named options.

## Chạy

~~~powershell
javac --release 17 Main.java SelfCheck.java
java SelfCheck
~~~

Kết quả đúng phải in PASS.

