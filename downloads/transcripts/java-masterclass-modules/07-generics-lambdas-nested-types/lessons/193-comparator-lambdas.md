# Lesson 193 — Comparator với lambda

## Mục tiêu

Tạo ordering bằng comparing, comparingInt, reversed và thenComparing; tránh overflow và null ambiguity.

~~~java
Comparator<Product> ranking =
    Comparator.comparingInt(Product::stock)
              .reversed()
              .thenComparing(Product::sku);
~~~

Dùng comparingInt/Long/Double để tránh boxing. Null policy có thể đặt ở object và key:

~~~java
Comparator<Product> safe = Comparator.nullsLast(
    Comparator.comparing(Product::name,
        Comparator.nullsFirst(String::compareTo)));
~~~

Sort cần deterministic tie-breaker nếu output dùng cho report hoặc pagination. Comparator đưa vào TreeSet/TreeMap phải hiểu compare == 0 là trùng theo ordering.

## Lỗi thường gặp

Subtract số, reversed đặt sai chỗ, key null và inconsistent với equals.

## Bài tập

Sort theo status ưu tiên, amount giảm, createdAt tăng, id tăng; test toàn bộ tie cases.

