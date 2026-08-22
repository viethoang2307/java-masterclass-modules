# 418 — Parameterized test

Parameterized test chạy cùng behavior trên nhiều input, giảm copy-paste và làm boundary rõ. Dữ liệu test phải có tên/label để failure biết case nào.

Test null, empty, min/max, unicode, overflow và invalid cùng happy path; đừng chỉ tăng số case ngẫu nhiên mà thiếu expected oracle.
