# 325 — Tạo thread bằng Thread và Runnable

Có hai cách cơ bản: subclass `Thread` hoặc truyền `Runnable`. `Runnable` thường tốt hơn vì tách “việc cần làm” khỏi “cơ chế chạy”, cho phép cùng một task chạy bằng thread trực tiếp hoặc executor.

```java
Runnable job = () -> {
    System.out.println("task=" + Thread.currentThread().getName());
};
Thread first = new Thread(job, "worker-1");
Thread second = new Thread(job, "worker-2");
first.start();
second.start();
first.join();
second.join();
```

`Runnable` không trả về kết quả và không khai báo checked exception. Khi cần kết quả hoặc exception, dùng `Callable<T>` với executor và `Future<T>`.

## Checklist thiết kế

1. Đặt tên thread để log có ý nghĩa.
2. Quyết định ownership của task: thread nào chịu trách nhiệm dừng nó?
3. Không ném checked exception trực tiếp qua `Runnable`; chuyển thành error state, callback hoặc `Future`.
4. Không tạo một thread cho từng request không giới hạn; đó là cách làm cạn memory và scheduler.

## Pitfall

`new Thread(job).run()` chạy đồng bộ. `start()` mới đăng ký thread với JVM. Ngoài ra, đừng bắt `Exception` rồi nuốt mất lỗi; thread chết âm thầm là lỗi production khó truy vết.

## Bài tự luyện

Viết `Runnable` ghi nhận thời điểm bắt đầu/kết thúc, thêm `UncaughtExceptionHandler`, rồi cố ý ném exception để quan sát contract của thread.
