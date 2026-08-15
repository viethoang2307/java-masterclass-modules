# 206. Five-card draw: hoàn thiện game loop

## Mục tiêu

- Tách setup, deal, evaluate và presentation.
- Giữ kết quả có thể test bằng dependency injection tối giản.

## Thiết kế đề xuất

```java
static List<Card> drawFive(List<Card> shuffledDeck, int offset) {
    if (offset < 0 || offset + 5 > shuffledDeck.size()) {
        throw new IllegalArgumentException("Not enough cards");
    }
    return List.copyOf(shuffledDeck.subList(offset, offset + 5));
}
```

Không giấu `new Random()` trong logic cốt lõi. Nhận `Random` hoặc nhận deck đã shuffle để test lặp lại được.

## Evaluation tối thiểu

- Đếm rank bằng `Map<Rank,Integer>`.
- Đếm suit bằng `EnumMap<Suit,Integer>`.
- Pair/two-pair/three-of-a-kind dựa trên frequency values.
- Flush khi chỉ có một suit.

## Lỗi thường gặp

- So sánh enum bằng string; enum nên dùng `==`.
- Trộn logic output với luật game khiến test khó.
- Trả `subList` view ra ngoài rồi thay đổi deck nền.

## Bài tập ngắn

Xây evaluator trả enum `HandCategory`, ưu tiên category mạnh hơn.

## Interview prompt

`List.copyOf(subList(...))` bảo vệ API khỏi những thay đổi nào?

## Nguồn

- Transcript bài 206.
- Java 17 API: `List.copyOf`, `EnumMap`.
