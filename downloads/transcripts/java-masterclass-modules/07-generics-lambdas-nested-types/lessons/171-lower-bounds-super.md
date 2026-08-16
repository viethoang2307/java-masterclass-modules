# Lesson 171 — Lower-bounded wildcard

## Mục tiêu

Dùng ? super T khi collection là consumer; đọc giá trị ở mức Object; và thiết kế copy API linh hoạt.

~~~java
static <T> void addDefaults(List<? super T> target, T first, T second) {
    target.add(first);
    target.add(second);
}
~~~

List<Object>, List<Number> và List<Integer> đều có thể là target khi T là Integer. Khi lấy ra, chỉ có thể tin chắc Object vì type thật có thể là supertype.

~~~java
Object value = target.get(0);
~~~

Lower bound thường xuất hiện trong Consumer<? super T>, Comparator<? super T> và sink collection.

## PECS trực quan

Data đi ra khỏi source: extends. Data đi vào target: super. Nếu method vừa đọc vừa ghi cùng collection, type parameter thường rõ hơn wildcard một chiều.

## Lỗi thường gặp

Gán Object vào T, dùng List<? super Integer> như List<Integer>, hoặc dùng super ở nơi API cần trả subtype cụ thể.

## Bài tập

Viết drain(Source<? extends T>, List<? super T>) chuyển dữ liệu từ queue source sang nhiều loại sink. Test Number/Integer.

