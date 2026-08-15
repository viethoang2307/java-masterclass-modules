# Lời giải 01 — Array Statistics

Dùng phần tử đầu làm `min/max`, `long` cho tổng rồi duyệt đúng một lần. Khởi tạo min/max bằng 0 sẽ sai khi toàn bộ input âm hoặc dương. Complexity: O(n) time, O(1) extra space. Một phương án khác là dùng stream statistics, nhưng vòng lặp làm contract và overflow choice rõ hơn.
