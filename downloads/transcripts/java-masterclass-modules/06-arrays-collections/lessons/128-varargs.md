# 128. Varargs: cú pháp tiện lợi nhưng vẫn là array

## Runtime model

~~~java
static int sum(int... values) {
    int total = 0;
    for (int value : values) total += value;
    return total;
}

sum(1, 2, 3);
sum(new int[]{1, 2, 3});
~~~

Varargs compile thành array. Method chỉ nhận một varargs parameter; nó phải là parameter cuối cùng. Caller có thể truyền zero arguments, nên empty case phải có contract.

## Overload và null

Overload với varargs dễ mơ hồ. Gọi sum((int[]) null) tạo null array, khác với sum() tạo array rỗng; quyết định có reject null không. Không dùng varargs cho API cần performance cực cao trong loop nóng nếu allocation đáng kể.

## Bài tập

Viết summarize(String separator, String... values), trim value, bỏ blank, trả count/text và test zero args, explicit array, null array.

## Pitfalls

Quên varargs có thể null, đặt parameter sau varargs, và overload khiến compiler không chọn được method.
