public class SelfCheck {
    public static void main(String[] args) {
        if (!"DUPLICATE".equals(Main.classify("23505")) || !"TRANSIENT".equals(Main.classify("40001")) || !"AUTH".equals(Main.classify("28000"))) throw new AssertionError();
        System.out.println("PASS");
    }
}
