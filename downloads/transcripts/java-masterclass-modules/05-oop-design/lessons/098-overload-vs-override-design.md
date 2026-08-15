# 098. Overload và override: compile-time so với runtime

## Overload

Compiler chọn overload dựa trên static type và argument compile-time:

```java
void send(String value) { System.out.println("text"); }
void send(Object value) { System.out.println("object"); }
Object value = "java";
send(value); // object
```

## Override

Runtime type quyết định implementation khi subtype override cùng signature:

```java
Worker worker = new HourlyWorker(...);
worker.calculatePayCents(); // HourlyWorker implementation
```

Luôn dùng `@Override`; annotation giúp compiler bắt typo hoặc signature sai. Override không được giảm visibility, return type chỉ được covariant, và checked exception không được rộng hơn contract base. Static method bị hide, không polymorphic.

## Debugging recipe

Khi output bất ngờ, ghi ra static type, runtime type, signature candidate sau overload resolution và xem method có `static`, `final` hay `private` không.

## Bài tập

Tạo `render(Object)`, `render(String)` và subclass override `render(Object)`. Dự đoán sáu lời gọi trước khi chạy rồi giải thích.

## Lỗi thường gặp

- Đổi parameter list rồi tưởng đã override.
- Bỏ `@Override`.
- Dùng overload để mô phỏng polymorphism runtime.
