# Lesson 293 — Boundaries và Anchors

## Mục tiêu

Dùng ^/$, \A/\z, \b và lookaround để kiểm soát vị trí match.

## Mental model

^/$ có behavior theo MULTILINE; \A/\z là absolute input boundaries. Lookahead kiểm tra điều kiện mà không consume ký tự.

## Ví dụ Java 17

~~~java
Pattern whole = Pattern.compile("^(?=.*[A-Z])(?=.*\\d)[A-Za-z\\d]{8,}$");
boolean valid = whole.matcher("Java2026").matches();
~~~

## Phân tích

Lookahead hữu ích cho password policy nhưng regex dài khó maintain. Đừng log password/input nhạy cảm trong debug.

## Complexity và contract

Pattern matching thường O(n), nhưng lookaround/backtracking cần benchmark input xấu.

Ghi rõ encoding, resource ownership, path trust boundary, exception type và cleanup policy.

## Lỗi thường gặp

- Catch Exception rồi bỏ mất context hoặc cause.
- Quên đóng Stream/Reader/Writer/DirectoryStream.
- Nối path bằng String hoặc tin vào exists trước operation.
- Dùng regex quá rộng cho dữ liệu user-controlled.

## Bài tập

Viết password policy không chứa whitespace, có upper/lower/digit; test boundary và message lỗi theo rule.

