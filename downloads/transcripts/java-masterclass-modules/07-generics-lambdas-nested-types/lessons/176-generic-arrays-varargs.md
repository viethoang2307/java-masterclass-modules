# Lesson 176 — Generic arrays và varargs

## Mục tiêu

Hiểu vì sao không tạo trực tiếp T[]; dùng array factory; và đánh giá generic varargs.

## Vì sao bị cấm?

JVM cần component type cụ thể để tạo array và kiểm tra ArrayStoreException, trong khi T bị erasure.

~~~java
class Box<T> {
    // T[] values = new T[10]; // không compile
}
~~~

Dùng array có sẵn hoặc factory:

~~~java
static <T> T[] empty(int size, IntFunction<T[]> factory) {
    return factory.apply(size);
}
~~~

Caller truyền String[]::new để runtime biết component type.

## Generic varargs

Varargs là array nên non-reifiable element type có thể tạo warning.

~~~java
@SafeVarargs
static <T> List<T> flatten(List<T>... parts) {
    List<T> result = new ArrayList<>();
    for (List<T> part : parts) result.addAll(part);
    return result;
}
~~~

@SafeVarargs chỉ hợp lệ về mặt thiết kế khi method không lưu/làm lộ array và không ghi dữ liệu sai vào đó.

## Lỗi thường gặp

Cast Object[] sang T[], @SuppressWarnings thay cho invariant, và quên arrays covariant còn generics invariant.

## Bài tập

Viết concat(T[], T[]) và overload nhận IntFunction<T[]>. Test String[] và Number[].

