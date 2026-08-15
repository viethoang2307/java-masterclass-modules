# 114. Polymorphic cars

## Contract chung

```java
abstract class Car {
    private boolean engineOn;
    public final void startEngine() { engineOn = true; }
    public final boolean isEngineOn() { return engineOn; }
    public abstract void accelerate(int kmh);
}
```

Concrete cars implement acceleration khác nhau nhưng phải tôn trọng precondition: không nhận speed âm và chỉ accelerate khi engine on.

```java
final class ElectricCar extends Car {
    @Override public void accelerate(int kmh) {
        if (!isEngineOn() || kmh < 0) throw new IllegalStateException("cannot accelerate");
    }
}
```

`startEngine` là `final` để mọi car giữ invariant chung; `accelerate` là variation point.

## Consumer

```java
static void roadTrip(List<Car> cars) {
    for (Car car : cars) { car.startEngine(); car.accelerate(50); }
}
```

Không cần biết car là electric, gas hay hybrid. Bài tập: thêm `HybridCar`, test cùng road trip và quyết định exception/result contract khi battery thấp.

## Pitfalls

Base contract mơ hồ về state, subtype âm thầm ignore command, hoặc consumer dùng `instanceof` để gọi API đặc thù trong mọi vòng lặp đều là dấu hiệu thiết kế cần xem lại.
