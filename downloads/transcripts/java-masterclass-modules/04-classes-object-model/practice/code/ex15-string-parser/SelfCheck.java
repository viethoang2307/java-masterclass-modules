public class SelfCheck {
    private static void check(boolean ok, String message) {
        if (!ok) throw new AssertionError(message);
    }
    public static void main(String[] args) {
        check(Main.parseKeyValue(" name = An ", "name").equals("An"), "normal");
        check(Main.parseKeyValue("name=A=B", "name").equals("A=B"), "first separator");
        check(Main.parseKeyValue("age=20", "name") == null, "wrong key");
        check(Main.parseKeyValue("name=", "name") == null, "blank value");
        check(Main.parseKeyValue("name", "name") == null, "missing separator");
        check(Main.parseKeyValue(null, "name") == null, "null");
        System.out.println("PASS");
    }
}

