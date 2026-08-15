# 101 — String parsing design

## Mục tiêu

Parse String bằng index/substring với validation và failure contract rõ.

## Mental model

Parser là anti-corruption boundary: text không tin cậy -> typed value hoặc null/result. Validate index trước substring.

## Ví dụ Java 17

~~~java
`static String valueOf(String line){ int i=line.indexOf('='); return i<0?null:line.substring(i+1).strip(); }`
~~~

## Lỗi thường gặp

- substring out of bounds.
- split regex không đúng.
- Throw exception không được document.

## Bài tập ngắn

Viết parser key=value có value chứa dấu =.

## Interview prompt

Parser nên return null, Optional hay throw?

## Nguồn

Transcript course lesson 101; ví dụ được chuẩn hóa theo Java 17 và diễn giải theo hướng OOP design.

