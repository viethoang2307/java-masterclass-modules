# Module 06 — Arrays và Collections

Module này dạy cách chọn và sử dụng cấu trúc dữ liệu trong Java theo contract, không theo thói quen. Bản lesson đã được refactor để mỗi bài có mental model, ví dụ Java 17, complexity/ownership, lỗi thường gặp và bài tập kiểm tra.

## Lộ trình

```text
Project/packages → Array → Array algorithms → 2D/jagged
       ↓
List/ArrayList → LinkedList/Iterator → boxing/enum
       ↓
Collections Framework → Set/equality/order → Map/views
       ↓
TreeSet/TreeMap/navigation → card game → store inventory
```

## Kết quả cần đạt

- Chọn array/List/Set/Map dựa trên operation, ordering, duplicate và mutation contract.
- Phân biệt reference copy, shallow/deep copy và defensive snapshot.
- Dùng binary search/Comparator đúng precondition và complexity.
- Thiết kế equality/hashCode ổn định cho HashMap/HashSet.
- Dùng iterator, Map views, compute/merge và navigable methods an toàn.
- Bảo toàn invariant trong các model card, booking, adventure và inventory.

## Cách học từng lesson

1. Đọc mental model và tự giải thích lại bằng ví dụ nhỏ.
2. Chạy code sample bằng Java 17, dự đoán output trước.
3. Ghi rõ input mutation, output ordering và failure contract.
4. Làm bài practice tương ứng trong [practice/README.md](practice/README.md).
5. Chạy verifier sau khi hoàn thành nhóm bài.

## Phạm vi transcript

- 119–132: project, arrays, search/sort, reference, varargs, 2D/jagged.
- 133–150: List, ArrayList, LinkedList, iterator, autoboxing và enum.
- 199–227: Collections Framework, cards, equality/hashCode, Set, Map, navigation và store inventory.
- 616–642: track legacy/reference được hợp nhất, không tạo lesson trùng.

## Practice

Bộ practice gồm 20 bài từ Medium đến Extreme, có starter code, lời giải và self-check riêng từng thư mục.

```powershell
cd practice/solutions/ex01-array-statistics
javac --release 17 Main.java SelfCheck.java
java SelfCheck

cd ../..
powershell.exe -ExecutionPolicy Bypass -File .\verify-solutions.ps1
```

## References

- Java 17 API: Arrays, List, Set, Map, Collections Framework.
- Java Language Specification 17: arrays, classes, interfaces và generics.
- Oracle Java Tutorials: Collections Framework và object equality.
