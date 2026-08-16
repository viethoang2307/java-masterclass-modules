# 120. Array: cấu trúc dữ liệu kích thước cố định

## Mental model

Array là vùng nhớ có số phần tử cố định, các phần tử cùng component type và truy cập bằng index từ 0 tới length - 1. length là field, không phải method.

~~~java
int[] scores = new int[3];
scores[0] = 8;
scores[1] = 9;
scores[2] = 10;
System.out.println(scores.length); // 3
~~~

Primitive array được zero-initialize (0, false, null character); reference array được khởi tạo bằng null. Đây là giá trị mặc định, không đồng nghĩa dữ liệu hợp lệ.

## Complexity

Index read/write là O(1). Tìm kiếm tuyến tính O(n). Vì size cố định, thêm phần tử cần tạo array mới và copy.

## Bounds và aliasing

~~~java
int[] a = {1, 2};
int[] b = a;
b[0] = 99;
System.out.println(a[0]); // 99
~~~

Hai variable có thể trỏ cùng array. scores[3] ném ArrayIndexOutOfBoundsException.

## Bài tập

Viết sum(int[]), xử lý null/rỗng theo contract rõ ràng, và test array âm, một phần tử, toàn số 0.

## Lỗi thường gặp

Nhầm length với length(), dùng <= array.length, và khởi tạo reference array nhưng quên tạo từng object con.
