# 435 — JavaFX application lifecycle

`Application.launch` creates toolkit, calls `init`, then `start(Stage)`, and later `stop`. UI scene graph belongs to JavaFX Application Thread.

Không tạo Stage trong background thread; `init` không phải UI thread. Cleanup executor/file resource trong `stop`.
