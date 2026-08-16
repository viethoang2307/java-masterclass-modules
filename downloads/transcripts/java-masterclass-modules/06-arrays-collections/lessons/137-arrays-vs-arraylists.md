# 137. Arrays so với ArrayList

## So sánh contract

Array có length cố định, primitive support, overhead thấp và index nhanh. ArrayList là List mutable có size động, generic type, rich methods và boxing khi chứa primitive wrapper.

~~~java
int[] primitive = new int[10];
List<Integer> boxed = new ArrayList<>();
boxed.add(10); // boxing int -> Integer
~~~

## Chọn theo operation

Dữ liệu fixed-size và tight loop: array. Cần add/remove, API collection, generic method hoặc size thay đổi: ArrayList. Cần uniqueness/order khác: chọn Set/Queue thay vì ép ArrayList.

## Bài tập

Viết cùng một report bằng array và ArrayList, ghi khác biệt mutation, null, duplicate, resize và memory semantics. Đừng kết luận performance chỉ bằng một benchmark nhỏ.

## Pitfalls

Dùng ArrayList chỉ vì quen tay, quên boxing, hoặc convert qua lại nhiều lần không cần thiết.
