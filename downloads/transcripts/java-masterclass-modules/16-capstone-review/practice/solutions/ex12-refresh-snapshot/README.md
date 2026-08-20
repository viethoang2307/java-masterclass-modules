# Lời giải — Concurrent refresh snapshot

Request ID là monotonic version. Response cũ không được ghi đè state mới; response mới được copy bằng `List.copyOf` để tách ownership. Độ phức tạp O(n) khi nhận snapshot mới.

