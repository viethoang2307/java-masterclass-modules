# 119 — Project structure, packages và imports

## Mục tiêu

Tổ chức source theo package và hiểu import không copy code.

## Mental model

Package tạo namespace và access boundary; thư mục source phải khớp package khi compile chuẩn.

## Ví dụ Java 17

~~~java
package dev.course.collections;
import java.util.List;
class Main { List<String> names = List.of("An"); }
~~~

## Lỗi thường gặp

- Package/path lệch.
- Wildcard import gây ambiguity.
- Dùng default package cho project lớn.

## Bài tập ngắn

Tạo package model/service/app và compile bằng javac -d out.

## Interview prompt

Import và fully-qualified name khác nhau thế nào?

## Nguồn

Transcript course lesson 119; ví dụ được chuẩn hóa Java 17 và bổ sung contract, complexity, boundary cases.
