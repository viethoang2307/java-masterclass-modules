# Lời giải EX15 — Lập Compiler Error Triage Log

Difficulty: Very Hard
Coverage: compiler diagnostics, first-error strategy, hypothesis testing

## Hướng tư duy

Sửa lỗi đầu tiên trước, ghi hypothesis/change/result cho từng lượt và chứng minh vì sao số lỗi giảm.

Kết luận chuẩn:

~~~text
fix the first causal diagnostic, recompile, then reassess
~~~

Version, path và output thật phải lấy từ máy đang kiểm tra; không sao chép output mẫu.

## Kiểm tra

~~~powershell
javac --release 17 Main.java SelfCheck.java
java SelfCheck
~~~

Kết quả: PASS - EX15.

