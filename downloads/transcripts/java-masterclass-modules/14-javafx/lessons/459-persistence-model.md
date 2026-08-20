# 459 — Persistence model

Model UI nên serialize DTO/domain, không serialize Node/property trực tiếp. Save atomic qua temp + move, load validate version/schema và báo lỗi không làm mất state hiện tại.
