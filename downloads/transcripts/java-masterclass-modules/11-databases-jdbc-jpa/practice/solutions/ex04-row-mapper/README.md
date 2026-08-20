# Lời giải Bài 04

Nullable numeric phải giữ distinction giữa SQL NULL và zero; dùng `Long` thay vì primitive `long`. Mapper chỉ chuyển dữ liệu, không gọi repository hay mutate state.
