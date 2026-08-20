# 337 — Atomic variables

Nhóm `java.util.concurrent.atomic` dùng compare-and-set (CAS) để cập nhật lock-free trong nhiều case đơn giản.

```java
AtomicInteger sequence = new AtomicInteger();
int id = sequence.incrementAndGet();
AtomicReference<State> state = new AtomicReference<>(State.NEW);
state.compareAndSet(State.NEW, State.RUNNING);
```

CAS là “nếu value vẫn là expected thì đổi sang update, nếu không retry/fail”. Nó phù hợp counter, state transition, reference swap; không phù hợp invariant trải qua nhiều field nếu không thiết kế transaction bằng CAS.

`LongAdder` tối ưu nhiều writer bằng cách phân tán contention, nhưng `sum()` là snapshot gần đúng trong lúc update. `AtomicStampedReference` hỗ trợ version để tránh ABA trong một số pattern.

## Pitfall

- atomic reference không làm object trỏ tới immutable;
- retry loop phải có giới hạn hoặc backoff nếu contention cao;
- đừng dùng atomic để biến workflow nhiều bước thành “ảo tưởng atomic”.

## Bài tự luyện

Viết state machine chỉ cho phép `NEW -> RUNNING -> STOPPED`; kiểm tra hai thread cùng gọi transition và chỉ một thread thành công.
