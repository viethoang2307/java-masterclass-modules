# Lesson 173 — Wildcards và invariance

## Mục tiêu

Đọc unbounded wildcard, upper/lower bound; hiểu capture; và chọn type parameter khi cần đặt tên cho unknown type.

## Ba dạng

- List<?>: một List của type chưa biết.
- List<? extends Number>: producer của một subtype Number.
- List<? super Integer>: consumer của Integer.

~~~java
static void printAny(List<?> values) {
    for (Object value : values) System.out.println(value);
}
~~~

Không thể add non-null vào List<?> vì compiler phải bảo vệ type thật.

## Wildcard hay type parameter?

Nếu chỉ cần đọc: List<?> thường dễ hiểu. Nếu cần dùng cùng type ở hai vị trí: <T> hoặc helper capture.

~~~java
static <T> boolean sameFirst(List<T> a, List<T> b) {
    return Objects.equals(a.get(0), b.get(0));
}
~~~

T đặt tên relationship; wildcard biểu diễn unknown độc lập.

## Nested wildcard

Map<String, ? extends Number> cho phép đọc Number nhưng mỗi value có thể là subtype khác nhau. Tránh cast và ghi rõ null policy.

## Lỗi thường gặp

Nghĩ ? là Object, cố add vào extends, hoặc biến wildcard thành raw type.

## Bài tập

Thiết kế print, copy và zip cho collections. Với mỗi method, giải thích vì sao dùng ?, extends, super hoặc T.

