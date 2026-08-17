import java.util.*;

public class SelfCheck {
    private static void check(boolean ok, String message) {
        if (!ok) throw new AssertionError(message);
    }
    public static void main(String[] args) {
        check(Main.validate("alice").isEmpty(), "valid");
        check(Main.validate("ab").equals(List.of("min-length")), "short");
        check(Main.validate(" ").equals(List.of("required", "min-length")), "blank");
        check(Main.validate(null).equals(List.of("required", "min-length")), "null");
        System.out.println("PASS");
    }
}

