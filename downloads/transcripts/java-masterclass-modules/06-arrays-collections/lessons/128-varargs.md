# 128 — Varargs

## Mục tiêu

Dùng T... như array parameter và tránh overload ambiguity.

## Mental model

Varargs compile thành array; chỉ một varargs và phải cuối parameter list.

## Ví dụ Java 17

~~~java
static int sum(int... values){int s=0;for(int v:values)s+=v;return s;}
~~~

## Lỗi thường gặp

- Varargs không ở cuối.
- Null call mơ hồ.
- Overload varargs gây ambiguous.

## Bài tập ngắn

Viết join(separator,String...).

## Interview prompt

Varargs allocation cost?

## Nguồn

Transcript course lesson 128; ví dụ được chuẩn hóa Java 17 và bổ sung contract, complexity, boundary cases.
