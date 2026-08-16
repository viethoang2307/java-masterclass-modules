# 133. Collections Framework: từ array tới cấu trúc có contract

## Bức tranh

Collection Framework cung cấp interface và implementation cho nhóm phần tử. List giữ thứ tự và cho phép duplicate; Set biểu diễn uniqueness; Queue biểu diễn processing order; Map lưu key/value và không extends Collection.

~~~java
List<String> names = new ArrayList<>();
Set<String> tags = new HashSet<>();
Map<String, Integer> stock = new HashMap<>();
~~~

Khai báo theo interface giúp đổi implementation mà consumer ít đổi.

## Chọn cấu trúc

Cần index và append thường xuyên: ArrayList. Cần uniqueness: HashSet. Cần sorted/range: TreeSet/TreeMap. Cần lookup theo key: HashMap. Cần insertion order: LinkedHashSet/LinkedHashMap.

## Contract quan trọng

Không giả định mọi collection có order, mutation, null support hay complexity giống nhau. List.of là immutable; HashMap không đảm bảo iteration order.

## Bài tập

Chọn collection cho playlist, username unique, print queue và inventory. Với mỗi lựa chọn, ghi operation chính, ordering, duplicate và failure behavior.

## Checkpoint

Collections API là contract trước, concrete class sau. Đừng chọn theo thói quen.
