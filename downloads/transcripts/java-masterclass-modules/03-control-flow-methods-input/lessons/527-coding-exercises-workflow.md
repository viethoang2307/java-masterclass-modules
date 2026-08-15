# 527 — Coding Exercises — Workflow

## Mục tiêu

Áp dụng vòng lặp làm bài: đọc contract, viết pseudocode, implement nhỏ, compile, test boundary, refactor.

## Mental model

Exercise nên tách input/calculation/output khi có thể. Mỗi lần thay đổi nhỏ giữ chương trình ở trạng thái compile được để giảm debugging surface.

## Ví dụ Java 17

~~~java
static int sumEven(int from, int to) {
    int total = 0;
    for (int n = from; n <= to; n++) {
        if (n % 2 == 0) total += n;
    }
    return total;
}
~~~

## Lỗi thường gặp

- Code ngay không ghi contract.
- Chỉ test happy path.
- Sửa nhiều thứ cùng lúc khiến diff khó review.

## Bài tập ngắn

Dùng workflow 6 bước cho một challenge bất kỳ và lưu lại test table.

## Interview prompt

Pseudocode giúp ích gì khi bài có nhiều branch và loop?

## Nguồn

Transcript course lesson 527; ví dụ được chuẩn hóa theo Java 17 và giữ nguyên ý đồ của course.

