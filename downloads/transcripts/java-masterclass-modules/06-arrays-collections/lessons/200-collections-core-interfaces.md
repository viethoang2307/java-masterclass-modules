# 200. Các interface cốt lõi của Collections

## Mục tiêu

- Đọc hierarchy `Iterable → Collection → List/Set/Queue`.
- Lập trình theo interface thay vì concrete implementation.

## Hợp đồng chung

`Collection<E>` cung cấp `add`, `remove`, `contains`, `size`, `isEmpty`, `clear`, bulk operations và iteration. Một implementation có thể không hỗ trợ mutation và ném `UnsupportedOperationException`.

```java
Collection<String> names = new ArrayList<>();
names.addAll(List.of("An", "Bình", "Chi"));
names.removeIf(name -> name.length() < 3);
```

Khai báo theo interface giúp thay implementation mà ít ảnh hưởng code gọi:

```java
List<Integer> scores = new ArrayList<>();
// Có thể đổi thành LinkedList nếu workload thay đổi.
```

## Điểm cần nhớ

- Generic bảo vệ type ở compile time.
- `contains` và `remove(Object)` dựa vào `equals`.
- Không giả định mọi collection đều có index hoặc giữ insertion order.
- `List.of` tạo list không sửa được và không nhận `null`.

## Bài tập ngắn

Viết method nhận `Collection<Integer>` và trả tổng phần tử dương mà không phụ thuộc implementation.

## Interview prompt

Lợi ích và giới hạn của “program to an interface” là gì?

## Nguồn

- Transcript bài 200.
- Java 17 API: `Iterable`, `Collection`, `List`, `Set`, `Queue`.
