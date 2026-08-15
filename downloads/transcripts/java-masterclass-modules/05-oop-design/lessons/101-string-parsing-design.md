# 101. String parsing: từ text tới domain object

## Parsing và validation

Parsing trả lời text có cấu trúc gì; validation trả lời giá trị có được domain cho phép không. Tách hai ý giúp error rõ:

```java
record Coordinate(int x, int y) {}

static Coordinate parse(String text) {
    if (text == null) throw new IllegalArgumentException("null coordinate");
    String[] parts = text.strip().split(",", -1);
    if (parts.length != 2) throw new IllegalArgumentException("expected x,y");
    try {
        return new Coordinate(Integer.parseInt(parts[0].strip()),
                              Integer.parseInt(parts[1].strip()));
    } catch (NumberFormatException ex) {
        throw new IllegalArgumentException("invalid integer", ex);
    }
}
```

`split(..., -1)` giữ empty trailing field. Không nuốt exception rồi trả zero/null giả; lỗi nên chỉ ra field/index mà không log secret.

## Khi regex phù hợp

Regex tốt cho token pattern đơn giản. Format có quoting, escape hoặc nested delimiter nên dùng parser state machine thay vì regex khổng lồ.

## Bài tập

Parse `sku=J17;qty=3`, reject duplicate key, missing field, quantity âm và delimiter trong value. Test whitespace và Unicode.
