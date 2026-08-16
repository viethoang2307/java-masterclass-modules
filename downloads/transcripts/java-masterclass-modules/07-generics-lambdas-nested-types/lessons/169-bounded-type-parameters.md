# Lesson 169 — Bounded type parameters

## Mục tiêu

Dùng upper bound để yêu cầu capability; phân biệt bound class/interface; và kết hợp nhiều bound mà không over-constrain API.

## Upper bound

~~~java
static <T extends Number> double sum(T a, T b) {
    return a.doubleValue() + b.doubleValue();
}
~~~

T phải là Number hoặc subtype. Bound cho phép gọi Number methods nhưng không làm phép cộng generic tự động thành primitive.

Multiple bounds:

~~~java
static <T extends Number & Comparable<? super T>> T max(T a, T b) {
    return a.compareTo(b) >= 0 ? a : b;
}
~~~

Nếu có class bound, nó phải đứng trước interface bounds. Type parameter chỉ có một class bound.

## Bound và wildcard khác nhau

T extends Number gắn capability với type parameter và thường giữ relationship giữa input/output. ? extends Number chỉ nói có một subtype nào đó nhưng không biết subtype cụ thể.

## Lỗi thường gặp

Bound bằng concrete class không cần thiết, dùng Comparable<T> quá chặt, nhầm Number hỗ trợ arithmetic operator và đặt interface trước class bound.

## Bài tập

Tạo statistics<T extends Number> trả min/max/average. Thử Integer, Long, BigDecimal và ghi rõ precision policy.

