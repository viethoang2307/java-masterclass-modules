# 249 — Pirate game final enhancements

## Mục tiêu

Hoàn thiện town/loot/combat flow, giữ invariant và report deterministic.

## Mental model

Capstone OOP cần state transition rõ, capability contracts, composition và test scenario. Randomness phải injectable hoặc seed cố định khi test.

## Ví dụ Java 17

~~~java
`final class Town { private final java.util.List<String> loot=new java.util.ArrayList<>(); void add(String x){loot.add(x);} }`
~~~

## Lỗi thường gặp

- Mutable collection leak.
- Combat update không atomic.
- Test phụ thuộc random default.

## Bài tập ngắn

Viết scenario nhiều turn với seed/fake RNG và snapshot report.

## Interview prompt

Dependency injection cho RNG giúp ích gì?

## Nguồn

Transcript course lesson 249; ví dụ được chuẩn hóa theo Java 17 và diễn giải theo hướng OOP design.

