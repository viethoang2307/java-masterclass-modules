public class SelfCheck {
    private static void check(boolean ok, String message) {
        if (!ok) throw new AssertionError(message);
    }
    public static void main(String[] args) {
        Main.Config.Builder builder = new Main.Config.Builder().host("api");
        Main.Config config = builder.port(8080).timeoutMs(500).build();
        builder.port(443);
        check(config.port() == 8080 && config.timeoutMs() == 500, "immutable build");
        boolean failed = false;
        try { new Main.Config.Builder().host("api").port(0).build(); }
        catch (IllegalArgumentException expected) { failed = true; }
        check(failed, "port invariant");
        System.out.println("PASS");
    }
}

