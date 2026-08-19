# Lời giải — Bài 18: Instant và Zone Report

## Hướng tư duy

Lưu Instant cho event timeline, convert ZoneId ở presentation. SelfCheck dùng instant cố định nên không flaky.

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

