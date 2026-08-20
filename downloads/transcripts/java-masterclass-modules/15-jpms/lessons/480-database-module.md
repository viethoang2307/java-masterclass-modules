# 480 — Database module và dependency resolution

Database module thường phụ thuộc common và JDBC. Descriptor ví dụ:

```java
module com.acme.database {
    requires com.acme.common;
    requires java.sql;
    exports com.acme.database.api;
}
```

Driver JDBC có thể là automatic module hoặc vẫn chạy trên classpath tùy vendor. Hãy xác định tên module thực tế bằng:

```powershell
jar --describe-module --file libs/driver.jar
```

## Ranh giới

Database API trả về domain type hoặc DTO ổn định, không đẩy `ResultSet` ra UI. Connection lifecycle, SQL exception và transaction policy nằm trong implementation.

## Diagnostic flow

1. Compile common.
2. Compile database với `--module-path mods;libs`.
3. Kiểm tra `requires java.sql`.
4. Chạy smoke test mở connection.
5. Nếu driver không resolve, phân biệt thiếu module path với thiếu service provider.

## Điểm cần nhớ

JPMS quản lý readability, không tự quản lý database URL, credential hay migration schema. Các concern runtime đó vẫn phải có config và observability riêng.

