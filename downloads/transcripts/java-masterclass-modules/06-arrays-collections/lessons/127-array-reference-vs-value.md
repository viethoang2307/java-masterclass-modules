# 127. Array reference so với value semantics

## Điều thực sự được truyền vào method

Java truyền value của reference. Method nhận một bản copy reference nhưng vẫn trỏ tới cùng array object.

~~~java
static void changeFirst(int[] values) {
    values[0] = 99;
}
static void replace(int[] values) {
    values = new int[]{7, 7};
}
~~~

Sau changeFirst, caller thấy phần tử đổi; sau replace, caller vẫn giữ array cũ. Đây là khác biệt giữa mutate object và reassign local variable.

## Defensive copy

~~~java
static int[] safeCopy(int[] input) {
    if (input == null) throw new IllegalArgumentException("input");
    return Arrays.copyOf(input, input.length);
}
~~~

Dùng copy khi API muốn giữ ownership. Với nested array, copy outer array chưa đủ; cần deep copy từng row nếu row mutable.

## Bài tập

Viết class Matrix nhận int[][], test caller sửa outer array, row array và object có bị lộ hay không. Ghi rõ shallow/deep copy choice.

## Pitfalls

Nhầm Java pass-by-reference, trả internal array từ getter, và chỉ copy outer dimension của 2D array.
