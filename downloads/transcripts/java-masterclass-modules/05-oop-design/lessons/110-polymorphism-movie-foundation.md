# 110. Polymorphism với Movie

## Mục tiêu

Polymorphism cho phép consumer gọi một contract chung mà không cần biết concrete subtype.

```java
abstract class Movie {
    private final String title;
    protected Movie(String title) { this.title = title; }
    public final String title() { return title; }
    public abstract String plot();
}

final class Adventure extends Movie {
    Adventure(String title) { super(title); }
    @Override public String plot() { return "hero faces danger"; }
}
```

```java
static void describe(Movie movie) {
    System.out.println(movie.title() + ": " + movie.plot());
}
```

`describe` không switch theo loại movie. Runtime dispatch chọn `Adventure.plot()`.

## Design signal

Nếu method chỉ cần `plot`, nhận `Movie`, không nhận `Adventure`. Parameter càng trừu tượng vừa đủ thì consumer càng ít coupling.

## Pitfalls và bài tập

Tránh downcast ngay sau khi nhận base reference và tránh base class có method không liên quan tới mọi subtype. Thêm `Comedy`, `ScienceFiction`, rồi viết playlist renderer; chứng minh thêm subtype không cần sửa loop.
