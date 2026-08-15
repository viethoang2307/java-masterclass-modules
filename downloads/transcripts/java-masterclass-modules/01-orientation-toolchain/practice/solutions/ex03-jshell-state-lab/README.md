# Lời giải EX03 — Quản lý state trong JShell

Difficulty: Medium
Coverage: JShell, /vars, /list, /reset, /exit

## Hướng tư duy

Tạo hai biến, xem state bằng /vars và /list, reset session rồi chứng minh biến cũ không còn.

Kết luận chuẩn:

~~~text
JShell keeps snippet state until /reset or session exit
~~~

Reference answer mô tả invariant của bài. Version, path và output thật phải lấy từ máy đang kiểm tra.

## Kiểm tra

~~~powershell
javac --release 17 Main.java SelfCheck.java
java SelfCheck
~~~

Kết quả: PASS - EX03.

