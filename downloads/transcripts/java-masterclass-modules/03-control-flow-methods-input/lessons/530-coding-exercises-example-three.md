# 530 — Coding Exercise Example — Phần 3

## Mục tiêu

Refactor solution sau khi đúng để tách helper, giảm duplication và làm contract rõ hơn.

## Mental model

Correctness trước, refactor sau. Helper private/static nên có tên diễn tả predicate hoặc transformation, không che giấu side effect.

## Ví dụ Java 17

~~~java
static int sumDigits(int number) {
    long value = Math.abs((long) number);
    int sum = 0;
    do {
        sum += (int) (value % 10);
        value /= 10;
    } while (value > 0);
    return sum;
}
~~~

## Lỗi thường gặp

- Dùng while khiến input zero trả 0 digit sum thay vì 0 là đúng nhưng thiếu chủ ý.
- Quên cast/range khi đổi long về int.
- Refactor làm thay đổi behavior mà không chạy regression.

## Bài tập ngắn

Viết trước test cho 0, 123, -123 và MIN_VALUE; sau đó tách helper lấy absolute magnitude.

## Interview prompt

Khi nào do-while diễn đạt contract tốt hơn while?

## Nguồn

Transcript course lesson 530; ví dụ được chuẩn hóa theo Java 17 và giữ nguyên ý đồ của course.

