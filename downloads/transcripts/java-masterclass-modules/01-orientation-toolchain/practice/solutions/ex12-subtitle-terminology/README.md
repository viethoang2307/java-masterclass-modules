# Lời giải EX12 — Chuẩn hóa thuật ngữ từ subtitle

Difficulty: Hard
Coverage: subtitle, technical listening, terminology validation

## Hướng tư duy

Lập glossary song ngữ, đối chiếu context code và nguồn chính thức; đánh dấu từ không nên dịch máy móc.

Kết luận chuẩn:

~~~text
validate subtitle terms against code context and authoritative documentation
~~~

Version, path và output thật phải lấy từ máy đang kiểm tra; không sao chép output mẫu.

## Kiểm tra

~~~powershell
javac --release 17 Main.java SelfCheck.java
java SelfCheck
~~~

Kết quả: PASS - EX12.

