# Lesson 184 — Anonymous classes

## Mục tiêu

Hiểu anonymous class là declaration + instance expression; phân biệt với lambda; và chọn callback phù hợp.

~~~java
Comparator<String> byLength = new Comparator<>() {
    private int comparisons;
    public int compare(String a, String b) {
        comparisons++;
        return Integer.compare(a.length(), b.length());
    }
};
~~~

Anonymous class có field/state, nhiều method và có thể implement abstract class. Lambda phù hợp functional interface khi chỉ cần behavior.

Trong anonymous class, this trỏ tới object anonymous. Trong lambda, this trỏ tới enclosing object. Đây là khác biệt quan trọng khi callback gọi member.

Dùng anonymous khi cần nhiều method/state, abstract class hoặc code one-off phức tạp. Nếu một method đơn giản, lambda thường rõ hơn.

## Lỗi thường gặp

Nhầm overload, capture outer mutable state, tạo anonymous class cho logic cần test/reuse.

## Bài tập

Viết RetryPolicy bằng anonymous class có attempts/backoff; refactor behavior thuần sang lambda và so sánh.

