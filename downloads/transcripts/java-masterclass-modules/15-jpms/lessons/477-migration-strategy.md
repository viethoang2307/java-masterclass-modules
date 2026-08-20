# 477 — Chiến lược migration từ classpath

Modularization là thay đổi kiến trúc, không nên làm trong một commit khổng lồ.

## Các bước an toàn

1. Freeze build hiện tại và ghi lại JDK, classpath, test command.
2. Chạy `jdeps` để tạo dependency inventory.
3. Xử lý split package và tên module trước.
4. Modularize leaf module ít dependency nhất.
5. Thêm descriptor tối thiểu, compile module path.
6. Chuyển từng consumer, chạy test sau mỗi bước.
7. Đóng gói và kiểm tra runtime image.

## Compatibility matrix

Ghi rõ JDK tối thiểu, thư viện có descriptor/automatic/legacy, chạy trên classpath hay module path, và API reflection nào cần `opens`. Một dự án có thể chạy hybrid trong thời gian chuyển tiếp, nhưng phải biết phần nào chưa được strong encapsulation.

## Cạm bẫy

- Chuyển tất cả JAR sang module path cùng lúc.
- Dùng `--add-opens` trong production mà không có issue owner.
- Chỉ kiểm tra compile, bỏ qua `ServiceLoader`, resource và reflection lúc runtime.

## Deliverable

Mỗi migration step cần command tái lập, diff descriptor, test evidence và rollback plan.

