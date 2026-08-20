public class SelfCheck {
    public static void main(String[] args) {
        check(Main.runCommand("C:\\Build Output\\mods", "com.acme.app", "com.acme.app.Main").equals("java --module-path \"C:\\Build Output\\mods\" -m com.acme.app/com.acme.app.Main"));
        expectFailure(() -> Main.runCommand("", "app", "Main"));
        System.out.println("PASS");
    }
    private static void check(boolean value) { if (!value) throw new AssertionError(); }
    private static void expectFailure(Runnable action) { try { action.run(); throw new AssertionError(); } catch (IllegalArgumentException expected) { } }
}
