# Lesson 005 — Help, JShell và IntelliJ IDEA

## Course nói gì?

Bài khuyến khích người học dùng Q&A khi gặp khó khăn và chuyển dần từ JShell sang IntelliJ IDEA. Một câu hỏi tốt cần context: bài nào, code nào, error message nào và đã thử gì.

## Mental model: ba lớp workflow

    JShell
      -> thử một expression/API nhỏ
    IDE
      -> tổ chức project, refactor, debug, test
    Q&A / documentation
      -> kiểm chứng giả định và tìm nguyên nhân

Không lớp nào thay thế hoàn toàn lớp khác.

## Cách hỏi một câu hỏi kỹ thuật

Một question tối thiểu nên có:

1. Title cụ thể: hành vi/lỗi chính.
2. Expected behavior.
3. Actual behavior.
4. Minimal reproducible example.
5. Full error/stack trace.
6. Java/JDK/build environment.
7. Những gì đã thử và kết quả.

Ví dụ format:

    Environment: JDK 17, IntelliJ, Windows
    Expected: đọc được dòng đầu tiên
    Actual: NoSuchElementException
    Reproduction: code ngắn nhất
    Tried: kiểm tra file path, nhưng lỗi vẫn còn

Đừng chỉ gửi ảnh màn hình; text code và stack trace có thể search/copy.

## JShell dùng để làm gì?

JShell phù hợp kiểm tra:

- syntax nhỏ;
- method của String/Collection;
- behavior của API;
- conversion/formatting;
- giả thuyết nhanh trước khi sửa project.

Không dùng JShell làm nơi quản lý source nhiều class, dependency, test suite hoặc application lifecycle.

## IntelliJ IDEA dùng để làm gì?

IDE cung cấp navigation, completion, refactoring, project SDK, build integration, debugger và test runner. Nhưng IDE có thể cấu hình sai; luôn xác minh bằng terminal và build file.

## Pitfalls

- Hỏi “code không chạy” mà không gửi error.
- Dùng code quá dài khiến người hỗ trợ không isolate được lỗi.
- Thêm câu hỏi vào thread cũ không liên quan.
- Copy solution mà không hiểu root cause.
- Dùng IDE magic nhưng không biết compile command/runtime.

## Interview prompts

1. Một bug report tốt gồm những phần nào?
2. Khi nào bạn dùng REPL thay vì test?
3. Làm sao kiểm tra IDE không dùng sai JDK?
4. Vì sao minimal reproducible example quan trọng?

## Practice

Tạo một lỗi cố ý: chạy class bằng JDK khác target hoặc đọc file sai path. Viết một bug report theo format trên, sau đó tự giải quyết bằng stack trace, JShell hoặc debugger. Lưu report và root cause trong thư mục project.

## Key takeaways

- Asking for help là kỹ năng engineering.
- JShell giúp khám phá; IDE giúp xây dựng và debug project.
- Error message/stack trace là dữ liệu chẩn đoán, không phải noise.
- Câu hỏi tốt bắt đầu bằng reproduction nhỏ và environment rõ.

## Nguồn

Transcript: 005 - 4 Transitioning from JShell to IntelliJ IDEA - Getting Help.
