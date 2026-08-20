# Bài 18 — CompletableFuture fan-out (Very Hard)

Chạy ba nhánh độc lập trên executor riêng, combine kết quả thành `"A+B+C"`, và luôn shutdown executor. Không block từng nhánh tuần tự.
