# 324 — Thread states và scheduling

Java mô hình hóa lifecycle qua `Thread.State`: `NEW`, `RUNNABLE`, `BLOCKED`, `WAITING`, `TIMED_WAITING` và `TERMINATED`. `RUNNABLE` không đảm bảo thread đang chạy trên CPU; nó bao gồm cả thread đang chờ scheduler.

```text
NEW --start--> RUNNABLE --run ends--> TERMINATED
                   │
       lock       │ sleep/join/wait
                   ▼
              BLOCKED / TIMED_WAITING / WAITING
```

```java
Thread t = new Thread(() -> {
    try {
        Thread.sleep(50);
    } catch (InterruptedException e) {
        Thread.currentThread().interrupt();
    }
}, "sleeper");
System.out.println(t.getState()); // NEW
t.start();
while (t.isAlive()) {
    System.out.println(t.getState());
}
```

Trạng thái quan sát có tính thời điểm; một thread có thể chuyển trạng thái ngay sau khi bạn đọc. Dùng state để chẩn đoán, không dùng làm synchronization protocol.

## Pitfall

- `Thread.yield()` chỉ là hint, không phải guarantee.
- `sleep()` không giải phóng intrinsic lock đang giữ.
- Thread bị `BLOCKED` đang chờ monitor; thread `WAITING` thường đang chờ signal hoặc thread khác kết thúc.
- Đừng assert chính xác trạng thái trong test timing-sensitive.

## Bài tự luyện

Tạo một thread giữ lock 200 ms và thread thứ hai cố vào synchronized block. In state của thread thứ hai, sau đó giải thích vì sao kết quả có thể khác giữa các máy.
