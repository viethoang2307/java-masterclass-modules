# 514 — First Steps Summary

## Mục tiêu

Tổng hợp workflow đầu tiên: khai báo state, tính expression, rẽ nhánh và in output có contract rõ.

## Mental model

Một chương trình nhỏ vẫn nên có input, transformation và output. Đặt tên biến thể hiện domain; xác định boundary trước khi viết condition.

## Ví dụ Java 17

~~~java
int score = 82;
String result;
if (score >= 80) {
    result = "distinction";
} else if (score >= 50) {
    result = "pass";
} else {
    result = "fail";
}
System.out.println(result);
~~~

## Lỗi thường gặp

- Không định nghĩa behavior cho input ngoài range.
- Trộn parsing, business rule và output vào một expression khó test.
- Không ghi output contract khiến SelfCheck mong đợi khác nhau.

## Bài tập ngắn

Viết mini score classifier với 5 boundary tests và một output contract duy nhất.

## Interview prompt

Bạn sẽ tách phần nào thành method khi chương trình lớn dần?

## Nguồn

Transcript course lesson 514; ví dụ được chuẩn hóa theo Java 17 và giữ nguyên ý đồ của course.

