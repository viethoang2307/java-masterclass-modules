# Lời giải — Bài 18: Immutable Functional Pipeline

## Hướng tư duy

The pipeline is a generic higher-order API: predicates consume T, mappers consume T and produce R. List.copyOf protects both construction and result boundaries.

## Độ phức tạp

Each stage is O(n) time and O(n) space; a chain of k stages is O(k·n) without fusion.

## Lỗi thường gặp

Returning the internal list leaks mutation. Using Function<T,R> instead of wildcards rejects useful supertype/subtype callbacks.

## Phương án thay thế

A Stream-based implementation can be lazy, but it has one-use semantics and different debugging/lifecycle tradeoffs.

## Chạy

~~~powershell
javac --release 17 Main.java SelfCheck.java
java SelfCheck
~~~

Kết quả đúng phải in PASS.

