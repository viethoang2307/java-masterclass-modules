# 545 — Reading User Input

## Mục tiêu

Đọc input từ console bằng `Scanner`, hiểu token/line và đóng resource đúng lúc.

## Mental model

Scanner tokenize input. `nextInt()` để lại newline nên việc trộn với `nextLine()` cần consume newline hoặc dùng một chiến lược nhất quán.

## Ví dụ Java 17

~~~java
Scanner scanner = new Scanner(System.in);
System.out.print("Name: ");
String name = scanner.nextLine();
System.out.print("Age: ");
int age = Integer.parseInt(scanner.nextLine());
System.out.println(name + " / " + age);
~~~

## Lỗi thường gặp

- Trộn `nextInt()` và `nextLine()` mà quên newline.
- Gọi close trên Scanner gắn System.in quá sớm.
- Tin input luôn hợp lệ.

## Bài tập ngắn

Viết CLI đọc name/age bằng toàn bộ `nextLine()` rồi parse; test blank và invalid age.

## Interview prompt

Vì sao đọc mọi thứ bằng nextLine rồi parse thường dễ kiểm soát hơn?

## Nguồn

Transcript course lesson 545; ví dụ được chuẩn hóa theo Java 17 và giữ nguyên ý đồ của course.

