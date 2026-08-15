# 224. `EnumSet` và `EnumMap`

## Mục tiêu

- Tận dụng collection chuyên biệt cho enum.
- Biểu diễn flags và bảng tra cứu enum hiệu quả, type-safe.

```java
enum Day { MON, TUE, WED, THU, FRI, SAT, SUN }

EnumSet<Day> weekend = EnumSet.of(Day.SAT, Day.SUN);
EnumSet<Day> weekdays = EnumSet.complementOf(weekend);

EnumMap<Day, Integer> capacity = new EnumMap<>(Day.class);
capacity.put(Day.MON, 20);
```

`EnumSet` lưu compact bit vector và iterate theo declaration order. `EnumMap` giữ key theo enum declaration order. Cả hai không nhận `null` key/element.

## Factory hữu ích

- `allOf`, `noneOf`, `of`, `range`, `complementOf`, `copyOf`.
- `new EnumMap<>(MyEnum.class)` khi map ban đầu rỗng.

## Lỗi thường gặp

- Dùng raw integer bitmask làm mất type safety.
- Nghĩ order là insertion order.
- `EnumSet.copyOf(emptyCollection)` không suy ra được enum type.

## Bài tập ngắn

Mô hình hóa role permissions bằng `EnumMap<Role, EnumSet<Permission>>` và defensive copy.

## Interview prompt

Vì sao enum-specific collections thường tốt hơn hash collection trong trường hợp này?

## Nguồn

- Transcript bài 224.
- Java 17 API: `EnumSet`, `EnumMap`.
