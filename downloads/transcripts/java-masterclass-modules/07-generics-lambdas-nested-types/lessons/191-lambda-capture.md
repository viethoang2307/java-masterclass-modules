# Lesson 191 — Lambda capture và effectively final

## Mục tiêu

Giải thích local capture; phân biệt reference final với object immutable; và tránh shared state trong callback.

~~~java
int limit = 10;
Predicate<Integer> small = value -> value <= limit;
// limit = 20; // không compile
~~~

Compiler lưu giá trị local cần capture. Field thì lambda đọc field của enclosing object tại thời điểm chạy:

~~~java
class Counter {
    private int value;
    Runnable task() { return () -> value++; }
}
~~~

Reference effectively final vẫn có thể trỏ tới mutable object. Dùng holder để lách final thường tạo race và hidden state.

Callback có thể chạy sau method return, nên kiểm tra lifetime của object bị capture.

## Bài tập

Tạo 10 Runnable có id riêng; test capture đúng id và thiết kế counter thread-safe.

