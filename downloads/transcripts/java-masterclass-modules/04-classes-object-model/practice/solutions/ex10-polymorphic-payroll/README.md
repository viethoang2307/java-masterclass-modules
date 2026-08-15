# Lời giải — Bài 10 — Polymorphic payroll

## Hướng tư duy

Payroll report không biết concrete subtype; nó gọi role/pay qua base contract. StringBuilder giữ output deterministic và tránh trailing separator.

## Pitfalls

- Cast worker về concrete type.
- Dùng comma sau phần tử cuối.
- Trộn sorting/format ngoài contract.

## Complexity

O(n) time và O(n) output space.

## Kiểm chứng

SelfCheck kiểm tra object state, equality hoặc polymorphic behavior theo contract của bài. Reference code đã hoàn chỉnh.
