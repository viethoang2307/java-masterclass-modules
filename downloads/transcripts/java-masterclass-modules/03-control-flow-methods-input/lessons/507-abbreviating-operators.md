# 507 — Abbreviating Operators

## Mục tiêu

Dùng compound assignment như `+=`, `-=`, `*=`, `/=`, `%=` và hiểu side effect của increment/decrement.

## Mental model

`x += y` gần tương đương `x = x + y` nhưng compound assignment có implicit cast về type của biến trái. `++x` và `x++` cùng tăng một đơn vị nhưng khác value của expression.

## Ví dụ Java 17

~~~java
int score = 10;
score += 5;
int before = score++;
int after = ++score;
System.out.println(score + " " + before + " " + after);
~~~

## Lỗi thường gặp

- Dùng `x++` trong expression mà không theo dõi value cũ.
- Quên compound assignment có thể nuốt narrowing conversion.
- Dùng `/=` với integer và mong chờ phần thập phân.

## Bài tập ngắn

Trace từng dòng của một đoạn code có `++`, `--`, `%=`; sau đó viết lại bằng assignment đầy đủ.

## Interview prompt

Vì sao `byte b = 1; b += 1;` compile nhưng `b = b + 1;` có thể không compile?

## Nguồn

Transcript course lesson 507; ví dụ được chuẩn hóa theo Java 17 và giữ nguyên ý đồ của course.

