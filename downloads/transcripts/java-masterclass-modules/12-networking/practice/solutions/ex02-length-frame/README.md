# Lời giải Bài 02

Length prefix dùng big-endian explicit; parser phải kiểm tra length trước allocate. TCP read có thể chia header/body, nên production cần accumulator chứ không `read` một lần.
