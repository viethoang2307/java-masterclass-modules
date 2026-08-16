# 140. LinkedList add/remove và cursor

## Các operation

~~~java
LinkedList<String> route = new LinkedList<>();
route.addFirst("Home");
route.addLast("Office");
route.add(1, "Cafe");
route.removeFirst();
route.removeLast();
~~~

Index insertion cần traversal; addFirst/addLast thể hiện intent và có complexity tốt hơn. remove(Object) dùng equals, remove(index) dùng vị trí.

## Iterator position

ListIterator có next, previous, add, set, remove. Sau next hoặc previous mới được set/remove theo rule iterator; add thay đổi cursor.

## Bài tập

Viết orderedInsert với ListIterator, reject duplicate case-insensitive, test insert đầu/giữa/cuối và duplicate.

## Pitfalls

Gọi remove hai lần không có next, sửa list ngoài iterator, và nhầm remove value với remove index.
