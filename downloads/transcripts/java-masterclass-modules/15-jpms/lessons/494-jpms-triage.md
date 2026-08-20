# 494 — Error-triage cho JPMS

Khi modular build fail, thu evidence trước khi chỉnh descriptor.

## Triage template

```text
Command:
JDK java/javac:
Module path:
Source/output layout:
First error:
Expected graph:
Observed graph:
Hypothesis:
Minimal fix:
Regression command:
```

## Phân loại nhanh

- compile không thấy module: source path/module path/name;
- compile không thấy package: `requires` hoặc package spelling;
- access denied: `exports`/qualified export;
- reflection denied: `opens`/qualified opens;
- service missing: `uses`, `provides`, resolution hoặc packaging;
- image thiếu module: root module và dynamic loading.

Một workaround chạy được chưa phải root-cause fix. Ghi rõ flag tạm thời và ticket xóa flag.

## Bài tự kiểm tra

Tạo năm log lỗi giả lập, yêu cầu người học map mỗi log tới directive/command cần kiểm tra và evidence chứng minh.

