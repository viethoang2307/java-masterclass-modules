# 540 — Sum 3 và 5 Challenge

## Mục tiêu

Tính tổng các số chia hết cho 3 hoặc 5 trong range, không double-count số chia hết cho cả hai.

## Mental model

Điều kiện `n % 3 == 0 || n % 5 == 0` là union. Nếu cộng hai loop riêng phải trừ intersection; một loop predicate rõ hơn.

## Ví dụ Java 17

~~~java
static int sumMultiples(int limit) {
    int sum = 0;
    for (int n = 1; n < limit; n++) {
        if (n % 3 == 0 || n % 5 == 0) sum += n;
    }
    return sum;
}
~~~

## Lỗi thường gặp

- Dùng `&&` thay `||`.
- Dùng `<= limit` sai contract nếu limit exclusive.
- Cộng hai dãy riêng rồi double-count 15.

## Bài tập ngắn

Test limit 10, 16, 0, âm; viết thêm phiên bản long để tránh overflow.

## Interview prompt

Đây là union hay intersection? Làm sao chứng minh không double-count?

## Nguồn

Transcript course lesson 540; ví dụ được chuẩn hóa theo Java 17 và giữ nguyên ý đồ của course.

