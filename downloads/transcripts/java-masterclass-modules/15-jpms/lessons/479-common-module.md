# 479 — Xây Common module

Common module nên chứa model hoặc interface được nhiều module sử dụng, không nên trở thành “sọt rác” chứa mọi tiện ích.

```java
module com.acme.common {
    exports com.acme.common.api;
}
```

```java
package com.acme.common.api;

public record TrackId(long value) {
    public TrackId {
        if (value <= 0) throw new IllegalArgumentException("positive id required");
    }
}
```

## API boundary

Record/value object ở API cần immutable và có invariant rõ. Utility chỉ export nếu consumer thực sự cần. Package `com.acme.common.internal` giữ private để có quyền refactor.

## Compile

Compile common trước để các module sau dùng module path. Nếu common không có dependency, đây là leaf node tốt để bắt đầu migration.

## Bài tập

Chọn ba class từ ứng dụng Music Library, phân loại thành API, internal hoặc nên chuyển sang module khác. Giải thích vì sao export của common không nên bao gồm mọi package.

