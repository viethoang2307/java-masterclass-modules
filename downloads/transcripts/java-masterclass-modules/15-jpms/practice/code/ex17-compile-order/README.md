# Bài 17 — Topological compile plan (Very Hard)

Input map module → dependency modules. Trả thứ tự để dependency đứng trước consumer; module không xuất hiện như key vẫn được coi là external node. Throw `IllegalArgumentException` nếu graph có cycle.

Khi có nhiều thứ tự hợp lệ, dùng thứ tự alphabetic để output reproducible.

