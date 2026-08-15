# 520 — if-then-else Recap

## Mục tiêu

Củng cố cách đặt điều kiện theo boundary và giữ một output path dễ kiểm chứng.

## Mental model

Một decision tree tốt có các range không overlap và không có gap. Nên viết từ rule tổng quát/invalid tới rule cụ thể hoặc ngược lại một cách có chủ ý.

## Ví dụ Java 17

~~~java
static String ageBand(int age) {
    if (age < 0) return "invalid";
    if (age < 13) return "child";
    if (age < 18) return "teen";
    return "adult";
}
~~~

## Lỗi thường gặp

- Cho phép age âm lọt vào nhánh hợp lệ.
- Điều kiện `age <= 13` và `age < 13` bị trùng.
- Không test exact boundary.

## Bài tập ngắn

Tạo decision table cho `ageBand`, rồi triển khai và test `-1, 0, 12, 13, 17, 18`.

## Interview prompt

Boundary-value analysis có tác dụng gì với if/else chain?

## Nguồn

Transcript course lesson 520; ví dụ được chuẩn hóa theo Java 17 và giữ nguyên ý đồ của course.

