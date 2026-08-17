# Lesson 704 — Redis caching

## Mục tiêu

Dùng cache-aside có TTL, key policy, invalidation và fallback khi Redis unavailable.

## Nội dung

- Cache hit/miss.
- Key namespace và version.
- TTL, stale data và invalidation.
- Stampede/thundering herd.
- Serialize DTO an toàn.
- Metrics hit ratio và dependency timeout.

## Bài tập

Cache expense summary; test miss gọi database, hit không gọi database, update invalidate key và Redis failure fallback.
