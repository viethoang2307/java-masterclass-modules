# 498 — Tổng quan primitive types

## Bảng cần nhớ

| Type | Ví dụ literal | Ghi chú |
|---|---|---|
| byte | 10 | nhỏ, 8 bit |
| short | 10 | 16 bit |
| int | 10 | lựa chọn mặc định cho integer |
| long | 10L | 64 bit |
| float | 10.0f | 32-bit floating point |
| double | 10.0 | 64-bit floating point, mặc định cho decimal |
| char | 'A' | một ký tự |
| boolean | true | true/false |

## Chọn type thực dụng

- Dùng int cho đa số số đếm trong phạm vi int.
- Dùng long cho ID, số lượng hoặc thời gian có thể vượt int.
- Dùng double cho nhiều phép đo nhưng không mặc định cho tiền.
- Dùng BigDecimal cho tiền hoặc decimal cần độ chính xác thập phân.
- Dùng String cho văn bản, không dùng char cho cả câu.

## Demo

~~~java
int count = 10;
long views = 3_000_000_000L;
float ratio = 0.5f;
double average = 12.75;
char grade = 'A';
boolean active = true;
String title = "Java";
~~~

Primitive type không có method instance như object; wrapper class cung cấp API tương ứng khi cần.

## Bài tập

Thiết kế model cho một sản phẩm: tên, giá, số lượng tồn kho, còn bán hay không, ký tự hạng. Chọn type và giải thích từng lựa chọn.

## Nguồn

- Transcript course: lesson 498.
- Oracle: Primitive Data Types.

