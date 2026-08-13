# 499 — byte, short, long và width

## Width và range

| Type | Width | Range gần đúng |
|---|---:|---:|
| byte | 8 bit | -128 đến 127 |
| short | 16 bit | -32,768 đến 32,767 |
| int | 32 bit | -2^31 đến 2^31 - 1 |
| long | 64 bit | -2^63 đến 2^63 - 1 |

Ví dụ kiểm tra bằng wrapper:

~~~java
System.out.println(Byte.MIN_VALUE);
System.out.println(Byte.MAX_VALUE);
System.out.println(Short.MIN_VALUE);
System.out.println(Long.MAX_VALUE);
~~~

## Overflow

~~~java
byte max = 127;
max++;
System.out.println(max); // -128
~~~

Overflow không ném exception tự động cho integer primitive. Vì vậy dữ liệu tiền, counter hoặc kích thước quan trọng cần được kiểm tra range.

## Literal và promotion

~~~java
long population = 8_000_000_000L;
byte a = 10;
byte b = 20;
int sum = a + b;
~~~

Arithmetic trên byte và short được promote lên int. Muốn gán về byte cần cast và phải chứng minh range:

~~~java
byte result = (byte) (a + b);
~~~

## Bài tập

Tạo overflow cho byte, in giới hạn của bốn integer type và giải thích vì sao byte + byte không có type byte.

## Nguồn

- Transcript course: lesson 499.
- Oracle: Primitive Data Types.

