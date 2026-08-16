# Lesson 179 — Nested types overview

## Mục tiêu

Nhận diện static nested, inner member, local và anonymous class; chọn loại theo ownership, lifecycle và readability.

| Loại | Outer instance? | Cú pháp |
|---|---:|---|
| static nested | Không | Outer.Inner |
| inner member | Có | outer.new Inner() |
| local | lexical scope | trong method/block |
| anonymous | object one-off | new Interface() |

~~~java
class Order {
    static class IdGenerator {}
    class LineItem {}
    void validate() {
        class Rule {}
        Runnable task = new Runnable() { public void run() {} };
    }
}
~~~

Static nested phù hợp helper không cần outer. Inner phù hợp object gắn với một outer instance. Local dùng cho helper có scope hẹp. Anonymous dùng khi cần object behavior one-off hoặc abstract class.

Inner có reference ẩn tới outer nên callback/cache sống lâu có thể kéo outer sống theo.

## Bài tập

Refactor cùng một helper thành bốn dạng; ghi rõ ownership và object nào bị capture.

