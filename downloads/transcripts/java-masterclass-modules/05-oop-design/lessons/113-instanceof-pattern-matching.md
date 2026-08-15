# 113. `instanceof` pattern matching

## Cú pháp Java 17

```java
if (value instanceof String text && !text.isBlank()) {
    System.out.println(text.strip());
}
```

Java kiểm tra type và bind variable trong một expression. Pattern variable chỉ có scope nơi compiler chứng minh điều kiện đúng:

```java
if (!(movie instanceof Adventure adventure)) return;
adventure.specialMove();
```

## Khi nên dùng

`instanceof` phù hợp ở boundary như serializer, adapter hoặc khi xử lý closed hierarchy. Nó không nên trở thành switch trung tâm cho mọi behavior polymorphic.

## Null và refactor signal

`null instanceof SomeType` luôn false. Nếu null là invalid domain value, reject sớm. Nếu có nhiều nhánh type, hỏi xem behavior đó có nên là method của abstraction hoặc exhaustive switch trên sealed type không.

## Bài tập

Viết `describe(Object)` xử lý String, Integer và null; sau đó thiết kế lại thành `Describable` để so sánh coupling.
