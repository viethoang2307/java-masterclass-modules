import java.util.*;

public class SelfCheck {
    private static void check(boolean ok, String message) {
        if (!ok) throw new AssertionError(message);
    }
    public static void main(String[] args) {
        Map<String, java.util.function.Supplier<List<String>>> factories = Main.factories();
        check(factories.get("array").get() instanceof ArrayList, "constructor reference");
        check(Main.lengths(List.of("a", "java")).equals(List.of(1, 4)), "unbound reference");
        List<String> printed = Main.printAndReturn(List.of("x"), ignored -> {});
        check(printed.equals(List.of("x")), "consumer");
        System.out.println("PASS");
    }
}

