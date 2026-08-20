# 382 — JPA transaction semantics

Entity managed và dirty checking có ý nghĩa trong persistence context gắn transaction. Flush có thể xảy ra trước commit, query hoặc explicit `flush`; exception constraint có thể đến muộn hơn dòng mutate.

Không bắt persistence exception rồi tiếp tục dùng transaction đã mark rollback-only. Transaction boundary nên do service/infrastructure quản lý; propagation và isolation phải được tài liệu hóa.

## Bài tự luyện

Mô tả sequence `persist -> query -> flush -> commit` và điểm nào có thể ném constraint violation.
