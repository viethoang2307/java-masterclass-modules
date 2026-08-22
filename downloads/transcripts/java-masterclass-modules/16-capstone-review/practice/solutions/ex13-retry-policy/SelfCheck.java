import java.util.List;

public class SelfCheck {
    public static void main(String[] args) {
        check(Main.execute(List.of("timeout", "server", "ok"), 3).equals("success@3"));
        check(Main.execute(List.of("timeout", "ok"), 1).equals("retry-exhausted"));
        check(Main.execute(List.of("timeout", "cancel", "ok"), 3).equals("cancelled"));
        check(Main.execute(List.of("auth"), 3).equals("non-retryable"));
        System.out.println("PASS");
    }
    private static void check(boolean value) { if (!value) throw new AssertionError(); }
}
