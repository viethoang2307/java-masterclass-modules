# 72 — Classes, Objects và Static/Instance

## Mục tiêu

Phân biệt class như blueprint, object như instance, state trong fields và behavior trong methods; nhận diện static member.

## Mental model

Một instance field có bản sao riêng cho mỗi object. Static field thuộc class và được chia sẻ. Instance method có thể đọc state của object; static method không có this và không được truy cập instance field trực tiếp.

## Ví dụ Java 17

~~~java
class Counter {
    private int value;
    private static int created;

    Counter(int value) {
        this.value = value;
        created++;
    }

    int increment() { return ++value; }
    static int createdCount() { return created; }
}
~~~

## Lỗi thường gặp

- Đặt mọi field static rồi vô tình share state giữa các object.
- Gọi instance method như static.
- Đọc field public trực tiếp làm mất invariant.

## Bài tập ngắn

Tạo hai Counter với giá trị khác nhau; chứng minh value độc lập nhưng created dùng chung.

## Interview prompt

Vì sao static method không thể dùng this?

## Nguồn

Transcript course lesson 72; code được chuẩn hóa theo Java 17, giữ ý đồ OOP của course.

