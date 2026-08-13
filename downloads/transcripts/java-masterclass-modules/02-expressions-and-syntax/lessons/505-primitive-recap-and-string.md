# 505 — Recap primitive và String

## Primitive recap

Trước khi sang String, kiểm tra bốn điểm:

- integer literals thường là int;
- long lớn cần L;
- float cần f;
- byte và short trong arithmetic thường được promote lên int.

## String là reference type

~~~java
String first = "Hello";
String second = first + " Java";
System.out.println(second);
~~~

Dấu cộng với String trở thành concatenation. Expression được đánh giá từ trái sang phải:

~~~java
System.out.println("Result: " + 2 + 3);   // Result: 23
System.out.println("Result: " + (2 + 3)); // Result: 5
~~~

## So sánh String

Dùng equals để so sánh nội dung:

~~~java
String a = new String("java");
String b = new String("java");
System.out.println(a.equals(b)); // true
System.out.println(a == b);      // không nên dùng cho nội dung
~~~

String immutable: các method như toUpperCase tạo String mới thay vì sửa object cũ.

~~~java
String original = "java";
String upper = original.toUpperCase();
System.out.println(original); // java
System.out.println(upper);    // JAVA
~~~

## Bài tập

Tạo một message từ name, score và boolean active. Viết test cho tên rỗng, tên null và so sánh hai String có cùng nội dung.

## Nguồn

- Transcript course: lesson 505.
- Oracle Language Basics và Java API class String.

