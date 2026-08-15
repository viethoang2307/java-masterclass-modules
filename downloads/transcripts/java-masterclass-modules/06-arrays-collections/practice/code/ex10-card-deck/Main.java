import java.util.List;
public class Main {
    enum Suit { CLUB, DIAMOND, HEART, SPADE }
    enum Rank { TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING, ACE }
    record Card(Suit suit, Rank rank) {}
    static List<Card> standardDeck() {
        // TODO: generate every suit/rank combination.
        return List.of();
    }
    static List<Card> shuffle(List<Card> deck, long seed) {
        // TODO: shuffle a mutable copy with seeded Random, then freeze it.
        return deck;
    }
}
