# 209. HashSet nhập môn

## Uniqueness

~~~java
Set<String> usernames = new HashSet<>();
boolean first = usernames.add("linh");  // true
boolean again = usernames.add("linh"); // false
boolean removed = usernames.remove("linh");
~~~

HashSet xác định trùng bằng equals/hashCode. Nó không bảo đảm insertion order hay sorted order. Nếu output cần thứ tự, sort ở presentation hoặc chọn implementation phù hợp.

## Complexity và mutation

Average add/contains/remove O(1). HashSet có thể chứa tối đa một null, nhưng domain code thường tránh null. Iterator fail-fast theo best effort khi collection bị sửa ngoài iterator.

## Bài tập

Tạo tập coupon đã dùng và báo redeem success/duplicate. Test value object equality, mutable element và iteration order không deterministic.

## Pitfalls

Viết test phụ thuộc order, bỏ qua boolean của add/remove, và dùng object mutable làm phần tử.
