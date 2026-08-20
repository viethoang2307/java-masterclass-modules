# 501 — OOP: polymorphism và Strategy

Nếu code có `if (type.equals("file")) ... else if ...` lặp lại, đó có thể là nơi cần Strategy.

```java
interface ArtworkFetcher { Artwork fetch(Album album); }

final class LocalFetcher implements ArtworkFetcher { /* ... */ }
final class RemoteFetcher implements ArtworkFetcher { /* ... */ }
```

Application service nhận interface và không cần biết implementation. Factory hoặc service registry chọn strategy theo config. Strategy nên có contract lỗi, timeout và ownership resource rõ.

## Tránh abstraction sớm

Đừng tạo interface cho mọi POJO. Dùng polymorphism khi có behavior thay thế thực sự và test có thể chứng minh hai implementation tuân cùng contract.

## Checkpoint

Chọn import CSV, JSON và remote sync; xác định behavior chung, capability riêng và policy chọn strategy.

