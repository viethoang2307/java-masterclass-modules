# Lesson 168 — Type parameters và type inference

## Mục tiêu

Theo dõi cách compiler suy luận type argument; hiểu target typing; và xử lý diamond, lambda, method reference khi inference không đủ thông tin.

## Diamond

~~~java
Map<String, List<Integer>> index = new HashMap<>();
var names = new ArrayList<String>();
~~~

Diamond lấy context từ assignment hoặc argument. var suy luận kiểu tĩnh cụ thể từ initializer, không biến code thành dynamic typing.

## Method inference

~~~java
static <T> T choose(T first, T second) { return first; }
var number = choose(1, 2L); // thường suy luận kiểu chung phù hợp
~~~

Khi nhiều bound hoặc wildcard, kiểu suy luận có thể là intersection/common supertype khiến API khó đọc. Đừng dựa vào inference quá phức tạp; thêm type annotation nếu intent quan trọng.

## Lambda target type

~~~java
Function<String, Integer> parser = Integer::parseInt;
var parser2 = (Function<String, Integer>) Integer::parseInt;
~~~

Không thể dùng var trực tiếp với lambda vì lambda không có type độc lập trước target typing.

## Lỗi thường gặp

Nghĩ var là runtime dynamic, dùng var với anonymous/lambda không target, và ép compiler inference bằng cast không cần thiết.

## Bài tập

Viết các lời gọi choose, map và method reference với var. Ghi kiểu compile-time mong đợi và sửa những call bị ambiguous bằng type witness hoặc variable target.

