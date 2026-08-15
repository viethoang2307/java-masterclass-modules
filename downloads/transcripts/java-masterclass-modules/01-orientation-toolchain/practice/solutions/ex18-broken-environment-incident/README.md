# Lời giải EX18 — Incident môi trường Java bị hỏng

Difficulty: Extreme
Coverage: incident response, diagnosis order, safe recovery

## Hướng tư duy

Xây timeline, bảo toàn evidence, kiểm tra executable resolution, version, project SDK và source; đưa recovery plan không xóa dữ liệu.

Kết luận chuẩn:

~~~text
preserve evidence -> isolate layer -> verify fix -> document rollback
~~~

Version, path và output thật phải lấy từ máy đang kiểm tra; không sao chép output mẫu.

## Kiểm tra

~~~powershell
javac --release 17 Main.java SelfCheck.java
java SelfCheck
~~~

Kết quả: PASS - EX18.

