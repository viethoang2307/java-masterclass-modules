# 534 — Bonus Challenge Solution

## Mục tiêu

Đọc một reference solution như reviewer: kiểm tra contract, boundary, naming và khả năng tái sử dụng.

## Mental model

Solution tốt không chỉ pass example; nó nêu behavior ở invalid input và tránh magic number bằng constant hoặc helper khi cần.

## Ví dụ Java 17

~~~java
static String duration(int minutes, int seconds) {
    if (minutes < 0 || seconds < 0 || seconds > 59) {
        return "Invalid value";
    }
    return minutes + "m " + seconds + "s";
}
~~~

## Lỗi thường gặp

- Chỉ copy code mà không hiểu precondition.
- Cho phép seconds >= 60 làm output không chuẩn hóa.
- Không test overload cùng behavior.

## Bài tập ngắn

Viết review note cho solution duration: 3 điểm tốt, 3 rủi ro, 4 test regression.

## Interview prompt

Reference solution nên khác starter code ở những điểm nào?

## Nguồn

Transcript course lesson 534; ví dụ được chuẩn hóa theo Java 17 và giữ nguyên ý đồ của course.

