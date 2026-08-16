# 144. Interactive navigation

## Tách input khỏi model

Console loop parse command; itinerary model xử lý transition; renderer in result. Tách ba layer giúp test navigation không cần Scanner.

~~~java
enum Command { NEXT, PREVIOUS, CURRENT, QUIT, UNKNOWN }
~~~

Parser nên trim/case-normalize và trả enum/result thay vì truyền raw string sâu vào domain.

## Boundary behavior

Document next ở cuối, previous ở đầu, current khi empty và quit có mutate state hay không. Có thể dùng Optional<String> cho current.

## Bài tập

Viết parser hỗ trợ N, P, C, Q và full words. Tạo fake input list, chạy loop deterministic và assert từng output/state.

## Lỗi thường gặp

Scanner đọc sai newline, parser mutate list, và game loop truy cập field private của itinerary.
