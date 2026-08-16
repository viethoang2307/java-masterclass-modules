# 205. Card game challenge: chia bài an toàn

## Deal round-robin

~~~java
static List<List<Card>> deal(List<Card> deck, int players, int cardsEach) {
    if (players <= 0 || cardsEach <= 0 ||
        players * cardsEach > deck.size())
        throw new IllegalArgumentException("invalid deal");
    List<List<Card>> hands = new ArrayList<>();
    for (int p = 0; p < players; p++) hands.add(new ArrayList<>());
    for (int i = 0; i < players * cardsEach; i++)
        hands.get(i % players).add(deck.get(i));
    return hands;
}
~~~

Validate trước khi mutate. Cursor/index chia vòng tròn tránh remove(0) trên ArrayList. Deal contract phải nói rõ deck có bị consume hay không; code trên không consume.

## Invariants

Union hands + remainder bằng deck ban đầu, không duplicate giữa hands, mỗi hand đúng cardsEach, remainder đúng size.

## Bài tập

Thêm immutable DealResult gồm hands/remainder. Test invalid player count, insufficient cards và duplicate input deck.
