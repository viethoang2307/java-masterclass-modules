import java.util.List;
public class SelfCheck {
    public static void main(String[] args) {
        Main.Theatre theatre = new Main.Theatre(List.of(new Main.Seat('A',1,100), new Main.Seat('A',2,120), new Main.Seat('B',1,90)));
        check(theatre.bookAtOrAfter('A', 2).equals(new Main.Seat('A',2,120)));
        check(theatre.bookAtOrAfter('A', 2).equals(new Main.Seat('B',1,90)) && theatre.availableCount() == 1);
        System.out.println("PASS");
    }
    static void check(boolean ok) { if (!ok) throw new AssertionError(); }
}
