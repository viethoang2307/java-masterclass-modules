# 446 — FilteredList và SortedList

Wrap source `ObservableList` bằng `FilteredList`/`SortedList`; view tự phản ánh source. Comparator/filter thay đổi theo property có thể tạo refresh lớn, cần debounce nếu input nhanh.
