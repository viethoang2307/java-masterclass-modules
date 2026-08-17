# Lời giải — Bài 14: Consumer Audit Pipeline

## Hướng tư duy

Consumer.andThen expresses sequencing. The result log is copied before returning so callers cannot mutate internal state.

## Độ phức tạp

Processing is O(n) time and O(n) audit space.

## Lỗi thường gặp

A failing first consumer prevents the second from running. Do not use a shared ArrayList from parallel code without a concurrency policy.

## Phương án thay thế

Return a stream of commands or use a collector when side effects should be delayed.

## Chạy

~~~powershell
javac --release 17 Main.java SelfCheck.java
java SelfCheck
~~~

Kết quả đúng phải in PASS.

