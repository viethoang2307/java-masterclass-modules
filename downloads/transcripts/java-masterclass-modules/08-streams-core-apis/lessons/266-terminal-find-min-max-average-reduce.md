# Lesson 266 — Terminal Operations: find/min/max/average/reduce

## Mục tiêu

Chọn terminal theo câu hỏi: tồn tại, phần tử cực trị, thống kê hay fold.

## Mental model

findFirst tôn trọng encounter order; findAny có thể linh hoạt hơn trong parallel. min/max cần comparator; average dùng primitive stream.

## Ví dụ Java 17

~~~java
Optional<Student> first = students.stream().filter(Student::active).findFirst();
OptionalDouble avg = values.stream().mapToInt(Integer::intValue).average();
~~~

## Phân tích

Optional empty là trạng thái hợp lệ cần xử lý. Không gọi get tùy tiện. min/max comparator phải ổn định.

## Complexity và contract

Các terminal scan thường O(n), short-circuit có thể dừng sớm.

Stream là single-use; mọi null policy, ordering, duplicate policy và exception boundary phải được ghi rõ thay vì để mặc định ngầm.

## Lỗi thường gặp

- Gọi terminal operation hai lần trên cùng stream.
- Dùng side effect trong filter/map hoặc dựa vào thứ tự không được contract.
- Dùng reduce cho mutable accumulation khi collector diễn đạt rõ hơn.
- Quên empty result được biểu diễn bởi Optional hoặc collection rỗng.

## Bài tập

Viết analytics API trả Optional/OptionalInt/summary; test empty và nhiều tie.

