# 142. Iterator và safe mutation

## Vì sao iterator?

Iterator cung cấp traversal abstraction và operation remove hợp lệ trong lúc duyệt.

~~~java
Iterator<String> iterator = values.iterator();
while (iterator.hasNext()) {
    String value = iterator.next();
    if (value.isBlank()) iterator.remove();
}
~~~

Xóa trực tiếp values.remove trong enhanced for thường gây ConcurrentModificationException. Fail-fast là best effort, không phải concurrency guarantee.

## ListIterator

ListIterator thêm previous, add, set và nextIndex; phù hợp ordered insertion/chỉnh list hai chiều.

## Bài tập

Implement removeInvalid, lọc null/blank/token sai bằng iterator. Test ArrayList và LinkedList, đếm số phần tử xóa và test repeated remove contract.

## Pitfalls

Gọi remove trước next, gọi remove hai lần, giữ iterator sau structural modification và nghĩ fail-fast thay thế synchronization.
