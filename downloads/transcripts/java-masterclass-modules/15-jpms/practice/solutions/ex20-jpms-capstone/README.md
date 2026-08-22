# Lời giải — JPMS capstone

Audit gom ba invariant: graph reachability, package ownership và service provider. Mỗi invariant có helper riêng, giúp lỗi report actionable và test được độc lập. Độ phức tạp O(V + E + P), trong đó P là tổng package entries.

