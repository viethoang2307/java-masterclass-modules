public class SelfCheck {
    public static void main(String[] args) {
        if (!"ROLLED_BACK".equals(Main.outcome(false, false))) throw new AssertionError();
        if (!"COMMITTED:OUTBOX_PENDING".equals(Main.outcome(true, false))) throw new AssertionError();
        if (!"COMMITTED:PUBLISHED".equals(Main.outcome(true, true))) throw new AssertionError();
        System.out.println("PASS");
    }
}
