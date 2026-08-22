# 470 — Named, unnamed và automatic module

JPMS có nhiều loại module trong một ứng dụng chuyển tiếp.

| Loại | Nguồn tên | Đặc tính |
|---|---|---|
| Named | `module-info.java` | Encapsulation và graph đầy đủ |
| Unnamed | Classpath | Mọi package được xem là exported, đọc mọi named module |
| Automatic | JAR trên module path không có descriptor | Có tên suy ra, export/read rộng |
| Open named | Descriptor có `open module` | Deep reflection mặc định được phép |

## Migration thực tế

Có thể để thư viện cũ trên module path như automatic module trong giai đoạn đầu. Tuy nhiên tên module suy ra từ filename có thể không ổn định, ví dụ `my-lib-1.2.0.jar` thường thành `my.lib` theo quy tắc suy đoán.

## Nguyên tắc

- Đừng dựa lâu dài vào tên automatic module nếu có thể yêu cầu upstream cung cấp descriptor.
- Một named module không thể `requires` theo package name.
- Classpath và module path có resolution rules khác nhau; không trộn tùy tiện.

## Bài tập suy luận

Cho ba artifact `common.jar` có descriptor, `legacy-utils-2.0.jar` không descriptor và `app` trên module path. Viết graph, xác định module name của legacy bằng `jar --describe-module` và chỉ ra phần nào còn weakly encapsulated.

