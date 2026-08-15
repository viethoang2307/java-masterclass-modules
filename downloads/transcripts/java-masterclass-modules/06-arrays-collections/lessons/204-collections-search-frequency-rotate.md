# 204. Search, frequency và rotate

## Mục tiêu

- Dùng `binarySearch`, `frequency`, `indexOfSubList` và `rotate`.
- Tôn trọng precondition về ordering.

```java
List<Integer> numbers = new ArrayList<>(List.of(1, 2, 2, 3, 5, 8));
int position = Collections.binarySearch(numbers, 5);
int count = Collections.frequency(numbers, 2);
Collections.rotate(numbers, 2);
```

`binarySearch` chỉ đáng tin khi list đã sort theo cùng ordering/comparator. Nếu không tìm thấy, kết quả âm mã hóa insertion point: `-(insertionPoint) - 1`.

```java
int raw = Collections.binarySearch(List.of(1, 3, 7), 5);
int insertionPoint = -raw - 1; // 2
```

## Điểm cần nhớ

- `frequency` dùng `equals`, không dùng identity.
- `rotate` sửa list tại chỗ; khoảng cách âm quay trái.
- `indexOfSubList` tìm chuỗi con liên tiếp, không phải subset.

## Bài tập ngắn

Tìm vị trí chèn một score vào leaderboard đã sort mà không phá ordering.

## Interview prompt

Kết quả âm của `binarySearch` cung cấp thêm thông tin gì?

## Nguồn

- Transcript bài 204.
- Java 17 API: `Collections.binarySearch`, `frequency`, `rotate`.
