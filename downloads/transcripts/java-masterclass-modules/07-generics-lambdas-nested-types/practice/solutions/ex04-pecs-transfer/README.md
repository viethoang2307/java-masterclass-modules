# Lời giải — Bài 04: PECS Transfer

## Hướng tư duy

T links the source and target while PECS keeps each side flexible. snapshot creates an independent mutable list.

## Độ phức tạp

transfer and snapshot are O(n) time; snapshot uses O(n) additional space.

## Lỗi thường gặp

Returning the source directly leaks its mutation and using List<T> on both sides makes the API unnecessarily narrow.

## Phương án thay thế

Return List.copyOf for an immutable snapshot when callers must not mutate the result.

## Chạy

~~~powershell
javac --release 17 Main.java SelfCheck.java
java SelfCheck
~~~

Kết quả đúng phải in PASS.

