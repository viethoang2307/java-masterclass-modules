# 247. Sealed classes và hierarchy có giới hạn

## Cú pháp Java 17

```java
sealed interface Shape permits Circle, Rectangle, Triangle {}
record Circle(double radius) implements Shape {}
record Rectangle(double width, double height) implements Shape {}
record Triangle(double base, double height) implements Shape {}
```

Sealed type công bố rõ subtype được phép. Compiler biết hierarchy đóng và giúp exhaustive switch/analysis tốt hơn.

## Khi dùng sealed

Dùng khi domain có tập loại cố định hoặc team muốn kiểm soát extension. Không dùng khi plugin bên ngoài cần tự thêm subtype; khi đó interface mở phù hợp hơn.

## Invariant

Record không tự reject radius âm; compact constructor phải validate:

```java
record Circle(double radius) implements Shape {
    Circle { if (radius <= 0) throw new IllegalArgumentException("radius"); }
}
```

## Bài tập

Tạo sealed `PaymentResult` gồm `Approved`, `Declined`, `RetryableFailure`; viết formatter exhaustive và test mọi subtype.
