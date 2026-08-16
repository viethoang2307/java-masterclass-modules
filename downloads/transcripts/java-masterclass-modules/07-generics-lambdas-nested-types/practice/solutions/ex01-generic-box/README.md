# Lời giải — Bài 01: Generic Box và Pair

## Hướng tư duy

Box and Pair preserve the type parameter at compile time; Pair.mapLeft demonstrates a producer result and consumer function without casts.

## Độ phức tạp

Box access is O(1); mapLeft is O(1) and creates one new Pair.

## Lỗi thường gặp

Do not use Object fields with caller casts. Do not make mapLeft mutate the original pair.

## Phương án thay thế

For a record-only model, record Box<T>(T value) and record Pair<L,R>(L left, R right) are shorter, but the class version makes invariants visible.

## Chạy

~~~powershell
javac --release 17 Main.java SelfCheck.java
java SelfCheck
~~~

Kết quả đúng phải in PASS.

