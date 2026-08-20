# 518 — Performance và memory review

Đo trước khi tối ưu. Tìm bottleneck theo latency budget: DB query, network, parsing, render hoặc lock contention.

## Red flags

- N+1 query khi load artist/tracks;
- stream tạo nhiều object trong hot loop;
- giữ toàn bộ file lớn trong memory;
- JavaFX cập nhật từng row thay vì batch;
- synchronized lock bao quanh I/O;
- unbounded queue/executor.

Chọn pagination, batching, streaming parse, cache với eviction và immutable snapshot khi có evidence. Benchmark input đại diện và ghi memory/latency trước-sau.

## Checkpoint

Phân tích scenario 100k tracks: budget, data access pattern, UI virtualization, cancellation và metric để xác nhận cải thiện.

