# 248. Pirate game: mô hình hóa entity và action

## Tách state khỏi action

```java
final class Pirate {
    private int health;
    private final Weapon weapon;
    Pirate(int health, Weapon weapon) {
        if (health <= 0) throw new IllegalArgumentException("health");
        this.health = health; this.weapon = Objects.requireNonNull(weapon);
    }
    boolean attack(Pirate target) {
        Objects.requireNonNull(target);
        if (health <= 0) return false;
        target.takeDamage(weapon.damage());
        return true;
    }
    private void takeDamage(int damage) { health = Math.max(0, health - damage); }
}
```

Pirate giữ invariant health không âm; combat service không được sửa field trực tiếp.

## Randomness

Không tạo `new Random()` rải trong action nếu muốn test. Inject `Random` hoặc `DamagePolicy`; self-check dùng seed/fake deterministic.

## Bài tập

Thêm `Weapon` interface, sword/gun implementations và battle result. Test dead attacker, dead target, zero damage và deterministic critical hit.
