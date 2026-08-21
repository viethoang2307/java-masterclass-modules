# Module 17 — Java Backend Production Track

Đây là nhánh chuyên sâu sau Module 13 dành cho mục tiêu Java Backend Developer. Module 14 JavaFX và Module 15 JPMS vẫn giữ vai trò specialization track; Module 17 tập trung vào ứng dụng web production.

## Lộ trình

~~~text
Spring Core/Boot
      ↓
REST + JSON + Validation
      ↓
Database integration + transactions
      ↓
Security + OAuth2
      ↓
Redis caching
      ↓
Kafka + microservices
      ↓
Docker + CI/CD + monitoring
~~~

## Kết quả cần đạt

- Tạo Spring Boot service có cấu hình theo environment và health check.
- Thiết kế REST API với HTTP semantics, JSON, validation, error contract và pagination.
- Kết nối database qua JDBC/JPA, transaction và migration.
- Bảo vệ API bằng authentication, authorization và OAuth2.
- Thêm Redis cache với TTL, invalidation và failure policy.
- Dùng Kafka cho event-driven workflow và hiểu delivery/idempotency.
- Đóng gói Docker, chạy CI/CD và đọc metrics/logs/traces cơ bản.

## Dependency

- Hoàn thành Module 1–13.
- Biết Git, Maven, Java 17, SQL, HTTP, testing và exception handling.
- Không học Spring để thay thế Core Java; mọi abstraction phải được liên hệ lại với Java core.

## Project spine

Xây một Expense Sharing Backend:

1. users/groups/expenses schema;
2. REST CRUD và split calculation;
3. JPA transaction;
4. JWT/OAuth2 security;
5. Redis cache cho summary;
6. Kafka event cho expense settlement;
7. Docker Compose local stack;
8. CI chạy test, build image và security checks.

## Practice

Practice của module này sẽ dùng Maven/Spring Boot vì mục tiêu là integration behavior. Không dùng self-check thuần javac thay cho integration test.
