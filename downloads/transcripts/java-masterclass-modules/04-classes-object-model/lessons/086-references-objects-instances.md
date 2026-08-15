# 86 — References, Objects và Instances

## Mục tiêu

Phân biệt reference variable với object; hiểu aliasing, null và việc assignment reference không copy object.

## Mental model

new tạo object trên heap, variable giữ reference. Hai variable có thể trỏ cùng object; mutation qua một reference nhìn thấy qua reference kia.

## Ví dụ Java 17

~~~java
final class Box {
    int value;
    Box(int value) { this.value = value; }
}
Box first = new Box(10);
Box alias = first;
alias.value = 20;
System.out.println(first.value); // 20
~~~

## Lỗi thường gặp

- Tưởng gán object là deep copy.
- Gọi method trên null.
- So sánh object reference bằng == rồi kết luận value equality.

## Bài tập ngắn

Vẽ diagram cho first/alias và viết method copy để tạo object độc lập.

## Interview prompt

Java truyền object theo reference hay pass-by-value? Trả lời chính xác theo semantics Java.

## Nguồn

Transcript course lesson 86; code được chuẩn hóa theo Java 17, giữ ý đồ OOP của course.

