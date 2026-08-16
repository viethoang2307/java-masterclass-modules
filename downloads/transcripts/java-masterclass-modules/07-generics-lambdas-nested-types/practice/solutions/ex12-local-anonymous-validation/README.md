# Lời giải — Bài 12: Local và Anonymous Validation

## Hướng tư duy

The Rule type is local because it belongs only to validate. The anonymous class demonstrates a state-free one-off implementation while the other rule uses a lambda.

## Độ phức tạp

With r rules and username length l, validation is O(r·l) in the worst case and O(r) result space.

## Lỗi thường gặp

Do not call length before null validation. Do not use an anonymous class for logic that needs reuse or independent tests.

## Phương án thay thế

A top-level Validator type is better when rules are shared by multiple endpoints.

## Chạy

~~~powershell
javac --release 17 Main.java SelfCheck.java
java SelfCheck
~~~

Kết quả đúng phải in PASS.

