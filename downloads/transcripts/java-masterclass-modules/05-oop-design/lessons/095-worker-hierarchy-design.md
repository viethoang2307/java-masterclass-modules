# 095. Thiết kế worker hierarchy

## Bối cảnh

Worker có dữ liệu chung như name/ID, nhưng cách tính pay khác nhau. Đây là ví dụ để phân biệt inheritance hợp lý với conditional code.

```java
abstract class Worker {
    private final String id;
    private final String name;
    protected Worker(String id, String name) {
        if (id == null || id.isBlank() || name == null || name.isBlank())
            throw new IllegalArgumentException("worker identity");
        this.id = id.strip(); this.name = name.strip();
    }
    public final String id() { return id; }
    public final String name() { return name; }
    public abstract long calculatePayCents();
}
```

## Vì sao không dùng một class với `workerType`?

Một class có `if (type == HOURLY) ... else if ...` sẽ phải sửa mỗi khi thêm loại worker. Polymorphism đưa variation vào subtype; consumer chỉ gọi `calculatePayCents()`.

```java
static long payroll(List<Worker> workers) {
    long total = 0;
    for (Worker worker : workers) total = Math.addExact(total, worker.calculatePayCents());
    return total;
}
```

Loop không biết subtype, nên thêm worker mới không cần sửa payroll. Tiền dùng cents và phép tính nên kiểm soát overflow.

## Test matrix

Test worker null, ID rỗng, boundary hours, negative rate, overflow và xử lý qua `Worker` reference. Đừng chỉ test concrete class.

## Bài tập

Thêm `CommissionWorker` và chứng minh code payroll không đổi. Viết report theo ID có ordering deterministic.

## Pitfalls

- Dùng `calculatePay` static, làm mất runtime dispatch.
- Cho subclass sửa ID bằng setter.
- Để base class phụ thuộc vào mọi chi tiết pay của subtype.
