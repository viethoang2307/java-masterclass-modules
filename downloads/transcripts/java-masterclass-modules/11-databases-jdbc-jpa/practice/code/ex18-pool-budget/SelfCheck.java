public class SelfCheck {
    public static void main(String[] args) {
        if (!"SAFE".equals(Main.assess(8, 10)) || !"UNSAFE".equals(Main.assess(12, 10))) throw new AssertionError();
        System.out.println("PASS");
    }
}
