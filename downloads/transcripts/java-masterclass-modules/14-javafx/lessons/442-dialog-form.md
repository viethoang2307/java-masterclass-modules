# 442 — Dialog và form

Dialog form cần validation trước commit: required, length, numeric/date, duplicate và error message accessible. Disable OK hoặc reject result khi invalid.

Dialog trả `Optional<T>` để caller phân biệt cancel và value rỗng.
