# 109. Printer challenge: aggregate có state và policy

## Bài toán

Printer có toner level, pages printed, duplex mode và paper count. Thiết kế sao cho không thể in khi thiếu paper/toner, đồng thời không mutate một phần khi validation fail.

```java
final class Printer {
    private int tonerPercent;
    private int paperSheets;
    private int pagesPrinted;
    Printer(int tonerPercent, int paperSheets) {
        if (tonerPercent < 0 || tonerPercent > 100 || paperSheets < 0)
            throw new IllegalArgumentException("initial state");
        this.tonerPercent = tonerPercent;
        this.paperSheets = paperSheets;
    }
    int printPages(int pages, boolean duplex) {
        if (pages <= 0) throw new IllegalArgumentException("pages");
        int sheets = duplex ? (pages + 1) / 2 : pages;
        if (sheets > paperSheets || pages > tonerPercent)
            throw new IllegalStateException("insufficient resources");
        paperSheets -= sheets; tonerPercent -= pages; pagesPrinted += pages;
        return sheets;
    }
}
```

## Phân tích contract

`pagesPrinted` là metric, `paperSheets` và toner là resource state. Method trả sheets dùng để report; caller không cần biết fields. Production có thể dùng `Math.addExact` nếu counters có nguy cơ overflow.

## Test bắt buộc

Test simple/duplex, pages lẻ, thiếu paper, thiếu toner, input âm và failure giữ nguyên cả ba field. Đây là ví dụ điển hình của encapsulation: invariant nằm trong object.

## Mở rộng

Nếu printer có nhiều paper tray, tạo `PaperSource` component; đừng làm Printer thành class chứa mọi policy unrelated.
