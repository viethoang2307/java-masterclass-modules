# 547 — Reading User Input Challenge

## Mục tiêu

Đọc đúng 10 số nguyên hợp lệ, bỏ qua token sai và không tính invalid token vào quota.

## Mental model

Quota thuộc về valid values, không phải số lần đọc. Loop phải tiếp tục tới khi đủ 10 hoặc EOF; mỗi token phải làm progress.

## Ví dụ Java 17

~~~java
static int[] readTenValid(String text) {
    Scanner scanner = new Scanner(text);
    int[] values = new int[10];
    int count = 0;
    while (count < values.length && scanner.hasNext()) {
        String token = scanner.next();
        try {
            values[count++] = Integer.parseInt(token);
        } catch (NumberFormatException ignored) {
            // invalid token is consumed and does not increment count
        }
    }
    return java.util.Arrays.copyOf(values, count);
}
~~~

## Lỗi thường gặp

- Tăng count trước khi parse.
- Không consume invalid token.
- Không quyết định behavior khi EOF trước 10 số.

## Bài tập ngắn

Viết self-check cho input `1 x 2 y ...`; verify đúng count, order và behavior EOF.

## Interview prompt

Progress measure của loop này là gì?

## Nguồn

Transcript course lesson 547; ví dụ được chuẩn hóa theo Java 17 và giữ nguyên ý đồ của course.

