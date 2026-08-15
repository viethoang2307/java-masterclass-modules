# Module 06 — Arrays và Collections

Module này đi từ cấu trúc dữ liệu tuần tự cơ bản đến cách thiết kế mô hình có identity, equality, ordering và invariants rõ ràng. Tài liệu dùng Java 17 và liên hệ với deck of cards, task merge, theatre booking, adventure game và store inventory.

## Phạm vi

- Bài 119–132: project structure, arrays, reference semantics, varargs, 2D và jagged arrays.
- Bài 133–150: `List`, `ArrayList`, `LinkedList`, iterator, autoboxing và enum.
- Bài 199–227: Collections Framework, `Set`, equality/hash code, `Map`, sorted/navigable collections và final challenge.
- Bài 616–642: track legacy dùng đối chiếu binary search, comparator, immutability, sets, maps, stock list và basket; không tạo lesson trùng.

## Bản đồ kiến thức

```text
Array → List → Set / Map
  │       │       ├─ equality + hashCode
  │       │       ├─ ordering + Comparator
  │       │       └─ range/navigation
  │       └─ iterator + boxing + enum
  └─ reference semantics + 2D/jagged + varargs
```

## Cách học

1. Đọc lesson theo [INDEX](INDEX.md), tự chạy và sửa ví dụ.
2. Giải [bộ 20 bài practice](practice/README.md) mà chưa mở lời giải.
3. Chạy `SelfCheck` từng bài và verifier toàn bộ solutions.

```powershell
cd practice/solutions/ex01-array-statistics
javac --release 17 Main.java SelfCheck.java
java SelfCheck

cd ../..
./verify-solutions.ps1
```

## Kết quả đầu ra

- Chọn array/List/Set/Map dựa trên contract và workload.
- Giải thích `equals`, `hashCode`, natural order và `Comparator`.
- Tránh aliasing, unsupported mutation và concurrent modification.
- Dùng immutable copy hoặc backed view có chủ đích.
- Bảo toàn invariant khi collection operation thất bại.
