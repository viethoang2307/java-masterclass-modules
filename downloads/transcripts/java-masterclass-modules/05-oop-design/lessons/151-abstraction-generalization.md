# 151. Abstraction và generalization

## Abstraction là gì?

Abstraction giữ lại điều consumer cần và giấu chi tiết thay đổi. Một abstraction tốt mô tả capability/contract, không phải danh sách mọi field của implementation.

```java
interface Payable {
    long amountCents();
}
```

Invoice, salary hoặc refund đều có thể `Payable` dù implementation khác nhau. Consumer tính tổng mà không biết source:

```java
static long total(List<? extends Payable> values) {
    long total = 0;
    for (Payable value : values) total = Math.addExact(total, value.amountCents());
    return total;
}
```

## Generalization quá sớm

Đừng tạo `BaseEntity` chỉ vì nhiều class có `id`. Hãy kiểm tra behavior thật sự dùng chung, invariant giống nhau và lifecycle có đồng nhất không. Abstraction sai làm mọi subtype phải hiểu rule không liên quan.

## Bài tập

Tìm ba class trong một hệ thống bán hàng, đề xuất một interface capability và viết consumer chỉ phụ thuộc interface. Ghi rõ điều gì cố ý không đưa vào abstraction.

## Checkpoint

Abstraction nên trả lời “caller được làm gì?”, không phải “implementation có những field nào?”.
