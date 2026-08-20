# Lời giải — Automatic module name

Sau khi bỏ extension, regex loại suffix version số ở cuối. Các ký tự phân cách được chuẩn hóa thành dấu chấm và lower-case. Đây là heuristic O(n); tên manifest `Automatic-Module-Name` vẫn có độ tin cậy cao hơn.

