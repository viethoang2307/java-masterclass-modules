# 202. Collections essential methods

## Utility algorithms

~~~java
List<Integer> values = new ArrayList<>(List.of(8, 3, 5, 3));
Collections.sort(values);
int min = Collections.min(values);
int max = Collections.max(values);
Collections.shuffle(values, new Random(7));
~~~

sort và shuffle mutate list. min/max cần natural order hoặc Comparator. Seeded Random làm test deterministic.

## copy và fill

Collections.copy(destination, source) không tự mở rộng destination; destination phải có đủ size. Collections.fill thay mọi element trong list hiện có. Cả hai yêu cầu list mutation phù hợp.

## Contract

Immutable list như List.of sẽ ném UnsupportedOperationException khi sort/reverse. Hãy tạo mutable copy nếu API không sở hữu input.

## Bài tập

Shuffle deck bằng seed, verify đủ 52 card và set card không đổi. Viết ví dụ copy sai destination size và giải thích exception.
