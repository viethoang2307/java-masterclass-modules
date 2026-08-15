# 203. Collections: thuật toán nâng cao

## Mục tiêu

- Dùng `reverse`, `swap`, `replaceAll`, `disjoint` và `addAll`.
- Phân biệt thuật toán sửa dữ liệu và thuật toán truy vấn.

```java
List<String> queue = new ArrayList<>(List.of("A", "B", "C"));
Collections.swap(queue, 0, 2);       // [C, B, A]
Collections.reverse(queue);          // [A, B, C]
Collections.replaceAll(queue, "B", "B2");

boolean separate = Collections.disjoint(
        queue, List.of("X", "Y"));  // true
```

## Phân tích contract

- `reverse`, `swap`, `replaceAll`: mutate list và cần list sửa được.
- `disjoint`: chỉ đọc; trả `true` khi hai collection không có phần tử bằng nhau.
- `Collections.addAll(target, values...)`: tiện khi đầu vào là varargs.

Độ phức tạp phụ thuộc implementation. Chẳng hạn `swap` theo index hiệu quả trên `ArrayList` hơn `LinkedList` ở index xa.

## Lỗi thường gặp

- Thao tác trên `List.of(...)` rồi gặp `UnsupportedOperationException`.
- Quên equality của phần tử quyết định việc replace/disjoint.
- Suy luận Big-O chỉ từ tên method mà bỏ qua collection cụ thể.

## Bài tập ngắn

Biến đổi lịch thi đấu bằng `swap` và `reverse`, sau đó xác minh tập đội không đổi.

## Interview prompt

Một static algorithm có cùng Big-O trên mọi implementation của `List` không?

## Nguồn

- Transcript bài 203.
- Java 17 API: `Collections`.
