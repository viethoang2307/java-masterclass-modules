# Lời giải EX07 — Promotion của byte và short

Difficulty: Hard
Coverage: byte, short, arithmetic promotion, wrapper observation

## Hướng giải

Binary numeric promotion đưa byte và short lên int trước arithmetic. Integer wrapper giúp quan sát class runtime của giá trị đã lưu.

## Lưu ý

Cast về byte chỉ an toàn sau khi kiểm tra range; dùng int là lựa chọn tự nhiên cho kết quả trung gian.

## Độ phức tạp

O(1).

## Kiểm tra

~~~powershell
javac --release 17 Main.java SelfCheck.java
java SelfCheck
~~~

Kết quả: PASS - EX07.

