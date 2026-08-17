# Lesson 185 — Lambda expression

## Mục tiêu

Đọc lambda theo target type; chuyển anonymous class sang lambda; và phân biệt expression body với statement body.

## Cú pháp

~~~java
x -> x * 2
(x, y) -> x + y
(String value) -> value.trim()
() -> System.out.println("done")
value -> {
    String cleaned = value.trim();
    return cleaned.length();
}
~~~

Lambda không có type độc lập; nó cần functional interface làm target.

~~~java
Predicate<String> nonBlank = value -> value != null && !value.isBlank();
Function<String, Integer> length = String::length;
Runnable task = () -> System.out.println("run");
~~~

Expression body tự return; block body phải return rõ khi có kết quả. Khi một parameter có type, tất cả parameter phải có type.

Overload nhận Predicate và Function có thể mơ hồ; gán lambda vào variable hoặc cast target type.

## Lỗi thường gặp

Return trong expression body, quên return trong block, xử lý null không rõ và dùng lambda nhiều dòng cho domain logic khó đọc.

## Bài tập

Viết cùng behavior bằng anonymous class, expression lambda và block lambda; so sánh readability.

