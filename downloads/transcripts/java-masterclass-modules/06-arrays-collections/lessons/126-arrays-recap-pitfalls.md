# 126 — Arrays recap và pitfalls

## Mục tiêu

Củng cố null, bounds, fixed length, mutation và copying.

## Mental model

Array API nhỏ nhưng aliasing mạnh: method nhận reference có thể mutate caller state.

## Ví dụ Java 17

~~~java
static int[] doubled(int[] a){int[] c=a.clone();for(int i=0;i<c.length;i++)c[i]*=2;return c;}
~~~

## Lỗi thường gặp

- Alias vô ý.
- Clone shallow.
- Loop condition <= length.

## Bài tập ngắn

Audit 10 lỗi array và viết regression tests.

## Interview prompt

Array covariance có rủi ro gì?

## Nguồn

Transcript course lesson 126; ví dụ được chuẩn hóa Java 17 và bổ sung contract, complexity, boundary cases.
