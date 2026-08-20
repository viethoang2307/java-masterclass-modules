# Bài 03 — Package visibility (Medium)

Implement `isExported(packageName, exports)`. JPMS export theo package exact: export `com.acme.api` không làm `com.acme.api.internal` trở thành public.

Xử lý input null an toàn và không tự suy diễn parent/child package. Đây là contract nền cho các bài graph sau.

