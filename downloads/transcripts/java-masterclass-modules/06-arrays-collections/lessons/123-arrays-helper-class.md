# 123. Arrays helper class

## Các method cần biết

~~~java
int[] values = {4, 1, 9, 1};
Arrays.sort(values);
System.out.println(Arrays.toString(values)); // [1, 1, 4, 9]
int[] copy = Arrays.copyOf(values, 6);
Arrays.fill(copy, 4, 6, -1);
~~~

Arrays.toString dành cho array một chiều; Arrays.deepToString dành cho nested array. Arrays.equals so value theo phần tử; == chỉ so reference.

## Copy và range

copyOf có thể đổi length; slot mới nhận default value. copyOfRange(array, from, to) dùng half-open range [from,to), giống nhiều API Java.

## Sort và equality

Arrays.sort mutate array. Nếu cần giữ input, copy trước. Với object array, sort dựa natural order hoặc comparator; phần tử null có thể gây lỗi tùy comparator.

## Bài tập

Viết report trước/sau sort, chứng minh input không đổi khi dùng defensive copy, và test nested array với deepEquals.

## Pitfalls

In System.out.println(array) chỉ thấy object identity; dùng sai inclusive endpoint; sort nhầm object mutable mà comparator dựa trên field có thể đổi.
