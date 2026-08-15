# Lời giải EX05 — Đối chiếu IDE và terminal

Difficulty: Medium
Coverage: IDE SDK, CLI JDK, reproducibility

## Hướng tư duy

Ghi version JDK của IDE và CLI, chạy cùng source/input ở hai nơi, so sánh output và giải thích mọi khác biệt.

Kết luận chuẩn:

~~~text
IDE and CLI must use compatible JDK, source and inputs
~~~

Reference answer mô tả invariant của bài. Version, path và output thật phải lấy từ máy đang kiểm tra.

## Kiểm tra

~~~powershell
javac --release 17 Main.java SelfCheck.java
java SelfCheck
~~~

Kết quả: PASS - EX05.

