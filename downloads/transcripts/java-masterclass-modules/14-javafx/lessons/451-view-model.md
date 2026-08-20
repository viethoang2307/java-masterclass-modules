# 451 — View-model architecture

View bind properties và phát command; view-model giữ observable state; service xử lý use case. Tách ba lớp giúp test logic không cần toolkit.

```text
View <-> ViewModel -> Service -> Repository
```
