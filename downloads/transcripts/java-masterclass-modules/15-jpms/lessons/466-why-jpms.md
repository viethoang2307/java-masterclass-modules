# 466 — Vì sao cần JPMS?

## Mục tiêu

Hiểu Java Platform Module System (JPMS) giải quyết vấn đề gì mà `classpath` truyền thống không giải quyết tốt.

## Bối cảnh

Classpath là một danh sách JAR. Mọi package public trên classpath gần như đều có thể được mọi code khác nhìn thấy. Khi ứng dụng lớn lên, ta gặp:

- dependency trùng version và thứ tự classpath làm thay đổi hành vi;
- package nội bộ vô tình trở thành API;
- thiếu dependency chỉ được phát hiện khi chạy;
- khó biết module nào đang đọc module nào.

JPMS bổ sung **strong encapsulation** và một **module graph**. Module khai báo tên, package được export và dependency cần đọc.

```text
app  --requires-->  library
 |                    |
 |                    +-- exports com.example.api
 +-- chỉ đọc API, không đọc package internal
```

## Cách học

1. Viết một chương trình hai package và chạy bằng classpath.
2. Thêm `module-info.java` cho từng phần.
3. Dùng `javac --module-source-path` để compiler kiểm tra graph.
4. Cố tình import package chưa export và quan sát lỗi.

## Điểm cần nhớ

JPMS không chỉ là đổi thư mục hoặc thêm một file descriptor. Nó thay đổi visibility, cách resolve dependency và cách đóng gói runtime. Hãy phân biệt **readability** (module A đọc module B) với **accessibility** (package/class có được export hay không).

## Checkpoint

Giải thích được vì sao một class `public` vẫn có thể không truy cập được từ module khác.

