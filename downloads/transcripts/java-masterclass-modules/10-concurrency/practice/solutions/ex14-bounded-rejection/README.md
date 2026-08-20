# Lời giải Bài 14

`CountDownLatch started` chứng minh task đầu tiên đã chiếm worker trước khi submit task khác; vì vậy test không phụ thuộc sleep. Queue chứa đúng một task, task thứ ba bị AbortPolicy reject. Cuối cùng release gate và shutdown.

Trong production, chọn `CallerRunsPolicy`, fail-fast hoặc drop/dead-letter theo contract; không để queue unbounded chỉ để tránh rejection.
