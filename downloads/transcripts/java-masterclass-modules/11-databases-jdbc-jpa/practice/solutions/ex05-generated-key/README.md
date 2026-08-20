# Lời giải Bài 05

Insert thành công nhưng thiếu generated key là infrastructure contract failure, không nên trả id giả hoặc dùng `max(id)+1`. Integration test cần kiểm driver thật vì key type/vendor behavior khác nhau.
