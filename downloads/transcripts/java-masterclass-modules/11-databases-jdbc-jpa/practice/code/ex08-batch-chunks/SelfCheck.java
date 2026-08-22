public class SelfCheck {
    public static void main(String[] args) {
        if (Main.batches(0, 500) != 0 || Main.batches(1000, 500) != 2 || Main.batches(1001, 500) != 3) throw new AssertionError();
        System.out.println("PASS");
    }
}
