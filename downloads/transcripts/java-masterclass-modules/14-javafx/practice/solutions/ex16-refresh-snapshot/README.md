# Lời giải Bài 16

Worker tạo immutable snapshot; UI thread `setAll` một lần. Không mutate ObservableList từ background thread và không append lại dữ liệu cũ.
