# 032 — Legacy Java 11: expressions và setup

## Phạm vi

Đây là lesson tham chiếu từ track cũ. Nội dung hữu ích để hiểu cách course từng giới thiệu expressions, statements, code blocks và methods, nhưng không nên xem các screenshot/setup cũ là yêu cầu bắt buộc.

## Điều vẫn còn đúng

- Java phân biệt expression, statement và block.
- Variables có type.
- Arithmetic tuân theo precedence và conversion rules.
- Compiler kiểm tra nhiều lỗi trước khi chạy.
- Code nên được format nhất quán.

## Điều cần cập nhật

- Course cũ có thể dùng JDK 11; Module 2 chuẩn hóa ví dụ theo JDK 17.
- Giao diện IntelliJ, cách chọn SDK và output của tool có thể khác.
- Không copy version number hoặc menu path một cách máy móc; kiểm tra JDK thực tế bằng:

~~~text
java --version
javac --version
~~~

## Bài tập đối chiếu

Chạy cùng một expression trong JShell và file Java:

~~~java
int result = (10 + 5) * 2;
System.out.println(result);
~~~

Ghi lại phần nào là expression, phần nào là statement và block nào chứa nó.

## Kết luận

Giữ lesson này để đối chiếu transcript và thuật ngữ; dùng các lesson 492–518 cùng ví dụ trong thư mục examples làm tài liệu học chính.

## Nguồn

- Transcript course: lesson 032.
- Java Language Specification, Java SE 17.

