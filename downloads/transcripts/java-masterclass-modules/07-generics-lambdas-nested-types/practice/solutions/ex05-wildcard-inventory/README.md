# Lời giải — Bài 05: Wildcard Inventory

## Hướng tư duy

The solution uses Object-level reads for an unknown list, Number reads for an extends list, and Integer writes for a super list.

## Độ phức tạp

Each operation is O(n) except addRestock, which is O(1) amortized for ArrayList.

## Lỗi thường gặp

List<?> is not List<Object>; do not add arbitrary values to it. Validate negative restock explicitly.

## Phương án thay thế

A domain Inventory class can hide variance from callers and expose named operations such as restock and total.

## Chạy

~~~powershell
javac --release 17 Main.java SelfCheck.java
java SelfCheck
~~~

Kết quả đúng phải in PASS.

