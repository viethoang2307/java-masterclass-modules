# Lesson 519 — String chuyên sâu

## Mục tiêu

Hiểu String là immutable reference type; dùng equality, String pool, StringBuilder và Unicode đúng; tránh lỗi performance và so sánh sai.

## Immutability và pool

String operation tạo String mới thay vì sửa object cũ.

~~~java
String a = "java";
String b = "ja" + "va";
boolean sameValue = a.equals(b);
~~~

Literal có thể dùng String pool, nhưng không được dùng == để kiểm tra nội dung. equals kiểm tra value; hashCode phải nhất quán với equals.

## API và hiệu năng

- isBlank khác isEmpty.
- strip xử lý Unicode whitespace tốt hơn trim trong nhiều trường hợp.
- StringBuilder phù hợp nối trong loop.
- String.join và formatted giúp nói rõ intent.
- Text block phù hợp dữ liệu nhiều dòng.

~~~java
StringBuilder result = new StringBuilder();
for (String item : items) result.append(item).append('\n');
~~~

## Unicode

char là UTF-16 code unit, không luôn là một Unicode code point. Khi xử lý emoji hoặc ký tự ngoài BMP, cân nhắc codePoints() và codePointCount().

## Lỗi thường gặp

Dùng ==, nối String trong loop lớn, gọi toLowerCase không có Locale policy, và cắt Unicode bằng index mà không hiểu surrogate pair.

## Bài tập

Viết normalizer trim/strip, lowercase theo Locale.ROOT, kiểm tra blank, tạo report bằng StringBuilder và test Unicode.
