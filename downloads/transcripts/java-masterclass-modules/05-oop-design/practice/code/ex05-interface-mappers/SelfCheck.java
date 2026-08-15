public class SelfCheck {
    private static void check(boolean ok, String message) {
        if (!ok) throw new AssertionError(message);
    }
    public static void main(String[] args) {
        check(Main.mapAll(new Main.User("An"), new Main.Product("Book")).equals("user:An|product:Book"), "mapping");
        check(Main.mapAll().equals(""), "empty");
        check(new Main.User("An").map().equals("user:An"), "user contract");
        System.out.println("PASS");
    }
}

