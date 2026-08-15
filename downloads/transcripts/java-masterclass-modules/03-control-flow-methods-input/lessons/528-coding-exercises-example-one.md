# 528 — Coding Exercise Example — Phần 1

## Mục tiêu

Chuyển đề bài thành contract và skeleton method trước khi điền logic.

## Mental model

Bắt đầu từ signature có type rõ ràng. Nếu chưa biết algorithm, viết examples nhỏ rồi suy ra invariant.

## Ví dụ Java 17

~~~java
static boolean isPrime(int number) {
    if (number < 2) return false;
    for (int divisor = 2; divisor * divisor <= number; divisor++) {
        if (number % divisor == 0) return false;
    }
    return true;
}
~~~

## Lỗi thường gặp

- Không xử lý số nhỏ hơn 2.
- Loop tới number thay vì sqrt khiến chậm không cần thiết.
- Dùng `divisor * divisor` có thể overflow với input cực lớn.

## Bài tập ngắn

Viết contract cho `isPrime`, gồm input range, output và complexity; thêm 8 test cases.

## Interview prompt

Tại sao invariant 'chưa tìm thấy divisor' hữu ích?

## Nguồn

Transcript course lesson 528; ví dụ được chuẩn hóa theo Java 17 và giữ nguyên ý đồ của course.

