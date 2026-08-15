# 107 — Encapsulation Part 1 — Data hiding

## Mục tiêu

Ẩn data, expose behavior và giữ invariant ở boundary.

## Mental model

Encapsulation là kiểm soát mutation và dependency, không phải chỉ private + getter. Command methods biểu diễn domain intent.

## Ví dụ Java 17

~~~java
`final class Printer { private int toner; boolean addToner(int x){if(x<=0)return false;toner=Math.min(100,toner+x);return true;} }`
~~~

## Lỗi thường gặp

- Public setter phá invariant.
- Getter cho mutable state.
- Magic clamp không document.

## Bài tập ngắn

Implement Printer toner 0..100 với addToner/print.

## Interview prompt

Getter/setter có luôn là encapsulation tốt không?

## Nguồn

Transcript course lesson 107; ví dụ được chuẩn hóa theo Java 17 và diễn giải theo hướng OOP design.

