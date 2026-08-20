# 498 — Architecture layers và dependency direction

Một cấu trúc thực dụng:

```text
UI/CLI adapter -> application service -> domain
                         |
                         +-> ports <- infrastructure adapters
```

Domain không biết JavaFX, JDBC, HTTP client hoặc filesystem. Application service điều phối use case. Port là interface mô tả capability; adapter hiện thực port ở ngoài.

## Dependency rule

Dependency source code hướng vào abstraction/inner layer. Nếu UI cần database class trực tiếp, boundary đã bị phá. Có thể dùng constructor injection để dependency nhìn thấy ngay trong code và test.

## Không over-engineer

Layer không phải lý do tạo hàng chục interface vô nghĩa. Tạo port khi có boundary thật: I/O, clock, network, randomness hoặc policy thay đổi. Value object/domain service vẫn có thể là class đơn giản.

## Checkpoint

Vẽ dependency graph capstone, đánh dấu nơi được phép dùng `java.sql`, `java.net.http`, JavaFX và `java.time.Clock`.

