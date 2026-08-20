public class SelfCheck {
    public static void main(String[] args) {
        if (!"{call reserve_stock(?, ?, ?)}".equals(Main.call())) throw new AssertionError();
        System.out.println("PASS");
    }
}
