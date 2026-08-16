# 199. Collections Framework: bức tranh tổng thể

## Interface trước implementation

Collection Framework tách contract khỏi implementation. List giữ thứ tự và cho duplicate; Set biểu diễn uniqueness; Queue mô hình hóa processing; Map lưu mapping key/value và không extends Collection.

~~~java
List<String> playlist = new ArrayList<>();
Set<String> usernames = new HashSet<>();
Map<String, Integer> stock = new HashMap<>();
~~~

Khai báo theo interface giúp thay ArrayList bằng LinkedList hoặc HashSet bằng LinkedHashSet mà consumer ít đổi.

## Chọn theo operation

Hỏi operation chính trước: index/random access, append/remove đầu, uniqueness, sorted/range, lookup key hay insertion order. Đừng chọn collection vì tên quen thuộc.

## Contract cần đọc

Ordering, duplicate, null support, mutation, fail-fast behavior và complexity khác nhau giữa implementation. List.of là immutable; HashMap không hứa iteration order; TreeSet dùng comparator để xác định order và uniqueness.

## Bài tập

Chọn cấu trúc cho playlist, username unique, print queue, inventory và leaderboard. Với mỗi lựa chọn, ghi invariant, operation chính, Big-O và output ordering.

## Checkpoint

Bạn phải giải thích vì sao Map không extends Collection và khi nào sorting ở presentation đủ thay cho TreeSet.
