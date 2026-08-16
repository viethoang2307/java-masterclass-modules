# 224. EnumSet và EnumMap

## Collection chuyên biệt

~~~java
enum Day { MON, TUE, WED, THU, FRI, SAT, SUN }

EnumSet<Day> weekend = EnumSet.of(Day.SAT, Day.SUN);
EnumSet<Day> weekdays = EnumSet.complementOf(weekend);
EnumMap<Day, Integer> capacity = new EnumMap<>(Day.class);
~~~

EnumSet type-safe và compact; EnumMap dùng enum key, iterate declaration order và tránh hash overhead. Cả hai không nhận null key/element.

## Dùng cho flags/state

EnumSet phù hợp permissions/active days. EnumMap phù hợp bảng config/count theo enum. Nếu enum set rỗng và dùng copyOf collection, cần type information bằng noneOf(Class).

## Bài tập

Mô hình role→permissions bằng EnumMap<Role, EnumSet<Permission>>, defensive copy và test union/intersection.

## Pitfalls

Dùng raw int bitmask, nhầm order là insertion order và dùng ordinal làm persisted value.
