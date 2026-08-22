# Lời giải Bài 10

Limit kiểm tra trước khi allocate/parse; streaming handler cần đếm byte và cancel khi vượt. Không tin `Content-Length` tuyệt đối vì chunked body.
