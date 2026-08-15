public class SelfCheck {
    private static void check(boolean condition, String message) {
        if (!condition) throw new AssertionError(message);
    }

    public static void main(String[] args) {
        check(Main.processCommands("1 1 2 3 3 0").equals("balance=17;status=17"), "normal");
        check(Main.processCommands("2 3 0").equals("balance=0;status=0"), "no negative");
        check(Main.processCommands("x 1 nope 0 1").equals("balance=10;status=10"), "invalid tokens");
        check(Main.processCommands("").equals("balance=0;status=0"), "empty");
        System.out.println("PASS");
    }
}

