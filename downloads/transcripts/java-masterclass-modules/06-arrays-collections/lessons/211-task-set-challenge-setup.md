# 211. Task Set challenge: phân tích yêu cầu

## Mục tiêu

- Thiết kế task identity trước khi dùng set.
- Tách dữ liệu nguồn, dữ liệu hợp nhất và report.

## Câu hỏi thiết kế

1. Task giống nhau theo ID hay theo `(project, description)`?
2. Status có tham gia equality không?
3. Cần giữ insertion order hay sort theo deadline?
4. Khi hai nguồn có cùng task nhưng khác status, nguồn nào thắng?

```java
record TaskKey(String project, String id) {}

record Task(TaskKey key, String description, Status status) {
    enum Status { TODO, IN_PROGRESS, DONE }
}
```

Nếu dùng `record Task` trực tiếp trong set, mọi component tham gia equality. Khi status đổi, old/new task bị xem là khác nhau; thường `TaskKey` mới là identity ổn định.

## Test trước khi code

- Hai task cùng key, khác status.
- Task chỉ có ở nguồn A hoặc B.
- Input rỗng.
- Dữ liệu trùng lặp nội bộ.

## Bài tập ngắn

Viết bảng quyết định cho merge conflict giữa local và remote task.

## Interview prompt

Tại sao equality dựa trên toàn bộ state đôi khi sai với entity?

## Nguồn

- Transcript bài 211.
- Java 17 API: records, `Set`, `Map`.
