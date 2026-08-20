public class SelfCheck {
    public static void main(String[] args) {
        if (!"ADD->DUAL_WRITE->BACKFILL->ENFORCE->REMOVE".equals(Main.plan())) throw new AssertionError();
        System.out.println("PASS");
    }
}
