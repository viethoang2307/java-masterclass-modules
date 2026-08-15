# Lời giải EX11 — Thiết kế study loop từ video tới code

Difficulty: Hard
Coverage: active learning, typing practice, feedback loop

## Hướng tư duy

Thiết kế chu kỳ xem ngắn, tự gõ, dự đoán output, chạy, ghi lỗi và ôn lại; có timebox và tiêu chí hoàn thành.

Kết luận chuẩn:

~~~text
watch small chunk -> type -> predict -> run -> explain -> review
~~~

Version, path và output thật phải lấy từ máy đang kiểm tra; không sao chép output mẫu.

## Kiểm tra

~~~powershell
javac --release 17 Main.java SelfCheck.java
java SelfCheck
~~~

Kết quả: PASS - EX11.

