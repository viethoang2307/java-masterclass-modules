# 017 — Primitive types và wrapper classes

## Mục tiêu

Nhớ được 8 primitive types, hiểu giới hạn của int và biết wrapper class dùng để làm gì.

## Tám primitive types

| Nhóm | Types | Ý nghĩa |
|---|---|---|
| Số nguyên | byte, short, int, long | số nguyên có dấu |
| Số thực | float, double | số dấu phẩy động |
| Ký tự | char | một UTF-16 code unit |
| Logic | boolean | true hoặc false |

Primitive là giá trị cơ bản của ngôn ngữ, không phải object. Java có wrapper tương ứng:

| Primitive | Wrapper |
|---|---|
| byte | Byte |
| short | Short |
| int | Integer |
| long | Long |
| float | Float |
| double | Double |
| char | Character |
| boolean | Boolean |

## Giới hạn của int

~~~java
public class IntegerRangeDemo {
    public static void main(String[] args) {
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.SIZE);      // 32 bits
        System.out.println(Integer.BYTES);     // 4 bytes
    }
}
~~~

Wrapper class cung cấp hằng số và utility method. Ví dụ Integer.parseInt chuyển text sang int:

~~~java
int quantity = Integer.parseInt("42");
System.out.println(quantity + 1); // 43
~~~

Nếu chuỗi không phải số hợp lệ, parseInt ném NumberFormatException. Đây là lỗi runtime, không phải lỗi compile.

## Khi nào dùng wrapper?

- Collection generic như List<Integer> không nhận primitive trực tiếp.
- Cần biểu diễn “không có giá trị” bằng null.
- Cần method/hằng số của wrapper.
- Dữ liệu đi qua framework, serialization hoặc API object.

Auto-boxing/unboxing làm code ngắn hơn nhưng vẫn có rủi ro:

~~~java
Integer boxed = 10; // boxing
int primitive = boxed; // unboxing

Integer missing = null;
// int crash = missing; // NullPointerException khi unboxing
~~~

## Bài tập

1. In MIN_VALUE và MAX_VALUE của Integer, Long, Byte.
2. Parse một chuỗi số hợp lệ và một chuỗi sai.
3. Viết ví dụ cho thấy unboxing null gây lỗi.

## Nguồn

- Transcript course: lesson 017 và 498.
- Oracle: Primitive Data Types và Java API class Integer.

