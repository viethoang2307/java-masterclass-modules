# Lời giải — Bài 07: Raw Type Audit

## Hướng tư duy

The adapter validates every element before returning a parameterized immutable result, so unchecked pollution does not escape.

## Độ phức tạp

Validation is O(n) time and O(n) result space.

## Lỗi thường gặp

Checking only that the object is a List is insufficient; validate each element. Do not suppress warnings for the whole class.

## Phương án thay thế

If the source API can be changed, expose List<String> directly and remove the legacy boundary.

## Chạy

~~~powershell
javac --release 17 Main.java SelfCheck.java
java SelfCheck
~~~

Kết quả đúng phải in PASS.

