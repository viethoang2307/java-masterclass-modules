# Practice — Module 10

Các bài dùng Java 17, class package-less và compile độc lập. Mỗi bài có starter trong `code`, lời giải tham khảo trong `solutions`, và `SelfCheck` phải in `PASS`.

| Bài | Độ khó | Chủ đề |
|---|---|---|
| 01 | Medium | tạo thread, đặt tên, join |
| 02 | Medium | atomic counter |
| 03 | Medium | volatile stop flag |
| 04 | Medium | join và chia workload |
| 05 | Medium | interrupt hợp tác |
| 06 | Hard | synchronized account |
| 07 | Hard | ReentrantLock và tryLock |
| 08 | Hard | AtomicReference state machine |
| 09 | Hard | ExecutorService batch |
| 10 | Hard | Future timeout/cancellation |
| 11 | Hard | ScheduledExecutorService retry |
| 12 | Hard | BlockingQueue producer/consumer |
| 13 | Hard | ConcurrentHashMap frequency |
| 14 | Hard | bounded executor/rejection |
| 15 | Very Hard | deadlock prevention bằng lock ordering |
| 16 | Very Hard | Condition bounded buffer |
| 17 | Very Hard | ForkJoin recursive sum |
| 18 | Very Hard | CompletableFuture fan-out |
| 19 | Extreme | WatchService và debounce cơ bản |
| 20 | Extreme | concurrent log processor capstone |

Chạy verifier:

```powershell
powershell -ExecutionPolicy Bypass -File .\verify-solutions.ps1
```

Chạy từng bài:

```powershell
cd .\solutions\ex01-thread-lifecycle
javac --release 17 Main.java SelfCheck.java
java SelfCheck
```

Starter giữ `TODO` có hướng dẫn. Solutions không có `TODO`; một số bài dùng timeout để self-check không treo vô hạn. Không dùng Maven, Gradle hoặc JUnit.
