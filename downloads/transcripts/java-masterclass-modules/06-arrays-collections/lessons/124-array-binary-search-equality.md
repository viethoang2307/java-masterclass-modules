# 124. Binary search và equality

## Precondition

Binary search chỉ đúng khi array đã sort theo cùng ordering.

~~~java
int[] sorted = {1, 3, 5, 7};
int index = Arrays.binarySearch(sorted, 5); // 2
~~~

Nếu target không có, kết quả âm mã hóa insertion point: -(insertionPoint) - 1. Có thể phục hồi bằng -result - 1.

## Equality của object

Arrays.equals(Object[], Object[]) dùng equals, không dùng reference identity. Record/value object thường phù hợp hơn class mutable khi array cần so sánh.

## Complexity

Sort O(n log n), search O(log n). Nếu chỉ tìm một lần trên dữ liệu nhỏ, linear search có thể đơn giản hơn; phải tính cả chi phí sort.

## Bài tập

Viết findOrInsertionPoint, test found, before-first, between, after-last và duplicate. Ghi rõ duplicate trả occurrence nào vì binary search không đảm bảo first/last.

## Lỗi thường gặp

Search array chưa sort, sort ascending nhưng search comparator descending, và dùng kết quả âm như index trực tiếp.
