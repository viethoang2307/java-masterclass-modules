# 100 — String Methods và Best Practices

## Mục tiêu

Ôn String immutable, equality, trim/strip, blank, substring và các method thường dùng trong object output.

## Mental model

String operation tạo String mới; biến cũ không đổi. Dùng equals cho content, isBlank cho whitespace-only, và cân nhắc locale khi case conversion.

## Ví dụ Java 17

~~~java
String raw = "  Java 17  ";
String normalized = raw.strip();
boolean ok = normalized.equals("Java 17");
System.out.println(ok);
~~~

## Lỗi thường gặp

- Dùng == để so sánh text.
- Gọi trim/strip nhưng bỏ qua return value.
- toLowerCase không chỉ rõ Locale khi xử lý protocol.

## Bài tập ngắn

Viết normalizeUsername và test null, blank, surrounding whitespace, equality.

## Interview prompt

String immutable mang lại lợi ích gì cho sharing và thread safety?

## Nguồn

Transcript course lesson 100; code được chuẩn hóa theo Java 17, giữ ý đồ OOP của course.

