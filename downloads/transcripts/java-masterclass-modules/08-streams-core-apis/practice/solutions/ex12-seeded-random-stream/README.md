# Lời giải — Bài 12: Seeded Random Stream

## Hướng tư duy

Random được inject để test deterministic; ints(count, origin, bound) dùng bound exclusive.

## Complexity

Pipeline có chi phí theo kích thước source; stateful operations như distinct, sorted, grouping hoặc collect có thể dùng O(n) memory.

## Lỗi thường gặp

Consume stream nhiều lần, side effect trong lambda, quên empty Optional, sai precision BigDecimal, hoặc dùng timezone/default Locale ngầm.

## Phương án thay thế

Nếu pipeline trở nên khó đọc hoặc cần nhiều mutable state, một vòng lặp có invariant rõ có thể là lựa chọn tốt hơn. Với dữ liệu lớn, benchmark trước parallel hoặc push aggregation xuống data source.

## Chạy

~~~powershell
javac --release 17 Main.java SelfCheck.java
java SelfCheck
~~~

Kết quả đúng phải in PASS.

