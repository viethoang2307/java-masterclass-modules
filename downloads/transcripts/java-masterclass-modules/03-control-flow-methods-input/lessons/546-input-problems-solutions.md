# 546 — Input Problems và Solutions

## Mục tiêu

Chẩn đoán lỗi input: token sai type, newline, EOF, invalid value và retry loop.

## Mental model

Input handling cần state machine: read → classify (EOF/valid/invalid) → act. Không lặp vô hạn khi invalid token vẫn còn trong buffer.

## Ví dụ Java 17

~~~java
static Integer readInt(Scanner scanner) {
    if (!scanner.hasNextLine()) return null;
    String line = scanner.nextLine().trim();
    try {
        return Integer.parseInt(line);
    } catch (NumberFormatException ex) {
        return null;
    }
}
~~~

## Lỗi thường gặp

- `hasNextInt()` false nhưng không consume invalid token.
- Không xử lý EOF.
- Retry vô hạn vì không thay đổi input state.

## Bài tập ngắn

Tạo input adapter trả về trạng thái VALID/INVALID/EOF; viết test bằng `Scanner` trên String.

## Interview prompt

Khác biệt giữa invalid input và end-of-input là gì về control flow?

## Nguồn

Transcript course lesson 546; ví dụ được chuẩn hóa theo Java 17 và giữ nguyên ý đồ của course.

