# 214. TreeSet và navigation

## floor, ceiling, lower, higher

~~~java
NavigableSet<Integer> seats = new TreeSet<>(List.of(10, 20, 30, 40));
int floor = seats.floor(25);      // 20
int ceiling = seats.ceiling(25);  // 30
Integer lower = seats.lower(20);  // 10
Integer higher = seats.higher(20);// 30
~~~

floor/ceiling cho phép bằng target; lower/higher strict. Method có thể trả null nếu không có ứng viên, nên tránh auto-unbox mù.

## Range views

subSet/headSet/tailSet thường là backed view; sửa view có thể sửa set gốc. Dùng copy nếu trả ra ngoài API.

## Bài tập

Tìm seat gần nhất không vượt quá budget hoặc seat đầu tiên từ vị trí requested. Test boundary, empty set, inclusive/exclusive range và null result.

## Pitfalls

Nhầm floor với lower, endpoint sai, và trả mutable range view.
