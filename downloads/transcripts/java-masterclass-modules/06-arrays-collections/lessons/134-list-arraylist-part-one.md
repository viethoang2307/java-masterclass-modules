# 134. List và ArrayList phần 1

## List contract

List là sequence có index, giữ insertion order và cho phép duplicate. ArrayList dùng backing array resize khi cần.

~~~java
List<String> cities = new ArrayList<>();
cities.add("Hue");
cities.add(0, "Hanoi");
cities.set(1, "Da Nang");
String first = cities.get(0);
~~~

add cuối thường amortized O(1); get/set O(1); chèn/xóa giữa O(n) vì phải shift elements. size() là số phần tử hiện tại, không phải capacity.

## Mutation và immutable list

~~~java
List<String> fixed = List.of("A", "B");
fixed.add("C"); // UnsupportedOperationException
~~~

Nếu cần mutable copy: new ArrayList<>(fixed). Document rõ method trả view hay snapshot.

## Bài tập

Implement grocery list add/remove/find không phân biệt case, test duplicate policy và empty index. Đoán exception khi get index ngoài range trước khi chạy.

## Pitfalls

Nhầm add(index,value) với set, dùng index loop khi remove làm skip element, và sửa List.of.
