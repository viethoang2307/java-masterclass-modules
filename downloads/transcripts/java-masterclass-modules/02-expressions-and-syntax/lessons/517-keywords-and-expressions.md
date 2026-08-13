# 517 — Keywords và expressions

## Keywords

Java keywords là token reserved như class, public, static, void, int, if, return. IDE thường tô màu để giúp nhận diện, nhưng màu không phải một phần của Java syntax.

Không dùng keyword làm identifier:

~~~java
// int return = 1; // compile error
int returnCode = 1; // hợp lệ
~~~

## Expression và side effect

~~~java
int x = 1 + 2; // tạo giá trị và gán
x++;           // tạo giá trị cũ/mới tùy context và thay đổi x
~~~

Một expression có thể đứng riêng như expression statement nếu Java cho phép context đó. Không phải mọi expression đều là statement độc lập hợp lệ; hãy để compiler và grammar xác định.

## Đọc expression an toàn

1. Xác định type từng operand.
2. Xác định precedence.
3. Xác định conversion/promotion.
4. Tính giá trị.
5. Kiểm tra side effect như ++ hoặc assignment.

## Bài tập

Phân tích long total = 50_000L + 10L * (byteValue + shortValue + intValue); theo năm bước trên.

## Nguồn

- Transcript course: lesson 517.
- Oracle: Expressions, Statements, and Blocks.

