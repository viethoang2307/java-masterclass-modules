# Lesson 182 — Enclosing instance và shadowing

## Mục tiêu

Đọc code nhiều scope; phân biệt parameter, this và Outer.this; hiểu captured reference không phải captured mutable slot.

~~~java
class Report {
    private String title = "outer";
    class Section {
        private String title = "inner";
        void print(String title) {
            System.out.println(title);
            System.out.println(this.title);
            System.out.println(Report.this.title);
        }
    }
}
~~~

Lambda/local/inner class có thể capture local effectively final. Reference không đổi không có nghĩa object immutable.

~~~java
List<String> values = new ArrayList<>();
Runnable task = () -> values.add("x");
~~~

Nên tránh mutable holder chỉ để lách effectively final; nó tạo hidden shared state và race condition.

## Lỗi thường gặp

Nhầm Outer.this với static, gán lại local đã capture, và quên callback có thể chạy sau method return.

## Bài tập

Tạo OuterCounter với inner command ghi log trước/sau increment; test command giữ đúng outer instance.

