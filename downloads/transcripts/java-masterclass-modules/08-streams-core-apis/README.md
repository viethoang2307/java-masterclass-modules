# Module 08 — Streams và Core APIs

Module này dạy cách biến dữ liệu thành pipeline có contract rõ: source → intermediate operations → terminal operation. Sau Streams, module mở rộng sang Math, Random, BigDecimal, java.time, Locale và parallel streams.

## Kết quả cần đạt

- Phân biệt Collection lưu dữ liệu với Stream mô tả một lần xử lý dữ liệu.
- Giải thích lazy evaluation, short-circuit, single-use và encounter order.
- Chọn filter, map, flatMap, primitive stream, collect, reduce, grouping và toMap đúng bài toán.
- Dùng Optional ở return boundary, không lạm dụng get hoặc biến missing thành null mơ hồ.
- Tính tiền bằng BigDecimal với scale/rounding policy rõ.
- Chọn LocalDate, LocalTime, LocalDateTime, Instant, ZonedDateTime, Period và Duration đúng semantics.
- Format theo Locale explicit và inject Clock/Random để test deterministic.
- Đánh giá parallel stream dựa trên purity, associativity, Spliterator, workload và benchmark.

## Lộ trình

~~~text
Collection vs Stream → source → lazy pipeline → filter/map/sorted
        ↓
primitive stream → collect/reduce → grouping/toMap → terminal analytics
        ↓
flatMap domain data → Optional lookup → Math/Random
        ↓
BigDecimal → java.time → Locale/formatting
        ↓
parallel stream → collector contract → capstone review
~~~

## Cách học

1. Với mỗi lesson, xác định source, cardinality, ordering, null policy và terminal result.
2. Dự đoán lambda nào được gọi, bao nhiêu lần và pipeline có short-circuit không.
3. Chạy ví dụ Java 17; thử empty, duplicate, null, overflow, rounding và timezone boundary.
4. Làm practice tương ứng trong practice/README.md.
5. Chạy SelfCheck từng bài rồi chạy verifier toàn bộ solutions.

## Phạm vi transcript

- 250–269: stream concept, sources, pipeline, filter/map, primitive streams, collectors, reduce, terminal operations, student analytics và flatMap.
- 270–285: Math, Random, BigDecimal, java.time, Period/Duration, timezone, formatting, Locale và Optional.
- 286–287: parallel streams, ordering, reduction, concurrent collector và capstone review.
- 601–603: legacy/reference track về Streams, intermediate/terminal operations, flatMap và lambda best practices; đã hợp nhất, không tạo lesson trùng.

## Practice

Bộ practice gồm 20 bài từ Medium đến Extreme, mỗi bài có đề/starter trong code/, lời giải trong solutions/ và SelfCheck độc lập.

~~~powershell
cd practice/solutions/ex01-name-pipeline
javac --release 17 Main.java SelfCheck.java
java SelfCheck

cd ../..
powershell.exe -ExecutionPolicy Bypass -File .\verify-solutions.ps1
~~~

Verifier compile từng exercise trong thư mục tạm; không cần Maven, Gradle hoặc JUnit.

## References

- Java 17 API: java.util.stream, java.util.function, java.time, java.math và java.text.
- Java Language Specification 17: lambda expressions, method invocation và numeric conversions.
- Oracle Java Tutorials: Stream API, Optional, BigDecimal và Date-Time API.

