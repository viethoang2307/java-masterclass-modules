# 106. Smart Kitchen: nhiều dependency và policy

## Mục tiêu

Dùng composition để phối hợp `CoffeeMaker`, `Dishwasher`, `Refrigerator` mà không tạo hierarchy nhân tạo.

```java
interface Appliance {
    void turnOn();
    void turnOff();
}

final class SmartKitchen {
    private final Appliance coffeeMaker;
    private final Appliance dishwasher;
    SmartKitchen(Appliance coffeeMaker, Appliance dishwasher) {
        this.coffeeMaker = Objects.requireNonNull(coffeeMaker);
        this.dishwasher = Objects.requireNonNull(dishwasher);
    }
    void startMorningRoutine() {
        coffeeMaker.turnOn();
        dishwasher.turnOn();
    }
}
```

Interface ở đây biểu diễn capability, còn `SmartKitchen` là policy/orchestration. Hai appliance không cần là cùng một subclass.

## Failure và idempotency

`turnOn()` nên quy định gọi hai lần có an toàn không. Nếu không, routine phải đọc state hoặc operation trả `Result`. Khi một appliance fail, quyết định rõ có rollback appliance trước hay báo partial success.

## Bài tập

Viết `RoutineResult` gồm started appliances và failure reason. Test coffee success/dishwasher fail, rồi kiểm tra report deterministic.

## Lỗi thường gặp

- Kitchen truy cập field riêng của appliance.
- Interface chỉ là “god interface” với 20 method.
- Không document lifecycle của command.
