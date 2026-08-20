public class SelfCheck {
    public static void main(String[] args) {
        check(Main.isValidModuleName("com.acme.music"));
        check(Main.isValidModuleName("com.ứng.dụng"));
        check(!Main.isValidModuleName(null));
        check(!Main.isValidModuleName("com..music"));
        check(!Main.isValidModuleName("9music"));
        check(!Main.isValidModuleName("class.app"));
        System.out.println("PASS");
    }
    private static void check(boolean value) { if (!value) throw new AssertionError(); }
}
