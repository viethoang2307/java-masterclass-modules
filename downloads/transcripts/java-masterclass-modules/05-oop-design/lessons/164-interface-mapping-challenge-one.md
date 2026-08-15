# 164. Interface mapping challenge phần 1

## Bài toán

Map domain object sang DTO qua interface để consumer không phụ thuộc class cụ thể:

```java
interface Mapper<S, T> {
    T map(S source);
}

record User(String id, String email) {}
record UserDto(String id, String maskedEmail) {}
```

`UserMapper implements Mapper<User, UserDto>` giữ mapping policy riêng. Domain object không cần biết JSON/HTTP DTO.

## Null và validation

Mapper phải document null: reject bằng `Objects.requireNonNull`, trả null, hoặc Result. Không map object thiếu invariant thành DTO có vẻ hợp lệ.

## Bài tập

Viết mapper order→receipt DTO, inject `PriceFormatter`, test nested line items và immutable output. Tạo fake formatter để kiểm tra dependency.
