# 249. Pirate game final: integration và review

## Integration boundary

Game loop đọc command, domain model xử lý action, renderer in result. Ba phần không nên trộn trong một class:

```text
Input command → GameService → Pirate/Weapon state → BattleResult → Renderer
```

`BattleResult` nên immutable và chứa attacker, defender, damage, remaining health, reason. Không trả message tự do từ domain nếu UI có thể cần nhiều format.

## Review checklist

Kiểm tra invariant ở constructor/command, dependency injection cho random/clock, interface nhỏ cho weapon, failure không mutate sai, immutable result và report deterministic.

## Bài tập capstone

Thêm inventory bằng `Map<String,Weapon>`, command `equip`, sealed `GameEvent` và replay log. Viết self-check replay cùng seed cho cùng event sequence.

## Kết luận

OOP design tốt không nằm ở số lượng class. Nó nằm ở boundary: ai sở hữu state, ai được thay đổi state, contract nào được expose và thay đổi mới đi qua abstraction nào.
