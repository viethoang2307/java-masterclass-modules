# Lesson 251 — First Stream Example

## Mục tiêu

Xây pipeline rõ ràng từ source, intermediate operation và terminal operation.

## Mental model

Mỗi stage nhận một stream mới về mặt API. filter giữ phần tử, map đổi shape, count/collect kết thúc traversal.

## Ví dụ Java 17

~~~java
List<String> names = List.of("An", "Binh", "Chi");
List<String> result = names.stream()
    .filter(name -> name.length() >= 3)
    .map(String::toUpperCase)
    .toList();
System.out.println(result);
~~~

## Phân tích

toList trong Java 16+ trả unmodifiable list. Nếu cần mutable result, dùng Collectors.toCollection(ArrayList::new).

## Complexity và contract

O(n) time; result list dùng O(k) space.

Stream là single-use; mọi null policy, ordering, duplicate policy và exception boundary phải được ghi rõ thay vì để mặc định ngầm.

## Lỗi thường gặp

- Gọi terminal operation hai lần trên cùng stream.
- Dùng side effect trong filter/map hoặc dựa vào thứ tự không được contract.
- Dùng reduce cho mutable accumulation khi collector diễn đạt rõ hơn.
- Quên empty result được biểu diễn bởi Optional hoặc collection rỗng.

## Bài tập

Thêm rule trim, loại null và giữ thứ tự. Dự đoán output trước khi chạy.

