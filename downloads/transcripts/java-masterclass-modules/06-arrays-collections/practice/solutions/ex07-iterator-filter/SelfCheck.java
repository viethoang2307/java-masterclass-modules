import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class SelfCheck {
    public static void main(String[] args) {
        List<String> values = new ArrayList<>(Arrays.asList("Java", " ", null, "#tag", "17"));
        check(Main.removeInvalid(values) == 3);
        check(values.equals(List.of("Java", "17")));
        System.out.println("PASS");
    }
    static void check(boolean ok) { if (!ok) throw new AssertionError(); }
}
