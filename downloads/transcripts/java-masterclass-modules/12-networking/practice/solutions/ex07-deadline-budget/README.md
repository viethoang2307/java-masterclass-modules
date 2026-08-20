# Lời giải Bài 07

Deadline truyền qua các layer, không reset timeout mỗi retry. `max(0, deadline-now)` tránh timeout âm; clock thật nên là monotonic `System.nanoTime`.
