# Lời giải Bài 20

Service là transaction boundary: reserve stock, record payment intent, persist order và outbox trong một DB transaction. External payment thật không rollback được bằng DB, nên production cần payment idempotency/saga; bài self-check chỉ chứng minh decision contract.

Review thêm schema constraints, generated key, optimistic conflict, retry budget, migration, query count và integration test với database engine thật.
