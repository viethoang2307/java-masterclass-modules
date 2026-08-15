# 89 — POJO — Plain Old Java Object

## Mục tiêu

Hiểu cấu trúc POJO/JavaBean: fields, constructor, getters/setters và toString; biết boilerplate trade-off.

## Mental model

POJO là class không bị buộc bởi framework base class. JavaBean conventions thường cần no-arg constructor, getters/setters và naming chuẩn. Encapsulation vẫn là trách nhiệm của bạn.

## Ví dụ Java 17

~~~java
final class Student {
    private String name;
    private int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    String getName() { return name; }
    void setAge(int age) { if (age >= 0) this.age = age; }
    @Override public String toString() {
        return "Student{name='" + name + "', age=" + age + "}";
    }
}
~~~

## Lỗi thường gặp

- Setter không validate.
- toString lộ secret.
- Dùng public fields vì POJO bị hiểu sai là data bag.

## Bài tập ngắn

Viết POJO Student với invariant age >= 0 và toString deterministic; so sánh với record.

## Interview prompt

POJO khác JavaBean ở điểm nào?

## Nguồn

Transcript course lesson 89; code được chuẩn hóa theo Java 17, giữ ý đồ OOP của course.

