# Lời giải 08 — Boxing Ledger

Primitive varargs được autobox khi thêm vào `List<Long>` và unbox khi tính tổng. Null wrapper sẽ gây lỗi mơ hồ nên được reject rõ. `Math.addExact` biến overflow im lặng thành failure. Complexity O(n); production finance nên dùng integer minor units hoặc `BigDecimal` tùy domain.
