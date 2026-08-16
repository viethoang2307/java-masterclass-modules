# 204. Search, frequency và rotate

## Binary search

~~~java
List<Integer> numbers = new ArrayList<>(List.of(1, 2, 2, 3, 5, 8));
int position = Collections.binarySearch(numbers, 5);
~~~

List phải sort theo cùng ordering. Kết quả âm mã hóa insertion point bằng -(point) - 1.

## Frequency và sublist

Collections.frequency dùng equals để đếm. indexOfSubList tìm chuỗi con liên tiếp, không phải subset. rotate sửa list tại chỗ; khoảng cách âm quay trái.

~~~java
int count = Collections.frequency(numbers, 2);
Collections.rotate(numbers, 2);
~~~

## Bài tập

Tìm vị trí chèn score vào leaderboard, test duplicate và target không có. Viết report trước/sau rotate để thấy view/state thay đổi.

## Pitfalls

Binary search list chưa sort, đọc kết quả âm như index và quên rotate mutate input.
