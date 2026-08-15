# 201. Thiết kế bộ bài: setup domain model

## Mục tiêu

- Mô hình hóa card bằng enum và immutable value object.
- Sinh đủ 52 lá bài mà không trùng.

## Domain model

```java
enum Suit { CLUB, DIAMOND, HEART, SPADE }
enum Rank { TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT,
            NINE, TEN, JACK, QUEEN, KING, ACE }

record Card(Suit suit, Rank rank) {}
```

```java
static List<Card> standardDeck() {
    List<Card> deck = new ArrayList<>(52);
    for (Suit suit : Suit.values()) {
        for (Rank rank : Rank.values()) {
            deck.add(new Card(suit, rank));
        }
    }
    return deck;
}
```

`record` phù hợp vì card được nhận diện bằng cả suit và rank, tự có `equals`/`hashCode`, và state không đổi.

## Invariant nên kiểm tra

- `size() == 52`.
- `new HashSet<>(deck).size() == 52`.
- Không có `null`.
- Mỗi suit có 13 rank.

## Lỗi thường gặp

- Dùng string tự do cho suit/rank.
- Quên override equality ở class thường.
- Trả internal mutable list trực tiếp từ deck object.

## Bài tập ngắn

Thêm `displayName()` cho card nhưng không làm thay đổi equality.

## Interview prompt

Vì sao `record Card` thích hợp hơn class mutable trong bài toán này?

## Nguồn

- Transcript bài 201.
- Java 17 API: `Record`, `Enum`, `ArrayList`, `HashSet`.
