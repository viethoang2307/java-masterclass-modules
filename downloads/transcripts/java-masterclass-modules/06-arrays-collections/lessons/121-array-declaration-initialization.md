# 121. Khai báo và khởi tạo array

## Ba dạng phổ biến

~~~java
int[] first = new int[4];
int[] second = {10, 20, 30};
int[] third = new int[]{4, 5, 6};
~~~

Dạng initializer ngắn chỉ dùng ở declaration hoặc new int[]{...} khi assignment sau đó. int[] values; mới chỉ khai báo reference, chưa có array object.

## Reference array

~~~java
String[] names = new String[2];
names[0] = "An";
names[1] = "Binh";
~~~

Mỗi slot ban đầu là null. Với Person[], cần new Person(...) cho từng slot trước khi gọi method; nếu không sẽ gặp NullPointerException.

## API boundary

API nhận array cần quyết định null có hợp lệ không. Nếu không, fail sớm bằng IllegalArgumentException. Array rỗng là input hợp lệ hay không phải ghi rõ riêng, vì null và empty có semantics khác.

## Bài tập

Tạo String[] có 5 slot, populate bằng loop, đếm null và viết method trả defensive copy. Test caller sửa copy không ảnh hưởng original.

## Pitfalls

Khai báo new int[0] rồi truy cập index, dùng array covariance sai (String[] là Object[] nhưng có thể ném ArrayStoreException), và quên array có immutable length.
