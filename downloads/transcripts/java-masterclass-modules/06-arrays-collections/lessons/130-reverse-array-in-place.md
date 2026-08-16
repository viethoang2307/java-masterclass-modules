# 130. Reverse array in place

## Two-pointer pattern

~~~java
static void reverse(int[] values) {
    if (values == null) throw new IllegalArgumentException("values");
    for (int left = 0, right = values.length - 1; left < right; left++, right--) {
        int temp = values[left];
        values[left] = values[right];
        values[right] = temp;
    }
}
~~~

Mỗi vòng swap hai đầu rồi thu hẹp khoảng chưa xử lý. Array length chẵn và lẻ đều dừng đúng ở giữa.

## In-place versus copy

In-place đạt O(1) extra space nhưng mutate caller. Nếu API không được mutate, tạo reverseCopy với O(n) space. Tên method nên nói rõ semantics: reverseInPlace và reversedCopy dễ đọc hơn reverse chung chung.

## Bài tập

Test empty, one element, even, odd, duplicate và alias reference. Viết cả hai phiên bản và chứng minh khác biệt ownership.

## Pitfalls

Loop điều kiện sai làm swap lại, dùng temp không đúng, và mutate input dù README yêu cầu giữ nguyên.
