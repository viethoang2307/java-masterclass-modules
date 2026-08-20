# 476 — Split package và ranh giới package

JPMS không cho phép hai named module cùng chứa một package. Đây là **split package**, thường xuất hiện khi một thư viện cũ tách class qua nhiều JAR.

```text
com.acme.common  trong common-api.jar
com.acme.common  trong common-impl.jar   <- conflict
```

## Vì sao nguy hiểm

Classpath có thể resolve theo thứ tự JAR và tạo hành vi khó đoán. Module path buộc ta làm rõ ownership của package, nên lỗi xuất hiện sớm hơn.

## Cách xử lý

- Gộp class cùng package vào một module đúng ownership.
- Đổi package implementation thành `com.acme.impl...` nếu có thể.
- Tách API và implementation thành package/module có ranh giới rõ.
- Với thư viện không sửa được, cân nhắc giữ trên classpath trong giai đoạn migration và ghi lại trade-off.

`jdeps`, `jar --describe-module` và danh sách entry trong JAR giúp xác định package bị trùng. Không giải quyết bằng cách copy ngẫu nhiên class giữa JAR.

## Checkpoint

Tạo report gồm package, module owner, loại class (API/internal) và quyết định migration cho mỗi split package.

