# Lời giải Bài 16

Buffer capacity 2 dùng một lock và hai condition. `put` chờ `notFull`, `take` chờ `notEmpty`, đều dùng `while` để chống spurious wakeup. Sau mutation signal condition đối diện.

`await` nhả lock trong khi chờ và lấy lại trước khi tiếp tục; `finally` luôn unlock. Dùng `if` hoặc quên signal sẽ tạo mất wakeup/treo.
