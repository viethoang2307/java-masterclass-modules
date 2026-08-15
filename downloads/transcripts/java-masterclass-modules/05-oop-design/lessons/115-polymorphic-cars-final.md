# 115. Cars challenge: hoàn thiện hierarchy

## Thiết kế challenge

Viết invariant cho engine state, fuel/battery, range và speed trước khi code. Nếu capability là điều quan trọng, interface có thể nhỏ hơn abstract class:

```java
record DriveResult(int distanceKm, int remainingEnergy) {}
interface Drivable { DriveResult drive(int distanceKm); }
```

## Failure semantics

`drive(10)` khi còn 5 km range nên trả result lỗi hoặc ném exception đã document. Không trừ energy trước rồi mới phát hiện thiếu range. Mọi failure phải giữ state cũ.

## Test matrix

Test engine off, distance zero/âm, đủ và thiếu energy, nhiều subtype qua cùng interface và failure không làm state drift.

## Design review

So sánh một class với `fuelType`, abstract `Car` và composition `Car + EnergySource`. Chọn dựa vào variation có ổn định không và energy source có thay thế được không.

## Bài tập

Viết `TripPlanner` chỉ phụ thuộc `Drivable`, inject fake car để test mà không cần battery thật.
