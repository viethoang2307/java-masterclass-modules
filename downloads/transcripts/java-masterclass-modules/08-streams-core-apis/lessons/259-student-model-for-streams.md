# Lesson 259 — Student Model cho Stream Processing

## Mục tiêu

Thiết kế record/domain model có field đủ để aggregation và không làm stream che mất domain rule.

## Mental model

Một stream challenge tốt bắt đầu từ model rõ: id, name, percentage, engagement, courses. Record tạo value semantics nhưng collection bên trong vẫn cần copy.

## Ví dụ Java 17

~~~java
record Student(String id, String name, double percent, int engagement,
               List<String> courses) {
    Student { courses = List.copyOf(courses); }
}
~~~

## Phân tích

Không để model mutable list làm sai kết quả giữa các lần stream. Validate percent/range ở boundary.

## Complexity và contract

Model construction O(number of courses); stream operation complexity phụ thuộc pipeline.

Stream là single-use; mọi null policy, ordering, duplicate policy và exception boundary phải được ghi rõ thay vì để mặc định ngầm.

## Lỗi thường gặp

- Gọi terminal operation hai lần trên cùng stream.
- Dùng side effect trong filter/map hoặc dựa vào thứ tự không được contract.
- Dùng reduce cho mutable accumulation khi collector diễn đạt rõ hơn.
- Quên empty result được biểu diễn bởi Optional hoặc collection rỗng.

## Bài tập

Tạo Student record và viết validation cho percent 0–100, engagement không âm, courses không null.

