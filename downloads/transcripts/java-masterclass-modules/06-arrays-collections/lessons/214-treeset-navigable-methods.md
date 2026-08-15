# 214. `TreeSet` và các method điều hướng

## Mục tiêu

- Dùng `lower`, `floor`, `ceiling`, `higher` chính xác.
- Tạo range view bằng `headSet`, `tailSet`, `subSet`.

```java
NavigableSet<Integer> seats = new TreeSet<>(List.of(10, 20, 30, 40));
int floor = seats.floor(25);      // 20
int ceiling = seats.ceiling(25);  // 30
Integer lower = seats.lower(20);  // 10
Integer higher = seats.higher(20);// 30
```

`floor`/`ceiling` có thể trả chính phần tử bằng target; `lower`/`higher` luôn strict. Method trả `null` nếu không có ứng viên.

```java
NavigableSet<Integer> mid = seats.subSet(20, true, 40, false);
```

Range trả về thường là view liên kết với set gốc. Sửa view có thể sửa backing set; thêm phần tử ngoài range sẽ lỗi.

## Lỗi thường gặp

- Auto-unbox `null` từ navigation method gây `NullPointerException`.
- Nhầm inclusive/exclusive endpoints.
- Trả mutable view ra ngoài API.

## Bài tập ngắn

Tìm ghế gần nhất không vượt quá khoảng cách cho phép, có xử lý trường hợp không còn ghế.

## Interview prompt

Khác biệt semantic giữa `floor` và `lower` là gì?

## Nguồn

- Transcript bài 214.
- Java 17 API: `NavigableSet`, `TreeSet`.
