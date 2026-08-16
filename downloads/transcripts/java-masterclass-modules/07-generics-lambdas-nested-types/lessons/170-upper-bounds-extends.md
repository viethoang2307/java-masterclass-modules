# Lesson 170 — Upper-bounded wildcard

## Mục tiêu

Dùng ? extends T khi collection là producer; hiểu vì sao chỉ đọc được T; và tránh nhầm wildcard capture với type parameter.

~~~java
static double average(List<? extends Number> values) {
    return values.stream().mapToDouble(Number::doubleValue).average().orElse(0);
}
~~~

Method nhận List<Integer>, List<Double> hoặc List<Number>. Khi đọc, mỗi element an toàn như Number. Khi thêm, compiler không biết hidden subtype là Integer hay Double nên chỉ cho null.

## Capture

Method helper có thể capture wildcard thành một type cụ thể:

~~~java
static void reverse(List<?> values) {
    reverseCaptured(values);
}
private static <T> void reverseCaptured(List<T> values) {
    int i = 0, j = values.size() - 1;
    while (i < j) {
        T tmp = values.get(i);
        values.set(i, values.get(j));
        values.set(j, tmp);
        i++; j--;
    }
}
~~~

Capture giúp đọc/ghi cùng một unknown type mà không đưa giá trị mới từ bên ngoài vào.

## Lỗi thường gặp

Dùng add(T) vào ? extends, cast từng element, hoặc biến List<? extends Number> thành List<Number> bằng cast.

## Bài tập

Viết maxValue(List<? extends T>, Comparator<? super T>) và test một List<Dog> với Comparator<Animal>.

