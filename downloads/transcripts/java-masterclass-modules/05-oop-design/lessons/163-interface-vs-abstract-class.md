# 163. Interface hay abstract class?

## Quy tắc thực dụng

Chọn abstract class khi cần constructor, protected state, shared implementation và lifecycle chung. Chọn interface khi muốn capability, multiple implementation/hierarchy và dependency inversion.

| Câu hỏi | Abstract class | Interface |
|---|---|---|
| Chia sẻ instance state? | Có | Không nên |
| Nhiều capability? | Một base class | Nhiều interface |
| Constructor chung? | Có | Không |
| Contract cho consumer? | Có | Rất phù hợp |
| Mở rộng độc lập? | Bị giới hạn hierarchy | Linh hoạt hơn |

## Hybrid

Một class có thể `extends BaseWorker implements Payable, Auditable`. Base giữ invariant worker; interfaces mô tả capability orthogonal.

## Bài tập

Với `FileStore`, `EncryptedStore`, `RetryingStore`, quyết định abstraction nào là interface, decorator nào là composition và phần shared validation đặt ở đâu.
