# Lesson 172 — PECS

## Mục tiêu

Áp dụng Producer Extends, Consumer Super vào API; biết khi nào không cần wildcard; và phân tích variance theo hướng dữ liệu.

## Ví dụ chuẩn

~~~java
static <T> void copy(
        List<? super T> destination,
        List<? extends T> source) {
    for (T item : source) destination.add(item);
}
~~~

Source chỉ sản xuất T cho method nên extends. Destination nhận T nên super. T là mối liên kết giữ hai phía cùng type family.

## PECS không phải công thức máy móc

Nếu collection là cả input và output, dùng List<T> có thể rõ hơn. Nếu return List<? extends T>, caller thường khó thêm vào; cân nhắc trả List<T> mới hoặc immutable result.

## API review checklist

- Giá trị đi vào hay đi ra?
- Caller có cần add vào result không?
- T có cần giữ relationship giữa nhiều argument?
- Wildcard có làm error message quá khó hiểu?
- Có thể dùng interface nhỏ hơn Collection không?

## Lỗi thường gặp

Wildcard mọi nơi, nested wildcard không cần thiết và dùng extends cho destination rồi không add được.

## Bài tập

Refactor ba method copy, merge và transform từ T cứng sang variance phù hợp. Viết compile examples cho List<Integer>, List<Number>, List<Object>.

