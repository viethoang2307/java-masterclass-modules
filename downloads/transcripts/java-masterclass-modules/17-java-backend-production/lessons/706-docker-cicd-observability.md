# Lesson 706 — Docker, CI/CD và observability

## Mục tiêu

Đóng gói service reproducibly, chạy pipeline an toàn và theo dõi health/performance sau deploy.

## Nội dung

- Multi-stage Docker build.
- Non-root container và environment config.
- Docker Compose local dependencies.
- CI stages: compile, test, package, scan, publish.
- Rolling/blue-green deployment concept.
- Structured logs, metrics, traces, alert threshold.

## Bài tập

Viết Dockerfile, compose cho app/database/Redis, pipeline checklist và rollback runbook. Không đặt secret trong image hoặc repository.
