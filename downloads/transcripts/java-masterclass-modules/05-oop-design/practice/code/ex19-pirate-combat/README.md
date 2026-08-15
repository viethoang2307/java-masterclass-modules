# Bài 19 — Pirate combat

**Độ khó:** Extreme

## Kiến thức phủ

capability interface, state, composition, deterministic scenario

## Đề bài

Combatant có name, attack(), takeDamage(), alive(). Pirate validates health/attack. fight(a,b) đánh luân phiên đến khi một bên chết, trả winner name.

## Input/output mẫu

~~~text
Pirate("A",10,30) vs Pirate("B",3,25) -> A
~~~

## Tiêu chí hoàn thành

- Compile bằng javac --release 17.
- Implement đúng class/interface/method contract mà SelfCheck sử dụng.
- Enforce invariant ở constructor hoặc command boundary.
- Consumer không được phụ thuộc concrete type khi đề yêu cầu abstraction.

## Cách chạy

~~~powershell
javac --release 17 Main.java SelfCheck.java
java SelfCheck
java Main
~~~

Starter có TODO có chủ đích. Làm bài trong code trước khi xem solutions.

