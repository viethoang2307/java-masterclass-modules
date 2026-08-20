# Module 10 — Concurrency và Multithreading

Module này đi từ mô hình process/thread đến việc thiết kế chương trình concurrent có thể quan sát, dừng, kiểm thử và xử lý lỗi. Mục tiêu không phải “tạo thật nhiều thread”, mà là hiểu rõ shared state, visibility, atomicity, ordering và lifecycle để chọn đúng công cụ.

## Kết quả học tập

Sau module, bạn có thể:

- phân biệt process, thread, heap, thread stack và các trạng thái của `Thread`;
- tạo, đặt tên, `start`, `join`, `sleep`, `interrupt` và quản lý daemon thread;
- nhận diện race condition, visibility bug, lost update và vi phạm invariant;
- dùng `synchronized`, intrinsic lock, `volatile`, `Atomic*`, `ReentrantLock`, `Condition` và `tryLock` đúng ngữ cảnh;
- dùng `ExecutorService`, `Callable`, `Future`, `ScheduledExecutorService`, `ForkJoinPool` và `CompletableFuture`;
- chọn concurrent collection hoặc `BlockingQueue` thay vì tự viết queue dễ lỗi;
- chẩn đoán deadlock, livelock, starvation, queue saturation và task cancellation;
- thiết kế shutdown, timeout, back-pressure và error propagation cho ứng dụng thực tế;
- đọc thay đổi file bằng `WatchService` và xây pipeline producer/consumer có giới hạn;
- giải thích trade-off giữa correctness, throughput, latency, fairness và resource usage.

## Lộ trình lesson

| Bài | Trọng tâm |
|---|---|
| 323–327 | Process/thread, tạo thread, lifecycle, `join`, sleep, interrupt |
| 328–333 | Heap/stack, Java Memory Model, visibility, atomicity, `synchronized` |
| 334–338 | Explicit locks, fairness, conditions, atomics và concurrent collections |
| 339–344 | Executor, `Callable`/`Future`, scheduling, Fork/Join, parallel streams |
| 345–350 | Queue, deadlock/livelock/starvation, shutdown, WatchService |
| 351–357 | CompletableFuture, server timeout, observability, testing và capstone |

## Practice

Có 20 bài, mỗi bài nằm trong `practice/code` và có lời giải tương ứng trong `practice/solutions`.

| Bài | Độ khó | Chủ đề |
|---|---|---|
| 01–05 | Medium | thread lifecycle, counter, visibility, join, interrupt |
| 06–12 | Hard | locks, atomics, executor/future, timeout, blocking queue, concurrent map, scheduling |
| 13–17 | Very Hard | bounded pipeline, deadlock diagnosis, fair lock, Fork/Join, cancellation |
| 18–20 | Extreme | CompletableFuture fan-out, WatchService, concurrent log processor capstone |

Chạy toàn bộ lời giải:

```powershell
powershell -ExecutionPolicy Bypass -File .\practice\verify-solutions.ps1
```

Mỗi bài Java độc lập, không dùng Maven/Gradle/JUnit:

```powershell
javac --release 17 Main.java SelfCheck.java
java SelfCheck
```

## Quy tắc an toàn khi học concurrency

1. Không dùng `Thread.sleep` để “sửa” race condition; sleep chỉ dùng để mô phỏng hoặc nhường thời gian.
2. Mọi executor phải có lifecycle rõ ràng: `shutdown`, chờ kết quả, timeout và xử lý cancellation.
3. Lock phải có thứ tự hoặc timeout; không giữ lock khi gọi code bên ngoài không kiểm soát.
4. Không đọc `HashMap`/`ArrayList` từ nhiều thread nếu có mutation mà không có chiến lược đồng bộ.
5. Test concurrent phải kiểm tra invariant và kết quả cuối, không phụ thuộc vào thứ tự log.

## Reference

Nội dung được chuẩn hóa từ transcript về Java Concurrency/Multithreading và các API Java 17 liên quan. Tên class, method và thuật ngữ Java được giữ bằng tiếng Anh để đối chiếu JDK documentation.
