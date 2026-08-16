# 147. Banking challenge: List<Long> ledger

## Domain model

Ledger lưu transaction theo minor unit. List<Long> tiện cho collection API nhưng mỗi primitive long bị boxing.

~~~java
static long balance(List<Long> ledger) {
    long total = 0;
    for (Long value : ledger) {
        if (value == null) throw new IllegalArgumentException("null transaction");
        total = Math.addExact(total, value);
    }
    return total;
}
~~~

Math.addExact phát hiện overflow thay vì wrap im lặng. Tiền nên có currency/unit rõ, không dùng double.

## Bài tập

Implement append(long...) và balance. Test deposit, withdrawal, null, overflow, empty ledger và immutable input.

## Pitfalls

Unbox null, bỏ qua overflow, expose mutable ledger và dùng Integer cho số tiền lớn.
