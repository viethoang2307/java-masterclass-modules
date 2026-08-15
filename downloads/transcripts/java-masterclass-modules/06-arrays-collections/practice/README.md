# Practice — Module 06: Arrays và Collections

Mỗi bài có starter trong `code/` và lời giải tham khảo trong `solutions/`. Hãy chạy `SelfCheck`, đọc failure, sửa code rồi mới so sánh lời giải.

| Bài | Chủ đề | Độ khó | Kiến thức phủ |
|---:|---|---|---|
| 01 | Array Statistics | Medium | array, validation, one-pass aggregate |
| 02 | Reverse Copy | Medium | reference/value, defensive copy |
| 03 | Matrix Operations | Medium | 2D array, rectangular invariant |
| 04 | Varargs Summary | Medium | varargs, String joining |
| 05 | Grocery List | Medium | `ArrayList`, normalization, uniqueness |
| 06 | LinkedList Itinerary | Hard | ordered insert, `ListIterator` |
| 07 | Iterator Filter | Hard | safe removal during iteration |
| 08 | Boxing Ledger | Hard | boxing/unboxing, `List<Long>`, overflow |
| 09 | Enum Priority | Hard | enum state, comparator, switch |
| 10 | Card Deck | Hard | record, enum, deck invariant |
| 11 | Set Algebra | Hard | union/intersection/difference |
| 12 | Task Dedup | Hard | entity identity, `equals`/`hashCode`, map merge |
| 13 | TreeSet Seats | Very Hard | comparator consistency, navigation |
| 14 | HashMap Frequency | Very Hard | tokenization, `merge`, deterministic report |
| 15 | Compute Inventory | Very Hard | `compute`/`merge`, validation |
| 16 | NavigableMap Ranges | Very Hard | floor/ceiling/subMap |
| 17 | EnumMap Workflow | Very Hard | `EnumMap`, `EnumSet`, state transition |
| 18 | Immutable Catalog | Extreme | immutable model, defensive copies, indexes |
| 19 | Shopping Basket | Extreme | reservation, rollback, exact money |
| 20 | Collections Capstone | Extreme | List/Set/Map/enum/order/invariants |

## Lệnh chạy một bài

```powershell
cd solutions/ex01-array-statistics
javac --release 17 Main.java SelfCheck.java
java SelfCheck
```

## Chạy toàn bộ lời giải

```powershell
./verify-solutions.ps1
```

Verifier compile từng exercise trong thư mục tạm để các class `Main` không xung đột.
