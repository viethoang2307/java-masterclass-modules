# 201. Deck of cards: model value object

## Domain model

~~~java
enum Suit { CLUB, DIAMOND, HEART, SPADE }
enum Rank { TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT,
            NINE, TEN, JACK, QUEEN, KING, ACE }
record Card(Suit suit, Rank rank) {}
~~~

Record phù hợp vì Card được nhận diện bằng suit/rank, có equality/hashCode và state không đổi.

## Sinh standard deck

~~~java
static List<Card> standardDeck() {
    List<Card> deck = new ArrayList<>(52);
    for (Suit suit : Suit.values())
        for (Rank rank : Rank.values())
            deck.add(new Card(suit, rank));
    return List.copyOf(deck);
}
~~~

Invariant: size 52, không null, HashSet size 52, mỗi suit có 13 rank. Self-check nên kiểm tra tất cả invariant thay vì chỉ size.

## Ownership

Deck immutable giúp không bị caller reorder/remove. Nếu cần game state mutable, giữ mutable copy trong Deck object và expose snapshot.

## Bài tập

Thêm displayName, deal round-robin và remainder. Test no duplicate card, invalid player/card count và input deck không bị mutate.
