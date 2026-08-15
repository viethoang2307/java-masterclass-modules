# 104. Computer composition: thiết kế parts và orchestration

## Domain model

```java
final class Monitor {
    private final String model;
    Monitor(String model) { this.model = require(model); }
    void turnOn() { System.out.println(model + " monitor on"); }
    private static String require(String value) {
        if (value == null || value.isBlank()) throw new IllegalArgumentException("model");
        return value.strip();
    }
}

final class Computer {
    private final Monitor monitor;
    Computer(Monitor monitor) { this.monitor = Objects.requireNonNull(monitor); }
    void start() { monitor.turnOn(); }
}
```

`Computer` orchestrates startup; `Monitor` chịu trách nhiệm behavior của monitor. Đây là delegation, không phải inheritance.

## Constructor injection

Nhận `Monitor` từ ngoài giúp test:

```java
final class RecordingMonitor extends Monitor {
    boolean started;
    RecordingMonitor() { super("fake"); }
    @Override void turnOn() { started = true; }
}
```

Trong code production, có thể dùng interface `Display` nếu nhiều loại monitor không có shared implementation.

## Câu hỏi thiết kế

- Computer có sở hữu lifecycle của monitor hay chỉ dùng monitor shared?
- Có được thay monitor sau constructor không?
- `start()` có cần idempotent không?

## Bài tập

Thêm `Motherboard`, `Keyboard`, `PowerSupply` và viết startup sequence. Test thứ tự bằng recording fakes, không phụ thuộc console timing.

## Pitfalls

- Part tự tìm dependency bằng `new` bên trong, làm test khó.
- Computer biết quá nhiều chi tiết internals của parts.
- State startup nửa vời nhưng không có transition contract.
