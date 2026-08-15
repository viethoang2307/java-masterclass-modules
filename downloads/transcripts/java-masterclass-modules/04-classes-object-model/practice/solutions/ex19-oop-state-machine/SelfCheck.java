public class SelfCheck {
    private static void check(boolean ok, String message) {
        if (!ok) throw new AssertionError(message);
    }
    public static void main(String[] args) {
        check(Main.run("open,close,lock,unlock,open").equals("state=OPEN;accepted=5"), "normal");
        check(Main.run("open,lock,close").equals("state=CLOSED;accepted=2"), "invalid transition");
        check(Main.run("lock,unlock").equals("state=CLOSED;accepted=2"), "lock cycle");
        check(Main.run("bad").equals("state=CLOSED;accepted=0"), "invalid command");
        check(Main.run(null).equals("state=CLOSED;accepted=0"), "null");
        System.out.println("PASS");
    }
}
