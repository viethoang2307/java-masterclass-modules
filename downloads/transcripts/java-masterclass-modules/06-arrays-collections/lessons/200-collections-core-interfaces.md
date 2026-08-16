# 200. Core interfaces của Collections

## Hierarchy

Iterable cung cấp iterator; Collection cung cấp add/remove/contains/size; List, Set và Queue chuyên biệt hóa semantics. Map là nhánh riêng với keySet, values và entrySet.

~~~java
static long positiveSum(Collection<Integer> values) {
    long total = 0;
    for (Integer value : values) {
        if (value != null && value > 0) total += value;
    }
    return total;
}
~~~

Method nhận Collection không nên giả định có index hoặc insertion order. Nếu cần index, nhận List; nếu cần key, nhận Map.

## Mutability contract

Một collection có thể read-only hoặc immutable; operation sửa có thể ném UnsupportedOperationException. Interface không đảm bảo method mutation luôn được hỗ trợ.

## Generic boundary

Collection<Integer> không phải Collection<Number> dù Integer extends Number. Dùng wildcard khi API cần variance, nhưng hiểu PECS trước khi áp dụng.

## Bài tập

Viết method nhận Collection<Integer> và method nhận List<Integer>; liệt kê operation mỗi method được phép dùng. Test bằng ArrayList, LinkedList và Set.
