# 207. `equals` và `hashCode`

## Mục tiêu

- Hiểu contract của equality trong hash-based collections.
- Tránh làm mất phần tử sau khi key bị mutation.

## Contract

Nếu `a.equals(b)` là `true` thì `a.hashCode() == b.hashCode()` bắt buộc đúng. Chiều ngược lại không bắt buộc: collision là hợp lệ. Kết quả phải ổn định khi các field tham gia equality chưa đổi.

```java
record ContactKey(String email) {
    ContactKey {
        email = email.strip().toLowerCase(Locale.ROOT);
    }
}
```

Record tự tạo equality/hash code từ components, nhưng normalization vẫn là trách nhiệm domain.

## Hash collection lookup

`HashSet`/`HashMap` dùng hash để chọn bucket, rồi dùng `equals` phân biệt các phần tử cùng bucket. Average lookup thường O(1), nhưng không phải bảo đảm tuyệt đối.

## Lỗi nghiêm trọng

- Override `equals` nhưng không override `hashCode`.
- Dùng field mutable làm key, rồi thay field khi object đang ở trong map/set.
- Dùng hash code như ID duy nhất hoặc security hash.

## Bài tập ngắn

Tạo `ProductKey(sku)` không phân biệt hoa thường và test trong `HashSet`.

## Interview prompt

Tại sao mutation của key có thể khiến entry “tồn tại nhưng không tìm thấy”?

## Nguồn

- Transcript bài 207.
- Java 17 API: `Object.equals`, `Object.hashCode`, `HashMap`.
