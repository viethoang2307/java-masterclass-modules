public class SelfCheck {
    public static void main(String[] args) {
        if (!"ROLLED_BACK:STOCK".equals(Main.place(false, true))) throw new AssertionError();
        if (!"ROLLED_BACK:PAYMENT".equals(Main.place(true, false))) throw new AssertionError();
        if (!"COMMITTED:OUTBOX".equals(Main.place(true, true))) throw new AssertionError();
        System.out.println("PASS");
    }
}
