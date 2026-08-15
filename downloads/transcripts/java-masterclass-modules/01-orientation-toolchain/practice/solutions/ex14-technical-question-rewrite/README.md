# Lời giải EX14 — Cải thiện câu hỏi kỹ thuật

Difficulty: Very Hard
Coverage: Q&A quality, evidence, reproducibility

## Hướng tư duy

Viết lại với tiêu đề cụ thể, mục tiêu, code tối thiểu, lỗi nguyên văn, version, lệnh đã chạy và điều đã thử.

Kết luận chuẩn:

~~~text
specific goal + minimal code + exact error + environment + attempted fixes
~~~

Version, path và output thật phải lấy từ máy đang kiểm tra; không sao chép output mẫu.

## Kiểm tra

~~~powershell
javac --release 17 Main.java SelfCheck.java
java SelfCheck
~~~

Kết quả: PASS - EX14.

