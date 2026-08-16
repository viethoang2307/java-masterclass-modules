# 203. Collections algorithms nâng cao

## Mutating algorithms

~~~java
List<String> queue = new ArrayList<>(List.of("A", "B", "C"));
Collections.swap(queue, 0, 2);
Collections.reverse(queue);
Collections.replaceAll(queue, "B", "B2");
~~~

swap/reverse/replaceAll sửa list tại chỗ. Collections.disjoint chỉ đọc và trả true khi hai collection không có phần tử equals nhau.

## Equality và performance

replaceAll/disjoint dựa vào equals. Complexity phụ thuộc implementation; swap theo index trên LinkedList có thể cần traversal. Đừng suy luận Big-O chỉ từ tên method.

## Bài tập

Biến đổi lịch thi đấu bằng swap/reverse, rồi assert tập đội không đổi. Test mutable ArrayList, immutable List.of và custom value object equality.

## Lỗi thường gặp

Sửa immutable list, nhầm disjoint với subset, và không phân biệt list content change với collection membership change.
