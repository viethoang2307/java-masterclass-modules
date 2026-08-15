# Lời giải EX13 — Tạo Minimal Reproducible Example

Difficulty: Very Hard
Coverage: MRE, environment facts, isolation

## Hướng tư duy

Rút lỗi thành một file Java nhỏ, kèm lệnh compile/run, expected/actual output và thông tin JDK.

Kết luận chuẩn:

~~~text
minimal code + exact commands + expected/actual + environment
~~~

Version, path và output thật phải lấy từ máy đang kiểm tra; không sao chép output mẫu.

## Kiểm tra

~~~powershell
javac --release 17 Main.java SelfCheck.java
java SelfCheck
~~~

Kết quả: PASS - EX13.

