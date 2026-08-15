# 112. Casting và `var`

## Upcast

Upcast từ subtype lên base an toàn và implicit:

```java
Adventure adventure = new Adventure("Quest");
Movie movie = adventure;
```

Compiler chỉ cho gọi API của `Movie`, nhưng override vẫn dispatch runtime.

## Downcast

Downcast cần runtime object thật sự là subtype:

```java
if (movie instanceof Adventure adventure) {
    adventure.specialMove();
}
```

Cast mù `((Adventure) movie)` có thể ném `ClassCastException`. Nếu downcast xuất hiện thường xuyên, base contract thiếu capability hoặc hierarchy sai.

## `var`

`var` chỉ suy luận local variable lúc compile-time; không biến Java thành dynamic typing:

```java
var movie = createMovie("A", "Quest"); // static type Movie nếu factory trả Movie
```

Không dùng `var` cho field, parameter hay return type. `var x = null` không compile vì compiler không suy ra type.

## Bài tập

Viết bảng static/runtime type cho các biến `Movie`, `Adventure`, `var`. Tách một consumer đang downcast thành interface capability.
