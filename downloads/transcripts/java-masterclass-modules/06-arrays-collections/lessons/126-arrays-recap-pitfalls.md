# 126. Array recap và pitfalls

## Decision checklist

Chọn array khi length cố định, type đồng nhất và cần index O(1). Chọn collection khi size thay đổi, cần search/uniqueness/order semantics hoặc API phong phú hơn.

## Invariants cần nhớ

Array reference có thể null; length không đổi; index hợp lệ là [0,length); reference array có slot null; truyền array vào method truyền reference tới cùng object.

## Performance

Array có locality tốt và overhead thấp. Resize thủ công cần allocate/copy. Đừng tối ưu bằng array trước khi biết operation và bottleneck; readability/contract quan trọng hơn microbenchmark đo sai.

## Debug exercise

Cho đoạn code có ArrayIndexOutOfBoundsException, NullPointerException, aliasing và binary search sai precondition. Với mỗi lỗi, ghi input tối thiểu tái hiện, invariant bị phá và fix.

## Bài tập tổng hợp

Implement ArrayReport gồm min/max/sum/search/sorted copy. Self-check phải chứng minh overflow policy, input không đổi và empty/null contract.

## Checkpoint

Bạn phải giải thích được khác biệt giữa reference copy, element copy, shallow copy/deep copy và khi nào chuyển sang List.
