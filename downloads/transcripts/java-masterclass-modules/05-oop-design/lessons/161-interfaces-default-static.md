# 161 — Interface default và static methods

## Mục tiêu

Dùng default method cho behavior backwards-compatible; static method cho helper gắn với interface.

## Mental model

Default method có thể bị override; static interface method gọi qua InterfaceName, không qua instance.

## Ví dụ Java 17

~~~java
`interface Describable { String name(); default String description(){return name();} static boolean valid(String s){return s!=null&&!s.isBlank();} }`
~~~

## Lỗi thường gặp

- Gọi static interface method qua object.
- Default diamond conflict.
- Default method che giấu breaking behavior.

## Bài tập ngắn

Tạo hai implementation dùng default và một override.

## Interview prompt

Nếu hai interface có cùng default method thì xử lý sao?

## Nguồn

Transcript course lesson 161; ví dụ được chuẩn hóa theo Java 17 và diễn giải theo hướng OOP design.

