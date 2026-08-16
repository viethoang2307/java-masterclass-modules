# 132. Multidimensional và jagged arrays

## Jagged model

~~~java
int[][] jagged = new int[3][];
jagged[0] = new int[]{1};
jagged[1] = new int[]{2, 3, 4};
jagged[2] = new int[0];
~~~

Mỗi row có length riêng. new int[3][] tạo outer array nhưng row vẫn null cho tới khi cấp phát.

## Khi jagged hữu ích

Jagged array phù hợp dữ liệu nhóm có kích thước khác nhau: lịch theo tháng, adjacency list đơn giản, scores theo người. Nếu domain cần matrix toán học, rectangular invariant rõ hơn.

## Traversal an toàn

~~~java
for (int[] row : jagged) {
    if (row == null) continue;
    for (int value : row) System.out.println(value);
}
~~~

## Bài tập

Tính tổng từng row, tổng toàn bộ và row dài nhất. Chọn contract cho null row: reject, skip hoặc xem là empty; test phải phản ánh lựa chọn.

## Pitfalls

Nhầm multidimensional array là contiguous memory, truy cập row null, và gọi deepToString khi muốn format từng row có rule riêng.
