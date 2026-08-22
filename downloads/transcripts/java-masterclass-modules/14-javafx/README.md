# Module 14 — JavaFX

Module này xây UI desktop có scene graph, layout, controls, event handling, observable/binding, dialogs, file chooser và background work. Practice tự check UI state/model thuần Java vì JavaFX runtime/dependency không được thêm vào convention javac-only; lesson có code JavaFX để chạy trong project đã cấu hình OpenJFX.

## Kết quả học tập

- hiểu `Application`, `Stage`, `Scene`, scene graph, `Node` và CSS;
- chọn layout pane, control, property/listener và event bubbling/capture;
- dùng `ObservableList`, `FilteredList`, `SortedList` và cell factory;
- thiết kế binding để UI phản ánh model mà không cập nhật thủ công rải rác;
- xây dialog/form validation, menu/context menu, key event và toolbar;
- dùng `Task`/`Service` cho I/O nền, cập nhật UI thread đúng cách;
- load/save file an toàn, format date, xử lý lỗi và accessibility;
- tách view/view-model/service và test logic không cần toolkit;
- lập kế hoạch Scene Builder/FXML và capstone To-do app.

## Lộ trình

| Bài | Trọng tâm |
|---|---|
| 435–440 | Application, stage/scene, layout, controls, event và binding |
| 441–446 | dialog, file I/O, observable list, bug fixing và model |
| 447–452 | cell factory, context menu, key event, sorted/filtered list |
| 453–458 | transform/effect, chooser, Scene Builder, FXML và architecture |
| 459–464 | background Task/Service, testing, accessibility, packaging, capstone |

## Practice

20 bài Java 17 không yêu cầu JavaFX runtime; bài kiểm tra state/model/validation/command contract deterministic. Khi học thực hành UI, thêm OpenJFX SDK/module-path theo platform và giữ business logic tái sử dụng từ practice.

```powershell
powershell -ExecutionPolicy Bypass -File .\practice\verify-solutions.ps1
```
