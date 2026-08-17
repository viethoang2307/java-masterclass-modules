import java.util.*;

public class SelfCheck {
    private static void check(boolean ok, String message) {
        if (!ok) throw new AssertionError(message);
    }
    public static void main(String[] args) {
        Main.User good = new Main.User("good", true, 21, "good@example");
        Main.User inactive = new Main.User("inactive", false, 30, "i@example");
        Main.User young = new Main.User("young", true, 15, "y@example");
        Main.User badMail = new Main.User("bad", true, 30, "bad");
        List<Main.User> result = Main.eligible(Arrays.asList(good, null, inactive, young, badMail), 18);
        check(result.equals(List.of(good)), "predicate pipeline");
        System.out.println("PASS");
    }
}

