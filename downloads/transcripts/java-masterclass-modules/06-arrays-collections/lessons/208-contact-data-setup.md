# 208. Contact data: identity và normalization

## Câu hỏi nghiệp vụ

Hai contact giống nhau theo email, phone, database ID hay display name? Identity quyết định key/equality; không để collection implementation quyết định ngầm.

~~~java
record Contact(String name, Set<String> emails, Set<String> phones) {
    Contact {
        name = name.strip();
        emails = Set.copyOf(emails);
        phones = Set.copyOf(phones);
    }
}
~~~

Record component Set.copyOf giúp tránh mutable collection leak, nhưng email/phone vẫn cần normalize trước khi tạo object.

## Merge data

Khi hai nguồn có cùng identity, phải có conflict policy: union email/phone, ưu tiên source, hoặc ghi conflict. Không âm thầm overwrite.

## Bài tập

Định nghĩa ContactId, normalize email/phone, merge hai nguồn và test duplicate, null, whitespace, input mutation.

## Pitfalls

Dùng display name làm identity, normalize lúc lookup khác lúc insert, và để record giữ mutable Set.
