# Lời giải EX19 — Mô phỏng onboarding máy sạch

Difficulty: Extreme
Coverage: reproducibility, smoke test, handoff

## Hướng tư duy

Thực hiện hoặc peer-review runbook trên profile/máy sạch; ghi thời gian, điểm mơ hồ, lỗi và bản sửa tài liệu.

Kết luận chuẩn:

~~~text
a runbook is complete only when another person can reproduce the setup
~~~

Version, path và output thật phải lấy từ máy đang kiểm tra; không sao chép output mẫu.

## Kiểm tra

~~~powershell
javac --release 17 Main.java SelfCheck.java
java SelfCheck
~~~

Kết quả: PASS - EX19.

