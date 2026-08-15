# Lời giải 11 — Set Algebra

Mỗi bulk operation mutate receiver, nên mọi kết quả bắt đầu từ `HashSet` copy. Symmetric difference có thể tính `(A∪B)−(A∩B)`. Complexity O(|A|+|B|) average, đổi lấy O(|A|+|B|) space để bảo vệ input.
