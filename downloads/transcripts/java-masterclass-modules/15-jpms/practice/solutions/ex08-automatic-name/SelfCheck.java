public class SelfCheck {
    public static void main(String[] args) {
        check(Main.automaticModuleName("music-core-1.2.0.jar").equals("music.core"));
        check(Main.automaticModuleName("legacy_utils-3.jar").equals("legacy.utils"));
        check(Main.automaticModuleName("plain.jar").equals("plain"));
        check(Main.automaticModuleName("plain.zip").isEmpty());
        System.out.println("PASS");
    }
    private static void check(boolean value) { if (!value) throw new AssertionError(); }
}
