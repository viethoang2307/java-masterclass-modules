public class SelfCheck {
    private static void check(boolean ok, String message) {
        if (!ok) throw new AssertionError(message);
    }
    public static void main(String[] args) {
        Main.Box<String> box = new Main.Box<>("java");
        check("java".equals(box.get()), "box value");
        Main.Pair<String, Integer> pair = new Main.Pair<>("id", 42);
        Main.Pair<String, Integer> mapped = pair.mapLeft(String::toUpperCase);
        check("ID".equals(mapped.left()) && mapped.right() == 42, "pair map");
        check("java".equals(Main.describe(box)), "wildcard read");
        System.out.println("PASS");
    }
}

