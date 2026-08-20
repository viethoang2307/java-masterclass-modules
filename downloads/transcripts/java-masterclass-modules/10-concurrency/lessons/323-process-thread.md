# 323 — Process và Thread

## Ý tưởng cốt lõi

Process là một chương trình đang chạy với address space và resource riêng. Thread là một execution path bên trong process; các thread trong cùng process chia sẻ heap, file descriptor và nhiều resource khác nhưng mỗi thread có stack, program counter và lifecycle riêng.

```text
Process JVM
├── Heap: objects dùng chung
├── Thread main: stack + program counter
├── Thread worker: stack + program counter
└── Executor threads: stack + program counter
```

Chia sẻ heap làm việc phối hợp nhanh hơn, nhưng cũng tạo data race. Vì vậy concurrency luôn là bài toán **shared state + ordering + ownership**, không chỉ là API tạo thread.

## Ví dụ

```java
public class Main {
    public static void main(String[] args) throws InterruptedException {
        Thread worker = new Thread(() -> System.out.println("worker=" + Thread.currentThread().getName()), "reporter");
        worker.start();
        worker.join();
        System.out.println("main done");
    }
}
```

`start()` tạo execution path mới; gọi trực tiếp `run()` chỉ là lời gọi method trên thread hiện tại. `join()` tạo điểm chờ để main không kết thúc trước worker.

## Điểm cần nhớ

- Một `Thread` object chỉ được `start()` một lần.
- Không dựa vào thứ tự scheduling mặc định.
- Thread không có heap riêng; đừng giả định local variable của method khác thread là shared.
- Thread tạo thủ công phù hợp demo hoặc lifecycle đặc biệt; application thường nên dùng executor.

## Bài tự luyện

Tạo ba worker có tên khác nhau, ghi lại `getId`, `getName`, `isAlive` trước/sau `start`, rồi dùng `join` để in tổng kết sau cùng.
