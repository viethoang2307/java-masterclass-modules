public class SelfCheck {
    public static void main(String[] args) {
        if (!"CLEAN".equals(Main.state("a|10", "a|10")) || !"DIRTY".equals(Main.state("a|10", "a|11"))) throw new AssertionError();
        System.out.println("PASS");
    }
}
