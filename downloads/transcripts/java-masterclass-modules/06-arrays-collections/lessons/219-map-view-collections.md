# 219. Map collection views

## Backing view

~~~java
Map<String, Integer> stock = new HashMap<>(Map.of("A", 0, "B", 3));
stock.entrySet().removeIf(entry -> entry.getValue() == 0);
~~~

keySet, values và entrySet liên kết với map gốc. Remove qua view thường remove mapping; add thường không được hỗ trợ. View khác defensive copy.

## Entry mutation

~~~java
for (Map.Entry<String, Integer> entry : stock.entrySet()) {
    entry.setValue(entry.getValue() + 1);
}
~~~

Dùng entrySet khi cần cả key/value. Sửa map trực tiếp trong enhanced loop có thể gây ConcurrentModificationException.

## Bài tập

Loại zero-stock entries, trả snapshot key immutable và test map gốc mutate sau snapshot không ảnh hưởng kết quả.

## Pitfalls

Nghĩ keySet là copy, dùng values khi cần key, và trả view live ra ngoài API.
