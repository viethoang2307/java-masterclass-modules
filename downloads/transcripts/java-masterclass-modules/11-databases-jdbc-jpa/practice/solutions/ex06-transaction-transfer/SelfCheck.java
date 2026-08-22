public class SelfCheck {
    public static void main(String[] args) {
        if (!"900:1100".equals(Main.transfer(1000, 1000, 100, false))) throw new AssertionError();
        if (!"1000:1000".equals(Main.transfer(1000, 1000, 100, true))) throw new AssertionError();
        System.out.println("PASS");
    }
}
