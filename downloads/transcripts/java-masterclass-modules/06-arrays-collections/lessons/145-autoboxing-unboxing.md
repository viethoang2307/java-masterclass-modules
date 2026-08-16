# 145. Autoboxing và unboxing

## Chuyển đổi

~~~java
Integer boxed = 42; // boxing
int primitive = boxed; // unboxing
~~~

Collections generic nhận reference type nên List<Integer> cần boxing. Unboxing null ném NullPointerException.

~~~java
Integer missing = null;
// int value = missing; // lỗi runtime khi unbox
~~~

## Equality và cache

Không dùng == để so Integer vì wrapper caching khiến kết quả phụ thuộc giá trị/implementation. Dùng equals hoặc Objects.equals.

## Performance

Boxing tạo object/GC overhead trong loop lớn. Khi cần numeric hot path, primitive array hoặc specialized structure có thể phù hợp hơn.

## Bài tập

Viết sum(List<Integer>) null policy rõ, test null element, empty list, Integer lớn và overflow. So sánh với sum(int[]).

## Pitfalls

Unbox null, so wrapper bằng ==, và quên overflow khi đổi primitive.
