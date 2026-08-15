# 102 — StringBuilder và output pipeline

## Mục tiêu

Dùng StringBuilder trong loop và quy tắc separator không trailing delimiter.

## Mental model

StringBuilder mutable buffer; domain methods có thể build output rồi return String ở boundary.

## Ví dụ Java 17

~~~java
`StringBuilder b=new StringBuilder(); for(int i=0;i<3;i++){if(i>0)b.append(',');b.append(i);} String out=b.toString();`
~~~

## Lỗi thường gặp

- Trailing comma.
- Trả builder ra ngoài.
- Concat String trong loop lớn.

## Bài tập ngắn

Viết CSV builder cho danh sách object.

## Interview prompt

Complexity của concat trong loop khác builder thế nào?

## Nguồn

Transcript course lesson 102; ví dụ được chuẩn hóa theo Java 17 và diễn giải theo hướng OOP design.

