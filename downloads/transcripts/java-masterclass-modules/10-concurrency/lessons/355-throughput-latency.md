# 355 — Throughput, latency và contention

Throughput là số việc hoàn thành mỗi đơn vị thời gian; latency là thời gian một request. Tăng concurrency có thể tăng throughput đến điểm bão hòa, sau đó queueing, contention, GC và context switch làm latency xấu đi.

```text
concurrency tăng -> throughput tăng -> saturation -> queue/latency tăng
```

Đo p50/p95/p99, không chỉ average. Tách queue wait khỏi execution time để biết bottleneck ở admission hay worker. Benchmark phải có warm-up, input thực tế và tránh dead-code elimination.

## Trade-off

Lock contention, false sharing, allocation, logging đồng bộ và pool chung đều ảnh hưởng. Tối ưu bằng cách giảm shared state, batching, immutable snapshot hoặc partition theo key trước khi tăng thread.

## Bài tự luyện

Chạy cùng workload với pool size 1, 2, 4, 8; ghi throughput/p95 và xác định điểm diminishing returns.
