# 105. Quản lý object composition và lifecycle

## Ownership và lifecycle

Một aggregate phải biết ai chịu trách nhiệm tạo, thay thế và đóng part. Nếu `PersonalComputer` tạo tất cả dependency bằng `new`, code nhanh lúc đầu nhưng khó thay hardware/test.

```java
final class PersonalComputer {
    private final ComputerCase computerCase;
    private final Monitor monitor;
    private final Motherboard motherboard;
    PersonalComputer(ComputerCase computerCase, Monitor monitor, Motherboard motherboard) {
        this.computerCase = Objects.requireNonNull(computerCase);
        this.monitor = Objects.requireNonNull(monitor);
        this.motherboard = Objects.requireNonNull(motherboard);
    }
    void powerUp() {
        computerCase.pressPowerButton();
        motherboard.loadProgram("OS");
        monitor.turnOn();
    }
}
```

Method `powerUp` là orchestration boundary. Caller không cần biết sequence chi tiết, nhưng sequence phải được test.

## Nếu part có state

State có thể thuộc aggregate nếu các part phải thay đổi atomically. Nếu monitor bật nhưng motherboard fail, cần policy rollback hoặc trạng thái `FAILED`; không nên giả vờ operation đã thành công.

## Bài tập

Tạo fake parts ghi lại event, test `powerUp` đúng thứ tự. Thêm failure ở motherboard và quyết định monitor có được bật không.

## Pitfalls

- Public setter cho mọi part làm mất invariant.
- Method orchestration trả void dù có failure quan trọng.
- Một class vừa quản lý hardware, vừa format UI, vừa log.
