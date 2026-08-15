# 155. Abstract classes phần 3: đánh giá hierarchy

## Checklist review

Base class có invariant thật sự chung không? Method `final` nào bảo vệ sequence? Subclass có phải override bằng no-op/exception không? Protected API có nhỏ và ổn định không? Nếu câu trả lời xấu, hierarchy đang chứa quá nhiều responsibility.

## Example mùi thiết kế

```java
abstract class FileProcessor {
    abstract void processPdf();
    abstract void processCsv();
}
```

Một processor chỉ xử lý PDF sẽ bị ép implement CSV. Tách `Processor` contract nhỏ hoặc dùng strategy.

## Bài tập

Audit hierarchy `Shape` có `area`, `volume`, `draw`, `serialize`. Tách thành capability interfaces và giữ consumer phụ thuộc đúng method cần.

## Kết luận

Abstract class là công cụ chia sẻ invariant + implementation, không phải nơi gom mọi behavior có vẻ liên quan. Mỗi method trong base làm contract của tất cả subtype rộng thêm.
