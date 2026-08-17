# Lesson 181 — Inner member classes

## Mục tiêu

Hiểu inner class giữ outer instance; dùng cú pháp tạo đúng; và phân biệt view động với snapshot copy.

~~~java
class Counter {
    private int value;
    class Snapshot {
        int value() { return Counter.this.value; }
    }
    Snapshot snapshot() { return new Snapshot(); }
}
Counter c = new Counter();
Counter.Snapshot s = c.new Snapshot();
~~~

Snapshot trên là view: nếu Counter thay đổi, value có thể thay đổi. Snapshot copy cần field final được chụp tại constructor.

Inner class không tự đảm bảo thread safety. Nếu inner object được giữ trong executor, cache hay listener, kiểm tra lifetime và visibility.

## Lỗi thường gặp

Gọi new Outer.Inner như static; nhầm view với copy; expose public inner class dù lifecycle phức tạp; quên concurrency.

## Bài tập

Viết Cart và Cart.LineItem; line item thuộc đúng cart, có total() và test khi cart thay đổi.

