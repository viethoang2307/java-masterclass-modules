# Lời giải EX10 — Chọn JDK/LTS theo tình huống

Difficulty: Hard
Coverage: LTS, course baseline, compatibility trade-offs

## Hướng tư duy

Đưa ra quyết định cho môi trường học, production ổn định và thử nghiệm; tách rõ baseline course với runtime đang cài.

Kết luận chuẩn:

~~~text
choose baseline by compatibility and support policy, not newest-version bias
~~~

Version, path và output thật phải lấy từ máy đang kiểm tra; không sao chép output mẫu.

## Kiểm tra

~~~powershell
javac --release 17 Main.java SelfCheck.java
java SelfCheck
~~~

Kết quả: PASS - EX10.

