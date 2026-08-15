# 100. `String` như value object

## Đặc tính

`String` immutable, `final` và có value equality. Method như `strip`, `toLowerCase`, `substring` không mutate instance cũ.

```java
String raw = " Java ";
String cleaned = raw.strip();
System.out.println(raw);     // vẫn có whitespace
System.out.println(cleaned); // Java
```

## `equals` và `==`

```java
String a = new String("java");
String b = new String("java");
System.out.println(a == b);      // false
System.out.println(a.equals(b)); // true
```

String pool làm `==` đôi khi có vẻ đúng với literal, nhưng không phải contract để so nội dung.

## Normalize ở boundary

```java
record Username(String value) {
    Username { value = value.strip().toLowerCase(Locale.ROOT); }
}
```

Không normalize lúc insert một kiểu và lúc lookup một kiểu khác. `Locale.ROOT` tránh locale máy làm thay đổi identifier.

## Security và bài tập

String phù hợp làm key vì immutable, nhưng password không nên xuất hiện trong `toString`. Viết `EmailAddress`, reject whitespace nội bộ, normalize domain và test equality trong `HashMap`.
