# Lesson 705 — Kafka và microservices

## Mục tiêu

Thiết kế event workflow với delivery semantics, idempotency, retry và observability.

## Nội dung

- Event schema/version.
- Producer acknowledgement và consumer group.
- At-least-once delivery và duplicate handling.
- Retry, dead-letter topic và poison message.
- Outbox pattern cho database/event consistency.
- Monolith boundary trước khi tách microservice.

## Bài tập

Thiết kế ExpenseSettled event, idempotency key và consumer retry policy. Ghi rõ trường hợp event đến hai lần hoặc đến sai thứ tự.
