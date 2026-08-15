# 154. Abstract classes phần 2: mở rộng có kiểm soát

## Protected contract

Protected method là API giữa base và subclass. Nó cần documentation về precondition, state lúc được gọi và giá trị phải trả.

```java
abstract class ImportJob {
    public final ImportReport run(String input) {
        ParsedData data = parse(input);
        validate(data);
        return persist(data);
    }
    protected abstract ParsedData parse(String input);
    protected void validate(ParsedData data) {}
    protected abstract ImportReport persist(ParsedData data);
}
```

Base kiểm soát thứ tự parse→validate→persist; subclass không thể persist dữ liệu chưa validate.

## Khi không nên dùng template

Nếu các flow khác nhau quá nhiều, template method tạo nhiều hook và subclass override khó đọc. Khi đó composition với các strategy (`Parser`, `Validator`, `Persister`) dễ thay thế/test hơn.

## Bài tập

Refactor một template class có 7 protected hooks thành ba collaborator interfaces. So sánh số điểm extension và test case.
