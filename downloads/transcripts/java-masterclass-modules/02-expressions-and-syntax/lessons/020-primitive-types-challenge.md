# 020 — Primitive types challenge

## Mục tiêu

Kết hợp declaration, literal suffix, arithmetic, promotion và output prediction trong một bài nhỏ.

## Đề bài

Khai báo:

- byte có giá trị 10;
- short có giá trị 20;
- int có giá trị 50;
- long bắt đầu từ 50,000 và cộng thêm 10 lần tổng ba biến.

## Lời giải có kiểm soát type

~~~java
public class PrimitiveChallenge {
    public static void main(String[] args) {
        byte byteValue = 10;
        short shortValue = 20;
        int intValue = 50;

        long total = 50_000L
                + 10L * (byteValue + shortValue + intValue);

        System.out.println(total); // 50,800
    }
}
~~~

Tính tay:

1. byteValue + shortValue + intValue = 10 + 20 + 50 = 80.
2. 10L * 80 = 800L.
3. 50,000L + 800L = 50,800L.

Dấu L làm ý định long rõ ràng và giúp tránh viết literal quá lớn như int.

## Phiên bản dễ debug hơn

~~~java
int sum = byteValue + shortValue + intValue;
long multiplier = 10L;
long base = 50_000L;
long total = base + multiplier * sum;
~~~

Phiên bản này dài hơn nhưng dễ đặt breakpoint và kiểm tra từng giá trị. Trong code thật, ưu tiên tính dễ đọc hơn một expression quá dài.

## Các lỗi muốn tự thử

~~~java
// long total = 50_000 + 10 * (byteValue + shortValue + intValue);
~~~

Đoạn trên vẫn compile vì kết quả còn nằm trong int range, nhưng ý định long kém rõ hơn. Nếu base vượt Integer.MAX_VALUE thì cần suffix L.

~~~java
// byte sum = byteValue + shortValue;
~~~

Đoạn này không compile vì arithmetic promotion tạo int. Hãy dùng int hoặc cast sau khi chứng minh range.

## Rubric tự chấm

- 2 điểm: khai báo đúng type.
- 2 điểm: dùng literal long đúng.
- 2 điểm: ra output 50,800.
- 2 điểm: giải thích vì sao tổng byte + short trở thành int.
- 2 điểm: tạo thêm test với giá trị khác và dự đoán trước.

## Mở rộng

Viết method nhận base, multiplier và ba số; trả về long. Sau đó thêm test cho trường hợp tổng bằng 0, số âm và giá trị gần giới hạn int.

## Nguồn

- Transcript course: lesson 020 và 501.
- Oracle: Primitive Data Types.

