# 210. Phép toán tập hợp

## Mục tiêu

- Thực hiện union, intersection, difference và subset.
- Tránh vô tình sửa tập nguồn.

```java
Set<String> a = Set.of("java", "sql", "git");
Set<String> b = Set.of("java", "docker");

Set<String> union = new HashSet<>(a);
union.addAll(b);

Set<String> intersection = new HashSet<>(a);
intersection.retainAll(b);

Set<String> difference = new HashSet<>(a);
difference.removeAll(b);
```

`a.containsAll(b)` kiểm tra `b ⊆ a`. Bulk operations mutate receiver, vì vậy tạo working copy khi muốn bảo toàn input.

## Ứng dụng

- Permission effective/required/missing.
- Tag chung giữa hai sản phẩm.
- Thành viên tham dự nhiều sự kiện.
- Đồng bộ dữ liệu hai nguồn.

## Lỗi thường gặp

- Gọi `retainAll` trực tiếp trên tập cần giữ nguyên.
- Nhầm `removeAll` theo chiều A\B và B\A.
- Dùng set khi số lần xuất hiện là thông tin quan trọng.

## Bài tập ngắn

Tính quyền còn thiếu và quyền dư giữa requested permissions với granted permissions.

## Interview prompt

Làm sao biểu diễn symmetric difference bằng các bulk operation?

## Nguồn

- Transcript bài 210.
- Java 17 API: `Set`, `Collection` bulk operations.
