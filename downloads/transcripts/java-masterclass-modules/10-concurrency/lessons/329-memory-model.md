# 329 — Java Memory Model và happens-before

Java Memory Model (JMM) quy định khi nào một write của thread này được thread khác nhìn thấy và thứ tự nào được đảm bảo. Không có happens-before, code có thể chạy “đúng” nhiều lần nhưng vẫn không có guarantee.

Các quan hệ quan trọng:

- unlock một monitor happens-before lock tiếp theo trên cùng monitor;
- write vào `volatile` happens-before read tiếp theo của field đó;
- `Thread.start()` happens-before action trong thread mới;
- mọi action trong thread happens-before thread khác return từ `join`;
- các action trong cùng thread có program order.

```text
producer: data = 42; flag = true  --volatile-->  consumer: if (flag) read data
```

Nếu `flag` không volatile hoặc không có lock/other safe publication, compiler/CPU có thể reorder hoặc giữ giá trị trong cache khiến consumer không thấy `data` đúng.

## Safe publication

Dùng static initialization, `final` fields đúng constructor, volatile reference, synchronized hand-off hoặc concurrent collection. Đừng publish object mutable qua static field mà không có protocol.

## Pitfall

“Chạy trên máy tôi không lỗi” không phải proof. Data race là lỗi correctness dù JVM vẫn tuân thủ JMM.

## Bài tự luyện

Viết ví dụ flag không volatile, sau đó đổi sang volatile và giải thích: volatile giải visibility/ordering của flag, nhưng không tự biến `counter++` thành atomic.
