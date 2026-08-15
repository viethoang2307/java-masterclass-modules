# Lời giải — Bài 18 — CLI menu state machine

## Hướng tư duy

Mỗi dòng là một event. Parse command trước, validate arity/value, rồi switch để chuyển state. QUIT kết thúc loop; invalid không được tính event và không làm đổi balance.

## Pitfalls

- Parse token mà không kiểm tra arity.
- Trừ trực tiếp khiến balance âm.
- Không dừng ở QUIT hoặc retry vô hạn khi line lỗi.

## Complexity

O(n) time theo số dòng và O(1) auxiliary space.

## Kiểm chứng

SelfCheck kiểm tra contract bằng case đại diện, boundary và invalid input. Giữ calculation độc lập với console output để có thể tái sử dụng.

