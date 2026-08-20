# 488 — Resources, reflection và module boundary

JPMS ảnh hưởng cả resource loading. `Class.getResource` và `Module.getResourceAsStream` có quy tắc visibility khác nhau; resource private nên được đọc từ module sở hữu nó.

```java
try (InputStream in = MyConfig.class.getResourceAsStream("/config/defaults.properties")) {
    if (in == null) throw new FileNotFoundException("defaults.properties");
}
```

## Reflection

Public class trong package exported vẫn không có nghĩa private field accessible. Cần `opens` đúng target module hoặc API reflection công khai.

## Debug checklist

1. Resource có thực sự nằm trong JAR/module output không?
2. Đường dẫn bắt đầu bằng `/` có đúng root không?
3. Code dùng class loader hay module API?
4. Framework có cần deep reflection không?
5. Có test chạy từ IDE nhưng không chạy từ modular JAR không?

## Thiết kế

Ưu tiên API explicit thay cho reflection. Nếu framework bắt buộc reflection, ghi package mở và test bằng packaged artifact, không chỉ test source tree.

