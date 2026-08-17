# Lesson 166 — Generic class và type safety

## Mục tiêu

Hiểu type parameter như một lời hứa về kiểu dữ liệu; dùng generic class để loại bỏ cast; và phân biệt compile-time safety với runtime behavior.

## Mental model

Generic class mô tả một family of types. T trong Box<T> là placeholder được thay bằng type cụ thể ở nơi sử dụng.

~~~java
final class Box<T> {
    private final T value;
    Box(T value) { this.value = value; }
    T get() { return value; }
}

Box<String> text = new Box<>("hello");
String value = text.get();
~~~

Compiler biết get trả String nên caller không cần cast. Type argument phải được dùng ở vị trí phù hợp; primitive như int cần wrapper Integer.

## Invariance

Box<String> không phải subtype của Box<Object>. Nếu cho phép, code có thể đặt Integer vào Box<String>. Khi cần abstraction rộng hơn, dùng wildcard ở boundary.

~~~java
static void print(Box<?> box) {
    System.out.println(box.get());
}
~~~

Box<?> đọc được nhưng không thêm giá trị khác null vì type thật chưa biết.

## Thiết kế generic class

- Giữ invariant ở constructor và method.
- Dùng private field, không expose mutable state.
- Tên T, K, V, E chỉ nên dùng cho utility rõ ràng; domain class có thể dùng CustomerType.
- Đặt bound khi operation cần capability, không bound chỉ để trang trí.

## Lỗi thường gặp

Raw type, cast trong caller, dùng Object thay cho T và cho phép null mà không ghi contract.

## Bài tập

Viết Pair<L,R> immutable với left/right, mapLeft và mapRight. Test String/Integer và chứng minh Pair<String,Integer> không gán được cho Pair<Object,Object>.

