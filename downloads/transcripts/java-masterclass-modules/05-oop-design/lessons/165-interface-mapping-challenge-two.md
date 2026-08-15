# 165. Interface mapping challenge phần 2

## Composition của mapper

Mapper lớn thường nên compose mapper nhỏ:

```java
final class OrderMapper {
    private final Mapper<LineItem, LineDto> lineMapper;
    OrderDto map(Order order) {
        List<LineDto> lines = order.lines().stream().map(lineMapper::map).toList();
        return new OrderDto(order.id(), lines);
    }
}
```

OrderMapper orchestrates; LineMapper chịu mapping line. Đây là separation of responsibilities và giúp test failure chính xác.

## Không để mapping leak domain

DTO không nên trở thành domain entity thứ hai có behavior nghiệp vụ. Mapping ở boundary, serialization ở adapter, policy ở domain/service phù hợp.

## Capstone checklist

Kiểm tra null contract, defensive copy, ordering deterministic, nested mapping, version compatibility và lỗi không làm mutate source.

## Bài tập

Thêm `AdminUserMapper` và `PublicUserMapper` cùng source nhưng khác field exposure. Consumer chọn mapper qua interface, không `if role` trong mapper chung.
