# Lesson 178 — Generic extrema utility

## Mục tiêu

Kết hợp bound, Comparator và Optional để viết max/min reusable mà vẫn linh hoạt với subtype.

~~~java
static <T extends Comparable<? super T>> Optional<T> maxNatural(
        Collection<? extends T> values) {
    return values.stream().max(Comparator.naturalOrder());
}

static <T> Optional<T> maxBy(
        Collection<? extends T> values,
        Comparator<? super T> comparator) {
    return values.stream().max(comparator);
}
~~~

Comparable<? super T> cho phép T dùng natural ordering khai báo ở supertype. Collection<? extends T> nhận collection subtype; Comparator<? super T> nhận comparator của T hoặc supertype.

Empty collection trả Optional.empty. Null phải có policy riêng: reject hoặc comparator hỗ trợ null.

Độ phức tạp một lượt duyệt là O(n) time và O(1) auxiliary space.

## Lỗi thường gặp

Bound Comparable<T> quá chặt, Collection<T> làm mất flexibility, trả null khi empty và quên Optional không chứa null.

## Bài tập

Viết minBy, maxBy và bestTwoPass; test empty, tie, subtype collection, comparator đảo thứ tự và null policy.

