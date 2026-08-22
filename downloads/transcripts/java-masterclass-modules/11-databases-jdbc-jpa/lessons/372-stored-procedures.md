# 372 — Stored procedure và function

Procedure phù hợp khi logic gần data, cần nhiều statement/permission ở DB hoặc legacy contract. Function thường trả value dùng trong expression. Cả hai cần tài liệu rõ input/output, null và error code.

`CallableStatement` có thể trả nhiều result/update count; đọc theo vendor contract. INOUT cần bind giá trị trước và register output sau.

## Trade-off

Logic DB giảm round-trip nhưng khó version/test đa môi trường hơn Java. Chọn based on latency, ownership và operational skill, không theo thói quen.

## Bài tự luyện

Thiết kế contract procedure `reserve_stock(IN item_id, IN qty, OUT remaining, OUT status)` và map status thành domain result.
