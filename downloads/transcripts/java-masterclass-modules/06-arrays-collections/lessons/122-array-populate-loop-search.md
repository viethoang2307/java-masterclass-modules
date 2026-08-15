# 122 — Populate, loop và search arrays

## Mục tiêu

Duyệt array bằng indexed/enhanced for và linear search.

## Mental model

Indexed loop cần vị trí; enhanced for đọc value nhưng không thay trực tiếp element primitive.

## Ví dụ Java 17

~~~java
static int indexOf(int[] a,int target){for(int i=0;i<a.length;i++)if(a[i]==target)return i;return -1;}
~~~

## Lỗi thường gặp

- Enhanced for assignment không đổi array.
- Không xử lý null.
- Return 0 khi không tìm thấy.

## Bài tập ngắn

Implement count/find/replace với boundary tests.

## Interview prompt

Linear search complexity?

## Nguồn

Transcript course lesson 122; ví dụ được chuẩn hóa Java 17 và bổ sung contract, complexity, boundary cases.
