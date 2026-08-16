# 122. Populate, loop và search trong array

## Populate bằng index

~~~java
int[] values = new int[5];
for (int i = 0; i < values.length; i++) {
    values[i] = (i + 1) * 10;
}
~~~

Dùng index khi cần ghi hoặc biết vị trí; enhanced for phù hợp đọc toàn bộ value. Thay đổi biến primitive value không thay phần tử array; với object array, biến là reference copy nên mutation object có thể quan sát được.

## Linear search

~~~java
static int indexOf(int[] values, int target) {
    for (int i = 0; i < values.length; i++) {
        if (values[i] == target) return i;
    }
    return -1;
}
~~~

Contract -1 phải được document; caller không được dùng kết quả như index nếu chưa kiểm tra. Tìm occurrence đầu tiên khác với tìm occurrence cuối.

## Complexity và test

Linear search O(n), không yêu cầu array sort. Test target ở đầu/cuối, duplicate, không có và empty array. Nếu search nhiều lần trên dữ liệu ổn định, cân nhắc sort + binary search hoặc Set.

## Lỗi thường gặp

Return trong loop sai vị trí, dùng <=, và nhầm tìm kiếm tuyến tính với binary search khi input chưa sort.
