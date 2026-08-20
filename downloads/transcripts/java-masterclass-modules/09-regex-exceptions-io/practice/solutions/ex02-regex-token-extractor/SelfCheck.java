public class SelfCheck {
    static void check(boolean ok, String message) { if (!ok) throw new AssertionError(message); }
    public static void main(String[] args) {
        var result = Main.extract("ID AB-12 and CD-7");
        check(result.size() == 2, "count");
        check(result.get(0).value().equals("AB-12"), "value");
        check(result.get(0).start() == 3 && result.get(0).end() == 8, "offset");
        check(Main.extract("none").isEmpty(), "empty");
        System.out.println("PASS");
    }
}

