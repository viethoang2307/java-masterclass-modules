# Lời giải EX07 — Chẩn đoán PATH và JAVA_HOME

Difficulty: Hard
Coverage: PATH, JAVA_HOME, executable resolution

## Hướng tư duy

Thu thập JAVA_HOME, command resolution và version; xác định thứ tự PATH gây lệch, đề xuất sửa nhưng không xóa installation.

Kết luận chuẩn:

~~~text
PATH selects executable; JAVA_HOME does not override command resolution by itself
~~~

Version, path và output thật phải lấy từ máy đang kiểm tra; không sao chép output mẫu.

## Kiểm tra

~~~powershell
javac --release 17 Main.java SelfCheck.java
java SelfCheck
~~~

Kết quả: PASS - EX07.

