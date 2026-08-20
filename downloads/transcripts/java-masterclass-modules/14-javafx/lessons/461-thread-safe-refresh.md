# 461 — Thread-safe refresh

Background load tạo immutable snapshot; callback UI thread replace list một lần. Không mutate ObservableList từ worker thread.
