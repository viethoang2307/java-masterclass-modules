# Module 09 — Regex, Exceptions và I/O

Module này nối pattern matching với failure design và filesystem programming: Regex → Exceptions → NIO.2 text/binary I/O → serialization → file tree → capstone.

## Kết quả cần đạt

- Compile/reuse Pattern, dùng Matcher.find/matches/groups/replacement và kiểm soát backtracking.
- Phân biệt syntax validation với semantic validation; trả lỗi có context.
- Thiết kế checked/unchecked/domain exception, preserve cause và suppressed exception.
- Dùng try-with-resources đúng ownership cho Reader, Writer, Stream, InputStream và directory handles.
- Dùng Path/Files/NIO.2 với charset explicit, OpenOption rõ và path trust boundary.
- Đọc/ghi text, binary primitive, random access và hiểu EOF/truncated file.
- Đánh giá Java serialization, serialVersionUID, transient và untrusted-data risk.
- Duyệt/copy/delete file tree, viết safe atomic output và cleanup temp resources.

## Lộ trình

~~~text
Pattern/Matcher → groups/flags → validation → extraction/replacement
        ↓
I/O model → exception taxonomy → try-with-resources
        ↓
Path/Files → charset/text → write options → binary streams
        ↓
serialization → RandomAccessFile → walkFileTree → safe temp/atomic move
        ↓
integrated log processor → Regex, Exceptions & I/O capstone
~~~

## Cách học

1. Với mỗi lesson, viết rõ input grammar, encoding, resource owner và failure contract.
2. Chạy ví dụ Java 17 trên file tạm; test missing, malformed, truncated và permission edge cases.
3. Kiểm tra path có nằm trong allowed root hay không trước khi thao tác destructive.
4. Làm practice tương ứng trong practice/README.md.
5. Chạy SelfCheck từng bài rồi chạy verifier toàn bộ solutions.

## Phạm vi transcript

- 288–297: Pattern, Matcher, groups, flags, classes, quantifiers, boundaries, replacement và regex validation/extraction.
- 298–304: I/O model, exception design, try-with-resources, Path/Files, attributes, đọc/ghi text.
- 305–322: BufferedReader/Writer, Scanner, charset decoder, OpenOption, binary I/O, serialization, random access, file tree, safe writes, taxonomy và capstone.
- 643–680: legacy/reference track về Exceptions, I/O, binary/object streams và RandomAccessFile; đã hợp nhất, không tạo lesson trùng.

## Practice

Bộ practice gồm 20 bài từ Medium đến Extreme, mỗi bài có starter trong code/, lời giải trong solutions/ và SelfCheck độc lập. Các bài I/O tạo temp directory và tự cleanup.

~~~powershell
cd practice/solutions/ex01-username-regex
javac --release 17 Main.java SelfCheck.java
java SelfCheck

cd ../..
powershell.exe -ExecutionPolicy Bypass -File .\verify-solutions.ps1
~~~

Verifier compile từng exercise trong thư mục tạm; không cần Maven, Gradle hoặc JUnit.

## References

- Java 17 API: java.util.regex, java.nio.file, java.nio.charset, java.io và java.util.stream.
- Java Language Specification 17: exceptions, try-with-resources, text blocks và regular expressions API usage.
- Oracle Java Tutorials: Regular Expressions, Basic I/O, NIO.2 và Serializable.

