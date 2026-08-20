# Lesson 318 — Copy, Move và Delete

## Mục tiêu

Chọn StandardCopyOption, ATOMIC_MOVE, REPLACE_EXISTING; hiểu operation failure và cleanup.

## Mental model

Files.copy/move/delete là filesystem operations. ATOMIC_MOVE có thể không supported; fallback phải explicit và không giả vờ atomic.

## Ví dụ Java 17

~~~java
Files.move(temp, target, StandardCopyOption.REPLACE_EXISTING,
    StandardCopyOption.ATOMIC_MOVE);
~~~

## Phân tích

delete non-empty directory fail; move giữa filesystem có semantics khác. Không xóa path user-controlled khi chưa resolve boundary.

## Complexity và contract

Mỗi operation phụ thuộc filesystem; tree copy O(entries + bytes).

Ghi rõ encoding, resource ownership, path trust boundary, exception type và cleanup policy.

## Lỗi thường gặp

- Catch Exception rồi bỏ mất context hoặc cause.
- Quên đóng Stream/Reader/Writer/DirectoryStream.
- Nối path bằng String hoặc tin vào exists trước operation.
- Dùng binary/text API không khớp format hoặc charset.

## Bài tập

Viết safeReplace dùng temp + move, test target cũ, missing source và cleanup khi move fail.

