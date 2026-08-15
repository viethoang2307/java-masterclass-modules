# 248 — Pirate game — OOP integration

## Mục tiêu

Tích hợp composition, inheritance, interface, state và command loop trong mini game.

## Mental model

Game engine nên điều phối; Player/Weapon/Town giữ state riêng; interface capability như Lootable/Combatant giảm coupling.

## Ví dụ Java 17

~~~java
`interface Combatant { int attack(); }\nfinal class Pirate implements Combatant { private int health=100; public int attack(){return 10;} }`
~~~

## Lỗi thường gặp

- Game loop biết mọi field.
- Inheritance lẫn composition không có boundary.
- Randomness làm self-check flaky.

## Bài tập ngắn

Tạo deterministic combat round và test win/loss/loot.

## Interview prompt

Tách engine khỏi domain object như thế nào?

## Nguồn

Transcript course lesson 248; ví dụ được chuẩn hóa theo Java 17 và diễn giải theo hướng OOP design.

