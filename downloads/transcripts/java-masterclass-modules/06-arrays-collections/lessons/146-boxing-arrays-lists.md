# 146. Boxing trong arrays và lists

## Type difference

int[] chứa primitive int; Integer[] chứa reference Integer; List<Integer> chứa reference và boxing.

~~~java
int[] primitive = {1, 2, 3};
List<Integer> values = new ArrayList<>();
for (int value : primitive) values.add(value);
~~~

Conversion cần loop hoặc utility; không có cast trực tiếp giữa int[] và List<Integer>.

## Null semantics

List<Integer> có thể chứa null nếu implementation cho phép; int[] không có null. API cần ghi rõ null element có hợp lệ không.

## Bài tập

Implement toList và toIntArray với validation null, test empty, null element, duplicate và large values. Dùng Math exact khi aggregate.

## Pitfalls

Nghĩ generic type chứa primitive, unbox null, và mất dữ liệu khi narrow cast.
