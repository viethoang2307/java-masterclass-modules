# 211. Task Set challenge: identity trước collection

## Câu hỏi thiết kế

Task giống nhau theo ID hay project + description? Status có tham gia equality không? Cần insertion order hay sort deadline? Conflict giữa hai nguồn xử lý thế nào?

~~~java
record TaskKey(String project, String id) {}
record Task(TaskKey key, String description, Status status) {
    enum Status { PLANNED, IN_PROGRESS, DONE }
}
~~~

Entity thường có identity ổn định; record equality toàn bộ state có thể sai nếu status thay đổi. Map<TaskKey,Task> thường phù hợp hơn Set<Task> khi cần phiên bản hiện tại.

## Test trước code

Test cùng key khác status, task chỉ ở một nguồn, duplicate nội bộ, empty input và conflict policy.

## Bài tập

Viết decision table cho merge local/remote và chọn winner rõ ràng. Không silently drop conflict.
