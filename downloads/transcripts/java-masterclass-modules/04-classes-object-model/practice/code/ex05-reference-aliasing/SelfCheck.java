public class SelfCheck {
    private static void check(boolean ok, String message) {
        if (!ok) throw new AssertionError(message);
    }
    public static void main(String[] args) {
        Main.Box box = new Main.Box(10);
        Main.aliasAndChange(box, 20);
        check(box.value() == 20, "alias mutation");
        Main.Box copy = Main.copyAndChange(box, 30);
        check(box.value() == 20, "original unchanged");
        check(copy.value() == 30, "copy changed");
        check(copy != box, "different identity");
        System.out.println("PASS");
    }
}

