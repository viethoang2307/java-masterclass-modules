# Lời giải Bài 15

Aggregation cần policy rõ thay vì fail-fast mù: partial có thể trả degraded response, còn all-fail là unavailable. Production giữ từng cause/status/latency, không chỉ boolean.
