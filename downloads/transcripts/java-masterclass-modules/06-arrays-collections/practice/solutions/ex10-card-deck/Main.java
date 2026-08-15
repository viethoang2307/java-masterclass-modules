import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
public class Main {
    enum Suit { CLUB, DIAMOND, HEART, SPADE }
    enum Rank { TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING, ACE }
    record Card(Suit suit, Rank rank) {}
    static List<Card> standardDeck() {
        List<Card> deck = new ArrayList<>(52);
        for (Suit suit : Suit.values()) for (Rank rank : Rank.values()) deck.add(new Card(suit, rank));
        return List.copyOf(deck);
    }
    static List<Card> shuffle(List<Card> deck, long seed) {
        if (deck == null || deck.stream().anyMatch(java.util.Objects::isNull)) throw new IllegalArgumentException("invalid deck");
        List<Card> copy = new ArrayList<>(deck);
        Collections.shuffle(copy, new Random(seed));
        return List.copyOf(copy);
    }
}
