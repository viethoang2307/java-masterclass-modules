# 139. LinkedList và trade-off

## Mental model

LinkedList là node liên kết hai chiều. get(index) cần traversal, còn add/remove ở đầu/cuối có thể hiệu quả. List interface không làm mọi implementation có cùng complexity.

~~~java
LinkedList<String> queue = new LinkedList<>();
queue.addLast("A");
queue.addLast("B");
String first = queue.removeFirst();
~~~

Nếu cần queue semantics, khai báo Queue hoặc Deque thay vì expose LinkedList. ArrayDeque thường phù hợp queue/stack hơn LinkedList vì locality và overhead.

## Khi dùng

LinkedList hữu ích khi thao tác đầu/cuối hoặc iterator position là trọng tâm. Random access nhiều lần thường chọn ArrayList.

## Bài tập

Implement itinerary insert bằng ListIterator, so sánh get(i) loop với iterator loop và ghi Big-O.

## Pitfalls

Dùng LinkedList như array, lạm dụng remove(0) của ArrayList, và khai báo concrete type khiến đổi implementation khó.
