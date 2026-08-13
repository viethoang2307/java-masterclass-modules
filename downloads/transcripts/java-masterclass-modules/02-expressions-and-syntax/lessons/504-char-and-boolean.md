# 504 — char và boolean

## char

char biểu diễn một UTF-16 code unit và dùng dấu nháy đơn:

~~~java
char letter = 'A';
char digit = '7';
char newline = '\n';
System.out.println(letter);
~~~

String dùng dấu nháy kép và có thể chứa nhiều ký tự:

~~~java
String word = "Java";
~~~

Một số ký tự cần escape như newline, tab, backslash và dấu nháy.

## boolean

boolean chỉ có hai giá trị:

~~~java
boolean loggedIn = true;
boolean admin = false;
~~~

Không viết if (loggedIn == true) khi if (loggedIn) đã đủ rõ. Với phủ định, dùng !loggedIn và đặt tên biến tích cực để tránh double negative.

## Bài tập

Tạo biến firstLetter, separator, isActive. In một câu có char và String; sau đó dùng boolean để quyết định in thông báo.

## Nguồn

- Transcript course: lesson 504.
- Oracle Java API: Character.

