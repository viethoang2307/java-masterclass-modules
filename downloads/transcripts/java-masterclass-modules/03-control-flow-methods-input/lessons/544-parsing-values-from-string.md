# 544 — Parsing Values from a String

## Mục tiêu

Chuyển textual input thành primitive bằng wrapper parse methods và xử lý `NumberFormatException`.

## Mental model

Parsing là boundary giữa untrusted text và typed domain. Parse một lần, validate ngay sau đó, đừng để String đi sâu vào business logic nếu không cần.

## Ví dụ Java 17

~~~java
static Integer parseScore(String text) {
    try {
        int score = Integer.parseInt(text.trim());
        return score >= 0 && score <= 100 ? score : null;
    } catch (NumberFormatException ex) {
        return null;
    }
}
~~~

## Lỗi thường gặp

- Không trim input.
- Catch exception quá rộng rồi che lỗi lập trình.
- Parse xong không validate range.

## Bài tập ngắn

Viết parser cho int, long và double; trả về optional-like result bằng null hoặc record đơn giản.

## Interview prompt

Khi nào exception là control flow chấp nhận được ở CLI boundary?

## Nguồn

Transcript course lesson 544; ví dụ được chuẩn hóa theo Java 17 và giữ nguyên ý đồ của course.

