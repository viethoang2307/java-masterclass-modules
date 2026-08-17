# Lesson 520 — Wrapper Classes, boxing và unboxing

## Mục tiêu

Dùng Integer, Long, Double, Boolean và Character đúng; hiểu boxing cache, null unboxing, parsing và lý do Generic cần wrapper.

## Primitive và wrapper

int là value primitive; Integer là object reference. List<int> không tồn tại, nên Generic dùng List<Integer>.

~~~java
List<Integer> values = new ArrayList<>();
values.add(10);       // boxing
int first = values.get(0); // unboxing
~~~

## equals và identity

Không dùng == để so sánh wrapper value. Một số wrapper có cache nhưng cache không phải contract để dựa vào.

~~~java
Integer a = 127;
Integer b = 127;
Integer c = 1000;
boolean valueEqual = a.equals(b);
~~~

Dùng parseInt khi cần primitive và valueOf khi cần object.

## Null hazard

~~~java
Integer count = null;
// int value = count; // NullPointerException khi unbox
~~~

Validate null hoặc dùng default policy trước khi unbox. Trong stream/collection lớn, cân nhắc IntStream để tránh boxing khi phù hợp.

## Numeric policy

Không dùng Double cho tiền chỉ vì nó là wrapper. Dùng BigDecimal từ String và ghi rõ scale/rounding.

## Bài tập

Viết parser trả Optional<Integer>, audit một List<Integer> có null, so sánh boxing với IntStream và test cache không được dùng làm equality contract.
