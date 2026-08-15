public class SelfCheck {
    private static void check(boolean ok, String message) {
        if (!ok) throw new AssertionError(message);
    }
    public static void main(String[] args) {
        Main.UserId a = new Main.UserId(" A1 ");
        Main.UserId b = new Main.UserId("A1");
        Main.UserId c = new Main.UserId("B1");
        check(a.equals(b), "same value");
        check(a.hashCode() == b.hashCode(), "hash");
        check(!a.equals(c), "different");
        check(a.toString().equals("UserId[A1]"), "toString");
        check(!a.equals(null), "null");
        System.out.println("PASS");
    }
}

