# 133 — Collections introduction

## Mục tiêu

Hiểu Collection Framework cung cấp dynamic containers và algorithms.

## Mental model

Collection là interface hierarchy; arrays vẫn hữu ích cho fixed compact data. Chọn theo operations, không theo thói quen.

## Ví dụ Java 17

~~~java
java.util.Collection<String> names=new java.util.ArrayList<>();
names.add("An");
~~~

## Lỗi thường gặp

- Nhầm Collection với Collections.
- Dùng raw type.
- Chọn LinkedList không đo operations.

## Bài tập ngắn

Lập decision table array/List/Set/Map.

## Interview prompt

Collection và Map liên hệ thế nào?

## Nguồn

Transcript course lesson 133; ví dụ được chuẩn hóa Java 17 và bổ sung contract, complexity, boundary cases.
