# 129. Tìm minimum không làm hỏng contract

## One-pass algorithm

~~~java
static int min(int[] values) {
    if (values == null || values.length == 0)
        throw new IllegalArgumentException("non-empty values");
    int minimum = values[0];
    for (int i = 1; i < values.length; i++)
        minimum = Math.min(minimum, values[i]);
    return minimum;
}
~~~

Khởi tạo minimum bằng 0 là bug với array toàn dương hoặc toàn âm. Bắt đầu từ phần tử đầu bảo đảm min thuộc input.

## Complexity và alternative

Một traversal O(n), O(1) extra space. Không cần sort vì sort O(n log n) và mutate/copy không cần thiết. Với empty array có thể trả OptionalInt nếu API muốn biểu diễn absence thay vì exception.

## Bài tập

Viết min/max cùng một traversal trả record Stats. Test min ở đầu/cuối, duplicate, negative, overflow sum và null/empty.

## Lỗi thường gặp

Sort chỉ để lấy phần tử đầu, khởi tạo sentinel sai, và quên document empty contract.
