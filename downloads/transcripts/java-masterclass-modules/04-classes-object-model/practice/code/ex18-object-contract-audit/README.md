# Bài 18 — Object contract audit

**Độ khó:** Extreme

## Kiến thức phủ

equals, hashCode, toString, null/type symmetry

## Đề bài

Xây Email value object normalize lowercase Locale.ROOT. equals/hashCode phải nhất quán; toString trả Email[value]. Viết audit() kiểm tra same value, different value, null và hash.

## Input/output mẫu

~~~text
Email(" A@X.COM ") equals Email("a@x.com") = true
Email.toString() = Email[a@x.com]
~~~

## Tiêu chí hoàn thành

- Main.java compile bằng javac --release 17.
- Implement đúng class/method contract mà SelfCheck sử dụng.
- Enforce invariant ở constructor hoặc command method.
- Không để debug output trong domain methods.

## Cách chạy

~~~powershell
javac --release 17 Main.java SelfCheck.java
java SelfCheck
java Main
~~~

Starter có TODO có chủ đích. Làm bài trong code trước khi xem solutions.

