# 512 — Ternary Operator

## Mục tiêu

Dùng conditional operator cho lựa chọn đơn giản và biết khi nào nên chuyển về `if/else` để dễ đọc.

## Mental model

Cú pháp `condition ? valueIfTrue : valueIfFalse` là expression nên có thể gán hoặc return. Hai nhánh cần có type tương thích.

## Ví dụ Java 17

~~~java
int age = 20;
String label = age >= 18 ? "adult" : "minor";
System.out.println(label);
~~~

## Lỗi thường gặp

- Lồng ternary quá sâu làm code khó audit.
- Quên rằng ternary produce value, không phải statement độc lập.
- Hai nhánh có type không hợp lệ hoặc gây boxing ngoài ý muốn.

## Bài tập ngắn

Viết hàm trả về `"EVEN"`/`"ODD"` bằng ternary; sau đó refactor bản lồng ternary thành if/else.

## Interview prompt

Nêu một ví dụ ternary cải thiện code và một ví dụ nên tránh.

## Nguồn

Transcript course lesson 512; ví dụ được chuẩn hóa theo Java 17 và giữ nguyên ý đồ của course.

