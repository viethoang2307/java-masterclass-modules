public class SelfCheck {
    public static void main(String[] args) {
        check(Main.classify(200).equals("success"));
        check(Main.classify(429).equals("retryable"));
        check(Main.classify(503).equals("retryable"));
        check(Main.classify(401).equals("client-error"));
        check(Main.classify(302).equals("unknown"));
        System.out.println("PASS");
    }
    private static void check(boolean value) { if (!value) throw new AssertionError(); }
}
