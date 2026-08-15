# Lời giải 14 — Word Frequency

Regex Unicode tách punctuation mà vẫn giữ chữ tiếng Việt. `merge(token,1,Integer::sum)` diễn đạt histogram trực tiếp. `TreeMap` tạo report deterministic và unmodifiable view bảo vệ output. Complexity O(c + k log k), với c là số ký tự và k số token khác nhau.
