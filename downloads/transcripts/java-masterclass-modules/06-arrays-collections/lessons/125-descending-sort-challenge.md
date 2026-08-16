# 125. Descending sort challenge

## Primitive array

Arrays.sort(int[]) chỉ sort ascending. Để descending, có thể sort ascending rồi reverse in place.

~~~java
Arrays.sort(values);
for (int left = 0, right = values.length - 1; left < right; left++, right--) {
    int temp = values[left];
    values[left] = values[right];
    values[right] = temp;
}
~~~

## Object array và comparator

~~~java
Integer[] values = {4, 1, 9};
Arrays.sort(values, Comparator.reverseOrder());
~~~

Comparator phải total/consistent; không dùng phép trừ a - b nếu có thể overflow. Dùng Integer.compare(a, b).

## Contract

Challenge cần nói rõ mutate hay return copy, null handling, duplicate và ordering khi bằng nhau. “Sort descending” không đủ nếu caller cần stable tie-breaker.

## Bài tập

Viết descendingCopy(int[]) không sửa input. Thêm phiên bản object sort theo score giảm rồi name tăng.

## Pitfalls

Dùng Collections.reverse cho primitive array, comparator subtraction overflow và quên kiểm tra null trong object array.
