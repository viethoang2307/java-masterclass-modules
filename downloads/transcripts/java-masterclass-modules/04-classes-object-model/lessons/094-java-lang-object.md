# 94 — java.lang.Object

## Mục tiêu

Hiểu mọi class trực tiếp/gián tiếp extends Object; biết vai trò toString, equals và hashCode.

## Mental model

Object methods là contract nền tảng. equals nên phản ánh logical equality; nếu override equals phải giữ hashCode nhất quán để dùng HashMap/HashSet.

## Ví dụ Java 17

~~~java
final class UserId {
    private final String value;
    UserId(String value) { this.value = value; }

    @Override public boolean equals(Object other) {
        return other instanceof UserId u && value.equals(u.value);
    }
    @Override public int hashCode() { return value.hashCode(); }
}
~~~

## Lỗi thường gặp

- Override equals nhưng quên hashCode.
- Cast Object trước khi kiểm tra type.
- Dùng toString làm business identity.

## Bài tập ngắn

Implement value object UserId với equals/hashCode/toString; test two objects same value.

## Interview prompt

Nếu a.equals(b) true thì hashCode phải thế nào?

## Nguồn

Transcript course lesson 94; code được chuẩn hóa theo Java 17, giữ ý đồ OOP của course.

