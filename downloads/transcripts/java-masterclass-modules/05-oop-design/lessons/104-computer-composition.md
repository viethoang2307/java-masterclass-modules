# 104 — Computer với composition

## Mục tiêu

Thiết kế một aggregate có components và methods delegate behavior có kiểm soát.

## Mental model

Outer object giữ invariant của composition: components không null, command đi qua boundary, dependency có role rõ.

## Ví dụ Java 17

~~~java
`final class Computer { private final Monitor monitor; String boot(){return monitor.on()+"/boot";} }`
~~~

## Lỗi thường gặp

- new component rải trong methods.
- Null component.
- Getter trả mọi internal object.

## Bài tập ngắn

Tạo Computer boot/shutdown và fake component cho self-check.

## Interview prompt

Dependency injection giúp test composition thế nào?

## Nguồn

Transcript course lesson 104; ví dụ được chuẩn hóa theo Java 17 và diễn giải theo hướng OOP design.

