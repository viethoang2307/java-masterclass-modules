# 436 — Stage, Scene và Node

Stage là window, Scene là root graph, Node là visual element. Một node chỉ có một parent; scene graph ownership rõ giúp tránh reparent lỗi.

```java
stage.setScene(new Scene(new StackPane(new Button("Save")), 640, 400));
stage.show();
```
