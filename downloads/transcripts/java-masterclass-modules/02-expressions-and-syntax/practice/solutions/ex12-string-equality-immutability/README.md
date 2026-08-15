# Lời giải EX12 — String concatenation, equality và immutability

Difficulty: Hard
Coverage: String, + concatenation, equals, == pitfall, immutable

## Hướng giải

equals so sánh nội dung; == so sánh reference trong trường hợp object. String immutable nên upper là object mới.

## Lưu ý

String literal pooling làm == đôi khi cho kết quả gây nhầm; không dựa vào behavior đó trong code nghiệp vụ.

## Độ phức tạp

O(n) theo độ dài chuỗi.

## Kiểm tra

~~~powershell
javac --release 17 Main.java SelfCheck.java
java SelfCheck
~~~

Kết quả: PASS - EX12.

