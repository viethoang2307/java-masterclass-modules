# 438 — Controls và ListView

Control như Button, TextField, Label, ListView có property/event. ListView hiển thị items và selection model; cell factory quyết định render từng row.

Không mutate list backing mà UI không observe; dùng `ObservableList` hoặc refresh rõ ràng.
