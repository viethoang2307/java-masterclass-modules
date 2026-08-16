# 210. Union, intersection và difference

## Bulk operations

~~~java
Set<String> a = Set.of("java", "sql", "git");
Set<String> b = Set.of("java", "docker");

Set<String> union = new HashSet<>(a);
union.addAll(b);

Set<String> common = new HashSet<>(a);
common.retainAll(b);

Set<String> onlyA = new HashSet<>(a);
onlyA.removeAll(b);
~~~

Bulk methods mutate receiver, nên tạo working copy nếu cần bảo toàn input. containsAll kiểm tra subset.

## Symmetric difference

A xor B là union trừ intersection, hoặc (A\\B) union (B\\A). Test partition bằng union/intersection để bắt sai chiều removeAll.

## Bài tập

Tính missing permissions, common tags và quyền dư giữa requested/granted. Trả immutable result và test input không đổi.

## Pitfalls

Gọi retainAll trực tiếp trên tập nguồn, nhầm A\\B với B\\A, và dùng Set khi multiplicity quan trọng.
