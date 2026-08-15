# 092. Tách common behavior trong hierarchy

## Mục tiêu

Biết đặt state và behavior dùng chung ở base class, đồng thời tránh biến base class thành god class.

## Ví dụ

```java
abstract class Employee {
    private final String name;
    protected Employee(String name) {
        if (name == null || name.isBlank()) throw new IllegalArgumentException("name");
        this.name = name.strip();
    }
    public final String name() { return name; }
    public abstract long monthlyPayCents();
}
```

`name` là invariant chung nên được validate một lần ở constructor. `monthlyPayCents` là variation point: base biết employee nào cũng có lương nhưng không áp đặt công thức cho mọi loại.

## Template method và quyền mở rộng

```java
abstract class Report {
    public final String render() {
        return header() + "\n" + body();
    }
    protected abstract String body();
    protected String header() { return "REPORT"; }
}
```

Đánh dấu `final` cho method nếu invariant của algorithm không được phép bị phá. Chỉ mở `protected` khi subclass thật sự cần extension point; `protected` field thường tạo coupling mạnh hơn protected method.

## Thiết kế thực tế

- Base class giữ dữ liệu bất biến và quy tắc chung.
- Subclass chỉ cung cấp phần biến đổi nhỏ.
- Không để subclass truy cập trực tiếp mutable collection nội bộ.
- Constructor base phải hoàn tất invariant trước khi subclass dùng object.

## Pitfalls

- Gọi overridable method trong constructor khi subclass state chưa khởi tạo.
- Base class chứa mọi field của mọi subtype.
- Dùng `protected` field cho phép subclass thay state tùy ý.

## Bài tập

Thiết kế `Notification` với `recipient` chung và `renderBody()` khác nhau cho email/SMS. Đánh dấu method nào `final`, `protected`, `public` và giải thích vì sao.
