# 163 — Interface VS Abstract Class

## Mục tiêu

Ra quyết định interface/abstract class dựa trên shared state, identity và multiple capabilities.

## Mental model

Abstract class phù hợp common state + invariant + template. Interface phù hợp capability, multiple implementation và loose coupling.

## Ví dụ Java 17

~~~java
`abstract class BaseJob { protected final String id; }\ninterface Retryable { boolean retry(); }`
~~~

## Lỗi thường gặp

- Chọn theo thói quen.
- Abstract class làm hierarchy cứng.
- Interface chứa mutable shared state.

## Bài tập ngắn

Viết decision table cho 5 domain examples.

## Interview prompt

Khi nào abstract class là coupling không cần thiết?

## Nguồn

Transcript course lesson 163; ví dụ được chuẩn hóa theo Java 17 và diễn giải theo hướng OOP design.

