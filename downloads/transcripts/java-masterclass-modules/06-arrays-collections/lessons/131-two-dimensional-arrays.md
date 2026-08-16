# 131. Two-dimensional arrays

## Array of arrays

Java 2D array thực chất là array chứa các row array. Nó có thể rectangular hoặc jagged; không phải một block bắt buộc có cùng length.

~~~java
int[][] matrix = {
    {1, 2, 3},
    {4, 5, 6}
};
for (int row = 0; row < matrix.length; row++) {
    for (int col = 0; col < matrix[row].length; col++) {
        System.out.println(matrix[row][col]);
    }
}
~~~

## Rectangular invariant

Nếu thuật toán cần transpose hoặc matrix multiplication, validate mọi row cùng length trước. Không giả định matrix[0] tồn tại khi input rỗng.

## Copy

Arrays.copyOf(matrix, matrix.length) chỉ copy outer array; row bên trong vẫn shared. Deep copy cần copy từng row.

## Bài tập

Implement transpose rectangular matrix, row sums và deepCopy. Test null row, empty matrix, jagged input và caller mutate row sau copy.

## Lỗi thường gặp

Dùng matrix[0].length cho jagged array, đảo row/column, và để NullPointerException thay vì validation rõ.
