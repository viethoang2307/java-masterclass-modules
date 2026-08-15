import java.util.HashSet;
import java.util.List;
public class SelfCheck {
    public static void main(String[] args) {
        List<Main.Card> deck = Main.standardDeck();
        check(deck.size() == 52 && new HashSet<>(deck).size() == 52);
        List<Main.Card> a = Main.shuffle(deck, 17), b = Main.shuffle(deck, 17);
        check(a.equals(b) && !a.equals(deck) && new HashSet<>(a).equals(new HashSet<>(deck)));
        System.out.println("PASS");
    }
    static void check(boolean ok) { if (!ok) throw new AssertionError(); }
}
