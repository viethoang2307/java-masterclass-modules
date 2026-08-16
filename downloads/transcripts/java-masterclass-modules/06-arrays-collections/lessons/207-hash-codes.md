# 207. equals và hashCode

## Contract

Nếu a.equals(b) là true thì a.hashCode() phải bằng b.hashCode(). Chiều ngược lại không bắt buộc vì collision hợp lệ. Equality cần reflexive, symmetric, transitive, consistent và false với null.

~~~java
record ContactKey(String email) {
    ContactKey {
        email = email.strip().toLowerCase(Locale.ROOT);
    }
}
~~~

Record tự tạo equals/hashCode từ components; normalization vẫn là trách nhiệm domain.

## Hash collection lookup

HashSet/HashMap dùng hash để chọn bucket, rồi equals để phân biệt phần tử cùng bucket. Average lookup thường O(1), không phải bảo đảm tuyệt đối.

## Mutable key

Nếu field tham gia hashCode bị đổi khi key đang trong map/set, object có thể tồn tại nhưng lookup không tìm thấy. Key nên immutable hoặc không được mutate.

## Bài tập

Tạo ProductKey không phân biệt hoa thường, test HashSet/HashMap, tạo collision giả và audit equals/hashCode.

## Pitfalls

Override equals nhưng quên hashCode, dùng mutable key, và coi hash code là ID duy nhất.
