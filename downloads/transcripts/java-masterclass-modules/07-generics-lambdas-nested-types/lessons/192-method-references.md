# Lesson 192 — Method references

## Mục tiêu

Đọc bốn dạng method reference; xử lý target typing và overload; chọn reference khi nó làm data flow rõ hơn.

~~~java
String::length
System.out::println
Integer::parseInt
ArrayList::new
~~~

Ví dụ:

~~~java
Function<String, Integer> length = String::length;
Consumer<String> print = System.out::println;
Function<String, Integer> parse = Integer::parseInt;
Supplier<List<String>> list = ArrayList::new;
~~~

String::length là unbound instance method, tương đương value -> value.length(). System.out::println là bound receiver. Constructor reference chưa tạo object cho tới khi get/apply.

Overload có thể mơ hồ; gán target type hoặc dùng lambda để nói rõ conversion.

## Bài tập

Refactor pipeline lambda sang method reference, ghi lại nơi lambda dễ đọc hơn.

