# 160. Interface constants và type conversion

## Constants

Field trong interface mặc định là `public static final`. Dùng cho constant thật sự thuộc contract, không dùng interface như namespace tiện lợi:

```java
interface HttpStatus {
    int OK = 200;
    int BAD_REQUEST = 400;
}
```

Nếu constant thuộc một domain type, enum hoặc utility class thường rõ hơn.

## Conversion và capability

Interface reference có thể upcast object implementer:

```java
Exportable exportable = new CsvExporter();
```

Downcast để lấy API đặc thù nên hiếm. Nếu consumer cần method đó, thêm capability interface hoặc đổi contract.

## Bài tập

Audit một interface đang chứa 20 constants và nhiều static helper. Tách enum, utility và capability; viết lý do cho từng move.
