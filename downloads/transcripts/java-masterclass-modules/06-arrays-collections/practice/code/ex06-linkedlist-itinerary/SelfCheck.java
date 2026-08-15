import java.util.LinkedList;
import java.util.List;
public class SelfCheck {
    public static void main(String[] args) {
        LinkedList<String> route = new LinkedList<>(List.of("Da Nang", "Hue"));
        check(Main.insertOrdered(route, " Hanoi "));
        check(route.equals(List.of("Da Nang", "Hanoi", "Hue")));
        check(!Main.insertOrdered(route, "hUE"));
        System.out.println("PASS");
    }
    static void check(boolean ok) { if (!ok) throw new AssertionError(); }
}
