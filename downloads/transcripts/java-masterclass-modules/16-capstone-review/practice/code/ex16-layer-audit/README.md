# Bài 16 — Layer dependency audit (Very Hard)

Allowed edges: `ui -> application/domain/port`, `application -> domain/port`, `infrastructure -> domain/port`, `port -> domain`, `domain -> nothing`. Trả `layer->dependency` cho edge vi phạm, sort alphabetic.

Unknown layer/dependency cũng là violation để audit không bỏ sót typo.

