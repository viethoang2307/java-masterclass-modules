# 099. Text blocks: presentation là responsibility riêng

## Cú pháp Java 17

```java
String receipt = """
        RECEIPT
        --------
        Item: Java Book
        Total: 12.50 USD
        """;
```

Java xử lý incidental indentation, nhưng newline đầu/cuối và trailing spaces vẫn là phần cần test nếu output là contract.

## Tách model khỏi format

Model trả data; formatter tạo text. Không để `Order` biết console width, ANSI color hay locale hiện tại.

```java
record ReceiptLine(String name, long cents) {}

final class ReceiptFormatter {
    String format(List<ReceiptLine> lines) {
        StringBuilder out = new StringBuilder("RECEIPT\n");
        for (ReceiptLine line : lines)
            out.append(line.name()).append(':').append(line.cents()).append('\n');
        return out.toString();
    }
}
```

Text block hợp với template tĩnh; `StringBuilder`/formatter hợp với list động. Output formatter nên pure để self-check deterministic.

## Bài tập và pitfalls

Viết formatter receipt có exact output, test empty/một/nhiều item và Unicode. Đừng so output bằng mắt, đừng nhúng business calculation vào text block, và đừng dùng text block làm JSON/SQL nếu chưa xử lý escaping.
