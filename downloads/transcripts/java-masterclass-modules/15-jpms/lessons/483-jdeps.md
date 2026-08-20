# 483 — Dùng `jdeps` để lập dependency inventory

`jdeps` phân tích bytecode và gợi ý dependency module:

```powershell
jdeps --multi-release 17 --recursive --print-module-deps app.jar
jdeps --check com.acme.app --module-path mods
```

## Hai câu hỏi khác nhau

- `--print-module-deps`: bytecode đang tham chiếu module nào.
- `--check`: graph có vấn đề gì, module nào không đọc được hoặc có cycle.

`jdeps` không biết đầy đủ dependency nạp động qua reflection, resource hoặc `ServiceLoader`. Vì vậy report phải được đối chiếu với runtime smoke test và configuration.

## Quy trình

1. Lưu command và version JDK.
2. Phân loại dependency JDK, third-party, internal.
3. Ghi false negative do reflection/service.
4. Chuyển kết quả thành `requires` tối thiểu.
5. Re-run sau mỗi migration.

## Checkpoint

Lập bảng `artifact -> module name -> evidence -> directive -> runtime verification`. Không thêm `requires` chỉ vì tool gợi ý nếu code không sử dụng dependency đó.

