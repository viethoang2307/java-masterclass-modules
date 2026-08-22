# 410 — Back-pressure

Back-pressure giới hạn tốc độ producer khi consumer/network chậm. Công cụ: bounded queue, max in-flight, window size, `Subscription.request` và reject/fallback.

Unbounded response buffer biến slow client thành memory leak. Khi đầy, chọn block, drop, reject hay disconnect theo protocol contract.
