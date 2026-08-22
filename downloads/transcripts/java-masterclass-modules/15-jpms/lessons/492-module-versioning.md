# 492 — Versioning và public module API

JPMS kiểm soát package boundary, nhưng không tự giải quyết semantic versioning. Module name nên ổn định; exported types là contract.

## API review

Trước release, diff:

- package thêm/bớt khỏi `exports`;
- method/constructor public thay đổi;
- type trong public signature đến từ dependency nào;
- `requires transitive` có làm lộ dependency mới không;
- service interface và provider behavior.

Đừng export class chỉ để test. Tách `testkit` hoặc dùng test module/qualified opens với scope rõ ràng.

## Compatibility

Một module có thể compile khi API còn đủ nhưng fail runtime do service/provider hoặc reflection. Compatibility matrix phải bao gồm compile, runtime, packaging và JDK range.

## Bài tập

Viết policy: breaking change nào yêu cầu đổi module version, change nào chỉ là implementation detail, evidence nào reviewer cần.

