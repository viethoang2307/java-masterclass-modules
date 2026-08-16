# 217. Map interface

## Key/value contract

~~~java
Map<String, Integer> stock = new HashMap<>();
Integer previous = stock.put("JAVA-17", 10);
int quantity = stock.getOrDefault("JAVA-21", 0);
boolean known = stock.containsKey("JAVA-17");
~~~

put thay value nếu key đã tồn tại và trả value cũ. get trả null có thể nghĩa key vắng hoặc value null; containsKey phân biệt hai trường hợp.

## Views

keySet là tập key, values là collection có thể duplicate, entrySet là cặp key/value. Khi cần cả key và value, duyệt entrySet tránh lookup lại.

## Key design

Key nên immutable, equality/hashCode ổn định và normalized ở boundary. Map không guarantee ordering trừ implementation cụ thể.

## Bài tập

Xây phone book normalize key, xử lý duplicate explicit, test null policy và snapshot keys.

## Pitfalls

Dùng get null làm kiểm tra duy nhất, mutable key, và dựa vào order HashMap.
