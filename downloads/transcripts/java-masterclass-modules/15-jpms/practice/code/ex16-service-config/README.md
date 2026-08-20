# Bài 16 — Service configuration (Very Hard)

Descriptor phải có `uses service;`. Với mỗi provider, phải có directive `provides service with provider;`. Trả danh sách lỗi dạng `missing-uses` và `missing-provider:<name>`.

Provider null/blank được xem là invalid provider. Không phụ thuộc thứ tự directive.

