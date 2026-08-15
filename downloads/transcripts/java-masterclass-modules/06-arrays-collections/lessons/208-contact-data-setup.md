# 208. Contact data: chuẩn bị model và dữ liệu

## Mục tiêu

- Chuyển yêu cầu nghiệp vụ thành identity rõ ràng.
- Chuẩn hóa dữ liệu trước khi đưa vào collection.

## Model gợi ý

```java
record Contact(String name, Set<String> emails, Set<String> phones) {
    Contact {
        name = name.strip();
        emails = Set.copyOf(emails);
        phones = Set.copyOf(phones);
    }
}
```

Trước khi chọn `Set`, cần trả lời “hai contact được xem là cùng người khi nào?”. Email, phone hoặc database ID cho kết quả khác nhau. Không nên để `equals` thay đổi theo collection đang dùng.

## Data hygiene

- `strip`, case normalization cho email.
- Chuẩn hóa phone theo quy tắc thống nhất.
- Loại dữ liệu rỗng trước khi tạo object.
- Defensive copy để giữ invariant.

## Lỗi thường gặp

- Dùng display name làm unique identity.
- Để collection mutable lọt vào immutable record.
- Normalize lúc lookup nhưng không normalize lúc insert.

## Bài tập ngắn

Định nghĩa `ContactId` và viết hàm merge hai nguồn contact không làm mất email/phone.

## Interview prompt

Equality kỹ thuật và identity nghiệp vụ khác nhau thế nào?

## Nguồn

- Transcript bài 208.
- Java 17 API: records, `Set.copyOf`.
