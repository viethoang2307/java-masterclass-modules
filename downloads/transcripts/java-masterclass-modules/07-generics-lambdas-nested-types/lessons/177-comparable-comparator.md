# Lesson 177 — Comparable và Comparator

## Mục tiêu

Chọn natural ordering hay external ordering; giữ comparator contract; và xử lý tie-breaker ổn định.

## Comparable

~~~java
record Student(String id, String name, int score)
        implements Comparable<Student> {
    public int compareTo(Student other) {
        int byScore = Integer.compare(other.score(), score());
        return byScore != 0 ? byScore : id.compareTo(other.id());
    }
}
~~~

Dùng Integer.compare thay vì trừ số để tránh overflow. compareTo chỉ cần trả âm, zero hoặc dương.

## Comparator

~~~java
Comparator<Student> byNameThenScore =
    Comparator.comparing(Student::name)
              .thenComparingInt(Student::score)
              .thenComparing(Student::id);
~~~

Comparator.nullsFirst/nullsLast làm null policy rõ ràng.

TreeSet/TreeMap dùng compare == 0 để quyết định trùng theo ordering, có thể khác equals. Đó là lý do cần tie-breaker nếu identity phải được giữ.

## Lỗi thường gặp

Comparator không transitive, chỉ so sánh một field, dùng subtract và nhầm compareTo với equals.

## Bài tập

Tạo ranking score giảm, completion time tăng, id tăng. Test tie cases và kiểm tra TreeSet không mất student.

