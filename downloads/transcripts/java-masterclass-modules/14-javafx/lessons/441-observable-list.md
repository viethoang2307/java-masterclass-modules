# 441 — ObservableList

`ObservableList` phát change events cho add/remove/replace; listener nên xử lý change cursor đúng, không giả định một event = một item.

Model collection và UI list cần ownership rõ; batch update có thể dùng `setAll` để giảm churn.
