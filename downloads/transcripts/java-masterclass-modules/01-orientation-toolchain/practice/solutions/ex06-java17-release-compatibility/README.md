# Lời giải EX06 — Kiểm tra tương thích Java 17

Difficulty: Hard
Coverage: Java 17, --release, compatibility

## Hướng tư duy

Compile source bằng --release 17; ghi lại trường hợp API hoặc syntax mới hơn bị compiler từ chối và giải thích lợi ích của target release.

Kết luận chuẩn:

~~~text
compile with --release 17 to enforce Java 17 API and language compatibility
~~~

Version, path và output thật phải lấy từ máy đang kiểm tra; không sao chép output mẫu.

## Kiểm tra

~~~powershell
javac --release 17 Main.java SelfCheck.java
java SelfCheck
~~~

Kết quả: PASS - EX06.

