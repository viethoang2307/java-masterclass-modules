# Lesson 167 — Generic methods

## Mục tiêu

Khai báo type parameter ở method; đọc vị trí của <T>; và thiết kế utility nhận nhiều loại collection mà vẫn type-safe.

## Cú pháp

~~~java
static <T> T first(List<T> values) {
    if (values.isEmpty()) throw new IllegalArgumentException("empty");
    return values.get(0);
}
~~~

<T> đứng trước return type. Đây là type parameter của method, không phải của class.

Một method có thể dùng type parameter khác class:

~~~java
static <T> List<T> singleton(T value) {
    return List.of(value);
}
~~~

Compiler thường infer T từ argument. Khi inference mơ hồ, truyền type witness như Collections.<Number>emptyList() hoặc gán target type rõ.

## Producer và consumer

~~~java
static <T> void copy(List<? super T> target, List<? extends T> source) {
    for (T value : source) target.add(value);
}
~~~

Source producer dùng extends, target consumer dùng super. Đây là nền của Collections.copy và PECS.

## Lỗi thường gặp

Đặt <T> sau return type, dùng Object khiến mất type, bounds quá chặt và cast kết quả.

## Bài tập

Viết swap, copyIf và map. copyIf nhận Predicate<? super T>, map nhận Function<? super T, ? extends R>, test với subtype collection.

