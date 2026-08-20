# 416 — HTTP API client design

API client nên expose domain result, map status/error, giữ request id, timeout và retry policy. Transport (`HttpClient`) không leak vào business layer.

Định nghĩa idempotency, pagination, rate limit và backward compatibility trong contract. Test parser bằng fixture và contract test với provider.
