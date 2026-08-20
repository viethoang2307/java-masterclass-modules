# 443 — File chooser và disk I/O

FileChooser chạy UI interaction; đọc/ghi file là I/O có thể chậm nên đưa vào Task. Validate path, charset, size và atomic save.

Không block UI thread trong `Files.readString` với file lớn.
