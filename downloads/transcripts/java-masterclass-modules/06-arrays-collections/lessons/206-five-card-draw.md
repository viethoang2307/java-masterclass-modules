# 206. Five-card draw: tách game loop và evaluator

## Draw immutable hand

~~~java
static List<Card> drawFive(List<Card> deck, int offset) {
    if (offset < 0 || offset + 5 > deck.size())
        throw new IllegalArgumentException("not enough cards");
    return List.copyOf(deck.subList(offset, offset + 5));
}
~~~

copyOf bảo vệ hand khỏi việc deck nền thay đổi. Randomness nên inject bằng Random hoặc nhận deck đã shuffle để test deterministic.

## Evaluator

Dùng Map<Rank,Integer> đếm rank và EnumMap<Suit,Integer> đếm suit. Pair, two pair, three-of-a-kind dựa frequency; flush khi một suit; thứ hạng phải có rule tie-breaker.

## Bài tập

Tạo enum HandCategory và evaluator đầy đủ. Test five unique ranks, pair, two pair, flush, invalid hand size và cùng seed cho cùng kết quả.

## Lỗi thường gặp

Trộn output với luật game, so enum bằng String, trả subList view và tạo Random bên trong method khó test.
