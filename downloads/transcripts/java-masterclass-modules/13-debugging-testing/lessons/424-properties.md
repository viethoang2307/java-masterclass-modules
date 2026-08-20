# 424 — Property và invariant testing

Property là điều đúng cho nhiều input: sort output ordered/permutation, encode/decode round-trip, balance conserved. Invariant thường mạnh hơn expected output đơn lẻ.

Randomized test cần seed được ghi khi fail để reproduce; generator phải tránh chỉ sinh input dễ.
