# 209. `HashSet` nhập môn

## Mục tiêu

- Dùng `HashSet` để duy trì uniqueness.
- Hiểu ordering và return value của mutation.

```java
Set<String> usernames = new HashSet<>();
boolean first = usernames.add("linh");   // true
boolean again = usernames.add("linh");  // false
boolean removed = usernames.remove("linh");
```

`HashSet` không bảo đảm insertion order hay sorted order. Nếu output cần thứ tự, sort khi presentation hoặc chọn implementation phù hợp.

## Đặc tính

- Unique theo `equals`/`hashCode`.
- Average `add`, `contains`, `remove`: O(1).
- Cho phép tối đa một `null`, nhưng domain code thường nên tránh.
- Iterator là fail-fast theo best effort khi collection bị sửa ngoài iterator.

## Lỗi thường gặp

- Viết test phụ thuộc iteration order.
- Bỏ qua boolean trả về của `add`/`remove`.
- Dùng object mutable làm phần tử khi equality dựa trên state mutable.

## Bài tập ngắn

Tạo tập mã coupon đã dùng và báo rõ thao tác redeem thành công hay bị trùng.

## Interview prompt

`HashSet` khác `ArrayList` ở invariant nào quan trọng nhất?

## Nguồn

- Transcript bài 209.
- Java 17 API: `HashSet`.
