# 105 — Quản lý object composition

## Mục tiêu

Phối hợp nhiều component trong workflow deterministic, tránh Main biết chi tiết implementation.

## Mental model

Composition orchestration nên gọi capability methods; không sửa field của component trực tiếp.

## Ví dụ Java 17

~~~java
`interface Power { String on(); }\nfinal class Computer { private final Power power; String boot(){return power.on();} }`
~~~

## Lỗi thường gặp

- God object.
- Order side effect không rõ.
- Component leak state.

## Bài tập ngắn

Viết boot sequence có Monitor, Case, Motherboard và test thứ tự.

## Interview prompt

Orchestrator nên sở hữu rule nào?

## Nguồn

Transcript course lesson 105; ví dụ được chuẩn hóa theo Java 17 và diễn giải theo hướng OOP design.

